package metaVerse.userSignUP;

import java.util.Scanner;

public class SignUP {
    public static void run() {
        Scanner sc = new Scanner(System.in);

        boolean choises = false;
        String input = "";
        while (true) {
            String menu = "1.Login\n2.Sign up\n3.Exit\n\n" +
                    "Please choose one!";
            System.out.println(menu);
            input = new Scanner(System.in).nextLine();

            if (input.equalsIgnoreCase("login") || input.equals("1")) {
                System.out.print("Username: ");
                String username = sc.next();
                System.out.print("password: ");
                String password = sc.next();

                User[] users = UserRepository.users;
                for (int i = 0; i < users.length; i++) {
                    if (users[i] == null) {
                        System.out.println("Please signup !");
                    } else if (users[i] != null) {
                        if (users[i].getUsername().equals(username) && users[i].getPassword().equals(password)) {
                            choises = true;
                            System.out.println("You entered succesfully!");
                        } else if (!choises) {
                            System.out.println("Wrong username and password");
                        }
                    }
                }
            } else if (input.equalsIgnoreCase("sign up") || input.equals("2")) {
                System.out.print("name: ");
                String name = sc.next();
                System.out.print("surname: ");
                String surname = sc.next();
                System.out.print("username: ");
                String username = sc.next();
                System.out.print("password: ");
                String password = sc.next();
                System.out.print("age: ");
                short age = sc.nextShort();

                User user = new User(name, surname, username, password, age);
                UserRepository.addUser(user);
            } else if (input.equals("3") || input.equalsIgnoreCase("exit")) {
                System.out.println("You exit successfully!");
                break;
            } else {
                System.out.println("Wrong input!Please try again");
            }
        }
    }
}