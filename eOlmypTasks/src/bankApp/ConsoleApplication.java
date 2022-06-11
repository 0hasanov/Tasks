package bankApp;

import java.util.Scanner;

public class ConsoleApplication {

    public static void run() {
        Scanner sc = new Scanner(System.in);

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


                //int[] arr = new int[100];
                // for(int number : arr)
                // for(String word : arrayString)
                // int i =0; i < users.length; i++
                // users[i]
                for (User user : users) {
                    if (user != null) {
                        if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                            System.out.printf("Welcome %s %s\n\n", user.getName(), user.getSurname());

                            //return ;
                            while (true) {
                                String choise = "1.Update changes\n2.Exit\n\n" +
                                        "Please choose 1 or 2!";
                                System.out.println(choise);
                                input = new Scanner(System.in).nextLine();
                                if (input.equalsIgnoreCase("Update") ||  input.equals("1")){
                                    System.out.println("New Username: ");
                                    username = sc.next();
                                    System.out.println("New Password: ");
                                    password = sc.next();

                                    User newUser = new User(username,password);
                                    UserRepository.addUser(newUser);

                                    System.out.println("Username and password changed successfully");


                                }
                                else if (input.equalsIgnoreCase("Exit") ||  input.equals("2")){
                                    System.out.println("You exit successfully!");



                                }


                            }
                        }

                    }
                    break;
                }

                System.out.println("Wrong username and password");
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
