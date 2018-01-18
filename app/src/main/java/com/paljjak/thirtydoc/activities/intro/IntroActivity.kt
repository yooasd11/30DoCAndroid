package com.paljjak.thirtydoc.activities.intro

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.paljjak.thirtydoc.R
import com.paljjak.thirtydoc.activities.quiz.QuizActivity
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_intro.*
import javax.inject.Inject

/**
 * Created by jaeyoonyoo on 2018. 1. 12..
 */

class IntroActivity: DaggerAppCompatActivity(), IntroContract.View, View.OnClickListener{
    @Inject
    lateinit var mIntroPresenter: IntroPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        id_start_button.setOnClickListener(this)
        id_create_mine_text.setOnClickListener(this)
        mIntroPresenter.mIntroView
    }

    override fun onClick(p0: View) {
        when (p0.id){
            R.id.id_start_button -> {
                val intent = Intent(this@IntroActivity, QuizActivity::class.java)
                startActivity(intent)
            }
            R.id.id_create_mine_text -> {
                // go to create my question
            }
        }

    }
}
