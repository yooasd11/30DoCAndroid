package com.paljjak.thirtydoc.intro

import com.paljjak.thirtydoc.BasePresenter
import com.paljjak.thirtydoc.BaseView

/**
 * Created by jaeyoonyoo on 2018. 1. 12..
 */

interface IntroContract {
    interface Presenter: BasePresenter<View> {

    }

    interface View: BaseView<Presenter> {

    }
}