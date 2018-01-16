package com.paljjak.thirtydoc.activities.splash

import android.os.Bundle
import com.paljjak.thirtydoc.R
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_splash.*
import javax.inject.Inject
import android.content.Intent
import android.content.SharedPreferences
import com.paljjak.thirtydoc.activities.intro.IntroActivity
import com.paljjak.thirtydoc.util.Constants


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
        setContentView(R.layout.activity_splash)

        mSplashPresenter.printInitialText()
        mSplashPresenter.logIn(mSharePref.getString(Constants.PREF_MOBILE_ID_KEY, ""))
    }

    override fun printText(text: String) {
        id_textview.text = text
    }

    override fun goToQuizActivity() {
        val intent = Intent(this@SplashActivity, IntroActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun goToChatActivity() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun somethingIsWrong() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}