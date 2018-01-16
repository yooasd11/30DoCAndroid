package com.paljjak.thirtydoc.activities.quiz

import android.os.Bundle
import com.paljjak.thirtydoc.R
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_splash.*
import javax.inject.Inject

class QuizActivity : DaggerAppCompatActivity(), QuizContract.View {
    @Inject
    lateinit var mQuizPresenter: QuizPresenter

    override fun printDescriptionWithNumber(numberOfQuestions: Int) {
        id_textview.text = String.format(getString(R.string.quiz_description), numberOfQuestions)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        mQuizPresenter.printInitialText()
    }
}
