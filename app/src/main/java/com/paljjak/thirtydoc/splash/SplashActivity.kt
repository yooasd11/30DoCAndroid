package com.paljjak.thirtydoc.splash

import android.content.SharedPreferences
import android.os.Bundle
import com.paljjak.thirtydoc.R
import com.paljjak.thirtydoc.util.Constants
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

/**
 * Created by yooas on 2018-01-11.
 */
class SplashActivity: DaggerAppCompatActivity(), SplashContract.View {
    @Inject
    lateinit var mSplashPresenter: SplashPresenter

    @Inject
    lateinit var mSharePref: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mSplashPresenter.takeView(this)
        mSplashPresenter.printInitialText()

        var mobileId = mSharePref.getString(Constants.PREF_MOBILE_ID_KEY, "")

        if (mobileId.isEmpty()) {
            mSplashPresenter.requestRegisteringWithGeneratedId()
            mobileId = mSharePref.getString(Constants.PREF_MOBILE_ID_KEY, "")
        } else {
            mSplashPresenter.logIn(mobileId)
        }
    }

    override fun putIdIntoPref(id: String) {
        mSharePref.edit().putString(Constants.PREF_MOBILE_ID_KEY, id).apply()
    }

    override fun getMobileIdFromPref(): String = mSharePref.getString(Constants.PREF_MOBILE_ID_KEY, "")

    override fun printText(text: String) {
        id_textview.text = text
    }
}