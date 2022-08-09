package collections.stream;


import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        Employer teacher = new Employer(1, "Fidan", "Rustamova", 25, 600);
        Employer doctor = new Employer(2, "Elvin", "Muradov", 32, 1200);
        Employer artist = new Employer(3, "Ayaz", "Akhmetshin", 24, 1000);
        Employer coder = new Employer(4, "Shahzam", "Khan", 21, 1500);
        Employer designer = new Employer(5, "Tenz", "Tyson", 19, 800);
        List<Employer> employerList = new ArrayList<>(List.of(teacher, doctor, artist, coder, designer));

        System.out.println("1) Alfabetik");
        employerList.stream().sorted(Comparator.comparing(Employer::getName)).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("1) Alfabetik last");
        List<Employer> sortedList = employerList.stream().sorted(Comparator.comparing(Employer::getName)).collect(Collectors.toList());
        sortedList.forEach(System.out::println);
        Function<Employer, User> employerUserFunction = employer ->
                new User(employer.getName() + "." + employer.getSurname() + "@gmail.com",
                        generatePassword(8));

        List<User> userList = sortedList.stream().map(employerUserFunction).collect(Collectors.toList());
        userList.forEach(System.out::println);


        System.out.println("2) To Console");
        Predicate<Employer> salary = employer -> employer.getSalary() > 1000;
        employerList.stream().filter(salary).forEach(System.out::println);


    }

    private static String generatePassword(int length) {
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$";
        String numbers = "1234567890";
        String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
        Random random = new Random();
        char[] password = new char[length];

        password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
        password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
        password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
        password[3] = numbers.charAt(random.nextInt(numbers.length()));

        for (int i = 4; i < length; i++) {
            password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        }
        return new String(password);
    }

}

//        System.out.println(sortEmployersByName(employerList));

//    static List sortEmployersByName(List<Employer> employerList) {
//        return employerList.stream().sorted(Comparator.comparing(Employer::getName)).collect(Collectors.toList());
//    }



