package com.paljjak.thirtydoc.activities.splash

import android.os.Bundle
import android.os.Handler
import com.paljjak.thirtydoc.R
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_splash.*
import javax.inject.Inject
import android.content.Intent
import android.view.animation.AnimationUtils
import com.paljjak.thirtydoc.activities.intro.IntroActivity
import android.view.animation.Animation
import android.view.animation.Animation.AnimationListener




/**
 * Created by yooas on 2018-01-11.
 */
class SplashActivity: DaggerAppCompatActivity(), SplashContract.View {
    @Inject
    lateinit var mSplashPresenter: SplashPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        mSplashPresenter.printInitialText()
        mSplashPresenter.logIn()

        val fadeInAnim = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        fadeInAnim.setAnimationListener(object : AnimationListener {

            override fun onAnimationStart(animation: Animation) {}


            override fun onAnimationRepeat(animation: Animation) {}


            override fun onAnimationEnd(animation: Animation) {
                val intent = Intent(this@SplashActivity, IntroActivity::class.java)
                startActivity(intent)
                finish()
            }
        })

        id_textview.startAnimation(fadeInAnim)
    }

    override fun printText(text: String) {
        id_textview.text = text
    }
}