package HW_3;

public class User {
    private String username;
    private boolean isAdmin;
    private boolean isLoggedIn;

    public User(String username, boolean isAdmin) {
        this.username = username;
        this.isAdmin = isAdmin;
        this.isLoggedIn = true;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void logout() {
        isLoggedIn = false;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }
}

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> users;

    public UserRepository() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void logoutNonAdminUsers() {
        for (User user : users) {
            if (!user.isAdmin()) {
                user.logout();
            }
        }
    }
}
