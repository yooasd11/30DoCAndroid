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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mSplashPresenter.takeView(this)
        mSplashPresenter.printInitialText()

        mSplashPresenter.logIn()
    }

    override fun printText(text: String) {
        id_textview.text = text
    }
}