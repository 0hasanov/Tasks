package metaVerse.userSignUP;

import java.util.Arrays;
public class UserRepository {
    public static User[] users = new User[1];

    public static void addUser(User user) {
        User[] newUsers = Arrays.copyOf(users, users.length + 1);
        newUsers[users.length] = user;
        users = newUsers;
        System.out.println("New user added");
    }
}