package com.paljjak.thirtydoc.activities.splash

import com.paljjak.thirtydoc.di.PerActivity
import dagger.Binds
import dagger.Module

/**
 * Created by yooas on 2018-01-11.
 */
@Module
abstract class SplashModule {
    @Binds
    abstract fun view(splashActivity: SplashActivity): SplashContract.View

    @PerActivity
    @Binds
    abstract fun presenter(splashPresenter: SplashPresenter): SplashContract.Presenter
}