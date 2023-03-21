package hr.algebra.daggervjezba.root

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class App : Application(), HasAndroidInjector {
    @Inject lateinit var activityInjector: DispatchingAndroidInjector< Any >


    override fun onCreate() {
        super.onCreate()
        DaggerApplicationComponent
            .create()
            .inject(this )
    }

    override fun androidInjector( ): AndroidInjector< Any > {
        return activityInjector
    }
}