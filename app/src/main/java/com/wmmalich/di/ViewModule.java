package com.wmmalich.di;

import com.wmmalich.viewmodel.ScrollVO;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
class ViewModule {

    @Provides
    @Singleton
    ScrollVO provideScrollVO() { return new ScrollVO();
    }
}
