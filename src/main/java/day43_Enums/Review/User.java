package day43_Enums.Review;

import java.util.List;

public class User {

    public String username, firstName, lastName;

    public Role role;

    //public List<Role> roleList;
    // List<String> rolelist = "Admin", "Manager", "Employee";


    public User(String username, String firstName, String lastName, Role role) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role=" + role +
                '}';
    }
}
