package com.paljjak.thirtydoc.activities.quiz

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.paljjak.thirtydoc.R

/**
 * Created by yooas on 2018-01-16.
 */
class QuizFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup, savedInstanceState: Bundle): View {
        return inflater.inflate(R.layout.fragment_quiz, container)
    }
}