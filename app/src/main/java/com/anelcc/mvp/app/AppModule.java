package com.anelcc.mvp.app;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/*
The methods that exposed the available return type should also be annotated with @Provides decorators.
The @Singleton annotation also signals to Dagger compiler that the instance should be created only
 once in the application. For example, we are specifying the context that uses singleton annotations
 that can be part of the dependency list.


 Dependency injection is a technique whereby one object supplies the dependencies of another object.
 A dependency is an object that can be used (a service).
 An injection is the passing of a dependency to a dependent object (a client) that would use it.

 The service is made part of the client’s state.
 Passing the service to the client, rather than allowing a client to build or find the service.
*/

//This is where dagger keep will keep track of the dependencies.
@Module
public class AppModule {
    private Application application;
    public AppModule(Application application) {
        this.application = application;
    }
    @Provides
    @Singleton
    public Context provideContext() {
        return application;
    }
}