package com.paljjak.thirtydoc.di

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module

/**
 * Created by yooas on 2018-01-07.
 */
@Module
abstract class AppModule {
    @Binds
    internal abstract fun bindContext(application: Application): Context
}