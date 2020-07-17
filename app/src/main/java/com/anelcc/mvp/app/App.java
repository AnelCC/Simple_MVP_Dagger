package com.anelcc.mvp.app;
/*
You are seeing we will overriding onCreate methods here,
where will be the component will be instantiated by dagger.
We also defined public getComponent() methods which will return AppComponent instance.
You notice these methods is highlighted with red with some compilation error.

We need to define an application object,
where dagger will live through-out the entire life spends in the application.
We should do all this job within the application class since the instead declared only once.
Just create a class that extends application components and add below code.
*/

import android.app.Application;

import com.anelcc.mvp.login.LoginModule;

import dagger.Module;

//This is where dagger keep will keep track of the dependencies.
@Module
public class App extends Application {
    private AppComponent component;
    @Override
    public void onCreate() {
        super.onCreate();
        //we should add each module here
        component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .loginModule(new LoginModule())
                .build();
    }
    public AppComponent getComponent() {
        return component;
    }
}