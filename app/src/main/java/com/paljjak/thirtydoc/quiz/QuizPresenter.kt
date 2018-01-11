package com.paljjak.thirtydoc.quiz

import com.paljjak.thirtydoc.di.PerActivity
import javax.inject.Inject

/**
 * Created by yooas on 2018-01-07.
 */
@PerActivity
class QuizPresenter @Inject constructor(): QuizContract.Presenter {
    private var mQuizView: QuizContract.View? = null

    override fun takeView(view: QuizContract.View) {
        this.mQuizView = view
    }
    override fun printInitialText() {
        mQuizView!!.printText("Hello world from presenter")
    }
}
