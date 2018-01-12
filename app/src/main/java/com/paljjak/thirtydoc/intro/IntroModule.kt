package com.paljjak.thirtydoc.intro

import com.paljjak.thirtydoc.di.PerActivity
import dagger.Binds
import dagger.Module

/**
 * Created by jaeyoonyoo on 2018. 1. 12..
 */

@Module
abstract class IntroModule {
    @Binds
    abstract fun view(introActivity: IntroActivity): IntroContract.View

    @PerActivity
    @Binds
    abstract fun presenter(introPresenter: IntroPresenter): IntroContract.Presenter
}