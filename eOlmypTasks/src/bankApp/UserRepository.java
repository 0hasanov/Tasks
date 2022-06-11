package bankApp;

import java.util.Arrays;

public class UserRepository {

    //private static int count = 0;
    //public static User[] users = new User[100];
    public static User [] users = {};

    public static void addUser(User user){
        //users[count] = user;
        //count++;
        User [] newUsers = Arrays.copyOf(users,users.length+1);
        newUsers[users.length] = user;
        users= newUsers;
    }

    public static void update(User user,int index ){
        if(index <0 || index >=users.length){
            System.out.println("User don't found!");
        }
        else {
            users[index]=user;
        }
    }
}
