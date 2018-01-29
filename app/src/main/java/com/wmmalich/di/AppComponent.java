package com.wmmalich.di;

import com.wmmalich.App;
import com.wmmalich.view.ScrollFragment;
import com.wmmalich.viewmodel.ScrollVO;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ViewModule.class, ModelModule.class})

public interface AppComponent {

    void inject(App app);

    void inject(ScrollVO scrollVO);

    void inject(ScrollFragment scrollFragment);
}
