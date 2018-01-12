package com.paljjak.thirtydoc.quiz

import com.paljjak.thirtydoc.di.PerActivity
import javax.inject.Inject

/**
 * Created by yooas on 2018-01-07.
 */
@PerActivity
class QuizPresenter @Inject constructor(): QuizContract.Presenter {
    @Inject
    lateinit var mQuizView: QuizContract.View

    override fun printInitialText() {
        mQuizView.printText("QUIZ")
    }
}
