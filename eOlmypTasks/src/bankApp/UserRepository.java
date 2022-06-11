package bankApp;

public class UserRepository {

    private static int count = 0;
    public static User[] users = new User[100];

    public static void addUser(User user){
        users[count] = user;
        count++;
    }
}
