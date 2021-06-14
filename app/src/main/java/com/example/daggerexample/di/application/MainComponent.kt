package com.example.daggerexample.di.application

import com.example.daggerexample.di.data.DataModule
import com.example.daggerexample.di.network.NetWorkModule
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

const val SCHEDULER_MAIN_THREAD = "mainThread"
const val SCHEDULER_IO = "io"

@Singleton
@Component(
    modules = [
        (AppModule::class),
        (NetWorkModule::class),
        (DataModule::class),
        (AndroidSupportInjectionModule::class)
    ]
)

interface MainComponent {
//    fun plus(popularMoviesModule: PopularMoviesModule): PopularSubComponent
//    fun plus(favoriteMoviesModule: FavoriteModule): FavoritesSubComponent
//    fun plus(movieDetailsModule: MovieDetailsModule): MovieDetailsSubComponent


}
