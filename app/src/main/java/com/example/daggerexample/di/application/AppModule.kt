package com.example.daggerexample.di.application

import android.content.Context
import dagger.Module
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Scheduler
import javax.inject.Named
import javax.inject.Singleton

@Module
class AppModule constructor(context : Context) {

    @Singleton
    @Named(SCHEDULER_MAIN_THREAD)
    fun providerSchedulerMainThread() : Scheduler = AndroidSchedulers.mainThread()
}