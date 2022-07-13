package collections.stream;


import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Employer> employerList = new ArrayList<>();
        Employer teacher = new Employer(1, "Fidan", "Rustamova", 25, 600);
        Employer doctor = new Employer(2, "Elvin", "Muradov", 32, 1200);
        Employer artist = new Employer(3, "Ayaz", "Akhmetshin", 24, 1000);
        Employer coder = new Employer(4, "Shahzam", "Khan", 21, 1500);
        Employer designer = new Employer(5, "Tenz", "Tyson", 19, 800);
        employerList.add(teacher);
        employerList.add(doctor);
        employerList.add(artist);
        employerList.add(coder);
        employerList.add(designer);
        System.out.println("1) Alfabetik");
        employerList.stream().sorted(Comparator.comparing(Employer::getName)).collect(Collectors.toList());
        employerList.forEach(System.out::println);

        System.out.println("1) Alfabetik last");
        List<Employer> sortedList = employerList.stream().sorted(Comparator.comparing(Employer::getName)).collect(Collectors.toList());
        sortedList.forEach(System.out::println);
        System.out.println("2) To Console");
        Predicate<Employer> salary = employer -> employer.getSalary() > 1000;
        employerList.stream().filter(salary).forEach(System.out::println);

        Scanner sc = new Scanner(System.in);
        System.out.print("Mail: ");
        String mail = sc.next();
        System.out.print("Password: ");
        String password = sc.next();


        List<User> userList = new ArrayList<>();
        Random number = new Random();
        User fidan = new User();
        fidan.setMail("fidan.rustamova@gmail.com");
        fidan.setPassword(number.nextInt());
        User elvin = new User();
        elvin.setMail("elvin.muradov@gmail.com");
        elvin.setPassword(number.nextInt());
        User ayaz = new User();
        ayaz.setMail("ayaz.akhmetshin@gmail.com");
        ayaz.setPassword(number.nextInt());
        User shahzam = new User();
        shahzam.setMail("shahzam.khan@gmail.com");
        shahzam.setPassword(number.nextInt());
        User tenz = new User();
        tenz.setMail("tenz.tyson@gmail.com");
        tenz.setPassword(number.nextInt());
        userList.add(fidan);
        userList.add(elvin);
        userList.add(ayaz);
        userList.add(shahzam);
        userList.add(tenz);


        for (User user : userList) {
            if (user.getMail().equalsIgnoreCase(mail))
                System.out.println("You entered!");


        }
    }
}

//        System.out.println(sortEmployersByName(employerList));

//    static List sortEmployersByName(List<Employer> employerList) {
//        return employerList.stream().sorted(Comparator.comparing(Employer::getName)).collect(Collectors.toList());
//    }



