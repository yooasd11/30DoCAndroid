package com.paljjak.thirtydoc.di

import com.paljjak.thirtydoc.activities.intro.IntroActivity
import com.paljjak.thirtydoc.activities.intro.IntroModule
import com.paljjak.thirtydoc.activities.quiz.QuizActivity
import com.paljjak.thirtydoc.activities.quiz.QuizModule
import com.paljjak.thirtydoc.activities.splash.SplashActivity
import com.paljjak.thirtydoc.activities.splash.SplashModule
import dagger.Module
import dagger.android.AndroidInjectionModule
import dagger.android.ContributesAndroidInjector

/**
 * Created by yooas on 2018-01-07.
 */
@Module(includes = [AndroidInjectionModule::class])
abstract class ActivityBindingModule {
    @PerActivity
    @ContributesAndroidInjector(modules = [QuizModule::class])
    abstract fun quizActivity(): QuizActivity

    @PerActivity
    @ContributesAndroidInjector(modules = [SplashModule::class])
    abstract fun splashActivity(): SplashActivity

    @PerActivity
    @ContributesAndroidInjector(modules = [IntroModule::class])
    abstract fun introActivity(): IntroActivity
}