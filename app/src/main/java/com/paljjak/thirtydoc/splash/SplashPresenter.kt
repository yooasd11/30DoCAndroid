package com.paljjak.thirtydoc.splash

import com.paljjak.thirtydoc.di.PerActivity
import com.paljjak.thirtydoc.util.IdGenerator
import javax.inject.Inject

/**
 * Created by yooas on 2018-01-11.
 */

@PerActivity
class SplashPresenter @Inject constructor(): SplashContract.Presenter {
    @Inject
    lateinit var mSplashView: SplashContract.View

    override fun printInitialText() {
        mSplashView.printText("SPLASH")
    }

    override fun logIn(id: String): Boolean {
        // Request log in to network module
        mSplashView.printText(id)
        return true
    }

    override fun requestRegisteringWithGeneratedId() {
        while (true) {
            var id = IdGenerator.createRandomId()
            if (logIn(id)) {
                mSplashView.putIdIntoPref(id)
                break
            }
        }
    }

    override fun takeView(view: SplashContract.View) {
        mSplashView = view
    }
}