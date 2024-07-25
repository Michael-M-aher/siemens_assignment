package healthcare_managment;

import java.time.LocalDateTime;

public class Admin extends User {
    public Admin(String id, String name, String email, String password, String phone, String address, LocalDateTime createdAt) {
        super(id, name, email, password, phone, address, createdAt);
    }

    public void manageUsers() {
        System.out.println("Managing users.");
        for (User user : User.getUsers()) {
            System.out.println("User: " + user.name + ", Email: " + user.email);
        }
    }
}
