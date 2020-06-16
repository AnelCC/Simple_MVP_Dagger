package com.anelcc.mvp.login;


import dagger.Module;
import dagger.Provides;

/*
Modules are a way of telling Dagger how to provide dependencies from the dependency graph.
These are typically high level dependencies that you aren’t already contributing to
the dependency graph through the @Inject constructor annotation.
Modules are just pieces of code that describe HOW you want to build your dependencies.
Modules in Dagger 2 are defined as classes with a @Module annotation.
*/
@Module
public class LoginModule {

    /*
    The LoginActivityPresenter needs a model in its constructor – which we will pass right here.
    Then we create another provider method which returns an instance of LoginActivityMVP.Model,
    this will instruct dagger that if LoginActivityMVP.Model is requested then how to construct it.
    */
    @Provides
    public LoginActivityMVP.Presenter provideLoginActivityPresenter(LoginActivityMVP.Model model){
        return new LoginActivityPresenter(model);
    }

    /*
     We write another method with a @provides annotation.
     And this method provides instance of loginRepository;
     we will call this method provideLoginRepository()
   */
    @Provides
    public LoginActivityMVP.Model provideLoginActivityModel(LoginRepository repository){
        return new LoginModel(repository);
    }

    /*
    * And this will return a new MemoryRepository() */
    @Provides
    public LoginRepository provideLoginRepository(){
        return new MemoryRepository();
    }
}
