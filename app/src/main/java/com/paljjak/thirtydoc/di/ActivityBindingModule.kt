package com.paljjak.thirtydoc.di

import com.paljjak.thirtydoc.intro.IntroActivity
import com.paljjak.thirtydoc.intro.IntroModule
import com.paljjak.thirtydoc.quiz.QuizActivity
import com.paljjak.thirtydoc.quiz.QuizModule
import com.paljjak.thirtydoc.splash.SplashActivity
import com.paljjak.thirtydoc.splash.SplashModule
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