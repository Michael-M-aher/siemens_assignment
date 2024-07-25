package healthcare_managment;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class User {
    protected String id;
    protected String name;
    protected String email;
    protected String password;
    protected String phone;
    protected String address;
    protected LocalDateTime createdAt;

    private static List<User> users = new ArrayList<>();

    public User(String id, String name, String email, String password, String phone, String address, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.createdAt = createdAt;
    }

    public void login() {
        // Dummy login functionality
        System.out.println(name + " logged in.");
    }

    public void logout() {
        // Dummy logout functionality
        System.out.println(name + " logged out.");
    }

    public void register() {
        // Add this user to the list
        users.add(this);
        System.out.println(name + " registered.");
    }

    public void resetPassword() {
        // Dummy reset password functionality
        System.out.println(name + " reset their password.");
    }

    public static User findUserById(String userId) {
        for (User user : users) {
            if (user.id.equals(userId)) {
                return user;
            }
        }
        return null;
    }

    public static List<User> getUsers() {
        return users;
    }
}
