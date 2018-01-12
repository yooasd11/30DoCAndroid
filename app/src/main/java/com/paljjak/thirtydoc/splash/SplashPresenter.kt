package com.paljjak.thirtydoc.splash

import android.content.SharedPreferences
import com.paljjak.thirtydoc.data.source.remote.NetworkService
import com.paljjak.thirtydoc.di.PerActivity
import com.paljjak.thirtydoc.util.Constants
import com.paljjak.thirtydoc.util.IdGenerator
import javax.inject.Inject

/**
 * Created by yooas on 2018-01-11.
 */

@PerActivity
class SplashPresenter @Inject constructor(): SplashContract.Presenter {
    @Inject
    lateinit var mSplashView: SplashContract.View

    @Inject
    lateinit var mNetworkService: NetworkService

    @Inject
    lateinit var mSharePref: SharedPreferences

    override fun printInitialText() {
        mSplashView.printText("SPLASH")
    }

    override fun logIn() {
        // Request log in to network module
        var id = mSharePref.getString(Constants.PREF_MOBILE_ID_KEY, "")
        if (id.isEmpty()) {
            requestRegisteringWithGeneratedId()
        }
        else {
            if (mNetworkService.logIn(id)) {
                mSplashView.printText("Logged in by ID : $id")
            } else {
                mSplashView.printText("Login failed for some reason")
            }
        }
    }

    override fun requestRegisteringWithGeneratedId() {
        while (true) {
            var id = IdGenerator.createRandomId()
            if (mNetworkService.logIn(id)) {
                mSplashView.printText("Logged in by ID : $id")
                break
            }
        }
    }
}