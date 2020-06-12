package com.anelcc.mvp.login;

public interface LoginRepository {
    //return the user
    User getUser();

    //save the user in memory
    void saveUser(User user);
}
