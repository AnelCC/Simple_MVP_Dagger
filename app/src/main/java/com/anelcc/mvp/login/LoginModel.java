package com.anelcc.mvp.login;

//Use to request to the repository
/*
Here let’s implement the LoginActivityMVP.Model interface and also implement the methods defined by the contract.
*/
public class LoginModel implements LoginActivityMVP.Model {
    private LoginRepository repository;

    public LoginModel(LoginRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createUser(String name, String lastName) {
        repository.saveUser(new User(name, lastName));
    }

    @Override
    public User getUser() {
        return repository.getUser();
    }
}
