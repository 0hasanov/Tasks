package metaVerse.userSignUP;


import java.util.Scanner;

public class SignUP {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        String input = "";
        boolean state = false;
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

                if (UserRepository.users.size() == 0) {
                    System.out.println("Please signup !");
                } else {
                    for (int i = 0; i < UserRepository.users.size(); i++) {
                        if (UserRepository.users.get(i) != null) {
                            if (UserRepository.users.get(i).getUsername().equals(username) && UserRepository.users.get(i).getPassword().equals(password)) {
                                System.out.printf("%s %s entered succesfully!\n", UserRepository.users.get(i).getName(), UserRepository.users.get(i).getPassword());
                                state=true;
                                break;
                            }
                        }

                    } if (!state)
                        System.out.println("Wrong username and password");
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
                UserRepository.users.add(user);
            } else if (input.equals("3") || input.equalsIgnoreCase("exit")) {
                System.out.println("You exit successfully!");
                break;
                //main method ise dusmesin
            } else {
                System.out.println("Wrong input!Please try again");
            }
        }
    }
}