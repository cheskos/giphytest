package com.evite.giphytest.di;

import com.evite.giphytest.ui.search.MainActivity;
import com.evite.giphytest.ui.search.MainModule;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivitiesModule {

    @ActivityScope @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity mainActivity();
}
