package com.anelcc.mvp.app;

import com.anelcc.mvp.MainActivity;

import javax.inject.Singleton;

import dagger.Component;
/*
 * We need to create an application component where dagger knows where to inject dependency to.
 * In Dagger2 injected class called components. These components assign references in our activity,
 * services, and fragments to have access to the singleton which we are already defined.
 * */

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(MainActivity target);
}
