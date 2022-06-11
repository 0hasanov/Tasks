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
        System.out.println("New user added");
    }

    public static void update(User user,int index ){
        if(index <0 || index >=users.length){
            System.out.println("User don't found!");
        }
        else {
            users[index]=user;
        }
        System.out.println("Updated changes");
    }
     public static void delete (User user,int index){
        if (index >=0 && index < users.length ){
            System.out.println("User don't found!");
        }
        else {
            users[index] = user;
        }
         System.out.println("Account deleted succesfully");
     }

}
