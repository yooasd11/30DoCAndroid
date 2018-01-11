package com.paljjak.thirtydoc.main

import com.paljjak.thirtydoc.di.PerActivity
import javax.inject.Inject

/**
 * Created by yooas on 2018-01-07.
 */
@PerActivity
class MainPresenter @Inject constructor(): MainContract.Presenter {
    private var mMainView: MainContract.View? = null

    override fun takeView(view: MainContract.View) {
        this.mMainView = view
    }

    override fun dropView() {
        mMainView = null
    }

    override fun printInitialText() {
        mMainView!!.printText("Hello world from presenter")
    }
}
