package com.wmmalich.di;

import com.wmmalich.model.DataFactory;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
class ModelModule {

    @Provides
    @Singleton
    DataFactory provideDataFactory() {
        return new DataFactory();
    }
}
