package hr.algebra.daggervjezba.root

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.ContributesAndroidInjector
import hr.algebra.daggervjezba.MainActivity
import hr.algebra.daggervjezba.MojaKlasa
import javax.inject.Singleton


@Singleton
@Component(modules = arrayOf(
    AndroidInjectionModule::class,
    ActivityBuilder::class,
    ApplicationModule::class
))
interface ApplicationComponent : AndroidInjector<Application> {
    fun inject( app: App )
}

@Module
class ApplicationModule {
    @Provides
    @Singleton
    fun providesCommonStuff() = "Neki text"
}
@Module
class MainActivityModule {
    @Provides
    fun provideMojaKlasa( activity: MainActivity ): MojaKlasa = MojaKlasa( activity )
}
@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    abstract fun fdsaasdf() : MainActivity
}