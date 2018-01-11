package com.paljjak.thirtydoc.splash

import com.paljjak.thirtydoc.BasePresenter
import com.paljjak.thirtydoc.BaseView

/**
 * Created by yooas on 2018-01-11.
 */
interface SplashContract {
    interface View: BaseView<Presenter> {
        fun printText(text: String)
    }

    interface Presenter: BasePresenter<View> {
        fun printInitialText()
        fun logIn()
        fun requestRegisteringWithGeneratedId()
    }
}