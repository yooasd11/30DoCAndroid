package com.paljjak.thirtydoc.main

import com.paljjak.thirtydoc.BasePresenter
import com.paljjak.thirtydoc.BaseView

/**
 * Created by yooas on 2018-01-07.
 */
interface MainContract {
    interface View: BaseView<Presenter> {
        fun printText(text: String)
    }

    interface Presenter: BasePresenter<View> {
        fun printInitialText()
    }
}