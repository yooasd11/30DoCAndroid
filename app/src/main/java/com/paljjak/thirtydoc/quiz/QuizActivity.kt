package com.paljjak.thirtydoc.quiz

import android.os.Bundle
import com.paljjak.thirtydoc.R
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_splash.*
import javax.inject.Inject

class QuizActivity : DaggerAppCompatActivity(), QuizContract.View {
    @Inject
    lateinit var mQuizPresenter: QuizPresenter

    override fun printText(text: String) {
        id_textview.text = text
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        mQuizPresenter.printInitialText()
    }
}
