package com.paljjak.thirtydoc.main

import com.paljjak.thirtydoc.di.PerActivity
import dagger.Binds
import dagger.Module

/**
 * Created by yooas on 2018-01-07.
 */
@Module
abstract class MainModule {
    @Binds
    abstract fun view(mainActivity: MainActivity): MainContract.View

    @PerActivity
    @Binds
    abstract fun presenter(mainPresenter: MainPresenter): MainContract.Presenter
}