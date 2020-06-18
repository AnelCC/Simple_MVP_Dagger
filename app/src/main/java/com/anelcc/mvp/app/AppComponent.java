package com.anelcc.mvp.app;

import com.anelcc.mvp.MainActivity;
import com.anelcc.mvp.login.LoginModule;

import javax.inject.Singleton;

import dagger.Component;
/*
 * We need to create an application component where dagger knows where to inject dependency to.
 * In Dagger2 injected class called components. These components assign references in our activity,
 * services, and fragments to have access to the singleton which we are already defined.
 *
 * because we are only accessing Module.class via our @Component annotation we also need to
 * add the another Module.class to the list of modules. Eg. {Module1.class, Module2.class}
 */

@Singleton
@Component(modules = {AppModule.class, LoginModule.class})
public interface AppComponent {
    void inject(MainActivity target);
}
