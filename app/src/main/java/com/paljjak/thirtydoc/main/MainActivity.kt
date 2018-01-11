package com.paljjak.thirtydoc.main

import android.os.Bundle
import com.paljjak.thirtydoc.R
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity(), MainContract.View {
    override fun printText(text: String) {
        id_textview.text = text
    }

    @Inject
    lateinit var mMainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mMainPresenter.takeView(this)
        mMainPresenter.printInitialText()
    }
}
