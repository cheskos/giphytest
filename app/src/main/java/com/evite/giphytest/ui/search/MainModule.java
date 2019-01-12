package com.evite.giphytest.ui.search;

import com.evite.giphytest.repositories.GifsRepo;
import dagger.Module;
import dagger.Provides;
import org.jetbrains.annotations.NotNull;

@Module
public abstract class MainModule {

    @Provides static MainContract.View provideView(MainActivity activity) {
        return activity;
    }

    @Provides @NotNull static MainPresenter provideMainPresenter(GifsRepo repo, MainContract.View view) {
        return new MainPresenter(repo, view);
    }
}
