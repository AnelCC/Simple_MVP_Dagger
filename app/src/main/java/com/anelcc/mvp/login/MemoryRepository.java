package com.anelcc.mvp.login;

// the repository implementation can coming from different cases in this we are using
/*
In the MemoryRepository we create a private field holding a user reference
*/
public class MemoryRepository implements LoginRepository {
    private User user;

    @Override
    public User getUser() {
        if (user == null) {
            User user = new User("Anel", "Elizabeth");
            user.setId(0);
            return user;
        } else {
            return user;
        }
    }

    @Override
    public void saveUser(User user) {
        if (user == null) {
            user = getUser();
        }
        this.user = user;
    }
}
