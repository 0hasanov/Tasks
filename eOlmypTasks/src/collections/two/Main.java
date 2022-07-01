package collections.two;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println("First version");

        User coder = new User();
        Set<User> employer = new HashSet<>();

        coder.setName("Emil");
        coder.setSurname("Hasanov");
        coder.setId(1);
        employer.add(coder);


        User teacher = new User();


        teacher.setName("Fidan");
        teacher.setSurname("Rustamova");
        teacher.setId(2);
        employer.add(teacher);


        User doctor = new User();


        doctor.setName("Elvin");
        doctor.setSurname("Muradov");
        doctor.setId(3);
        employer.add(doctor);


        User artist = new User("Emil", "Hasanov", 4);



        employer.add(artist);
        System.out.println(employer);


        System.out.println("Delete same ");

//        if (coder.getName() == teacher.getName() || coder.getSurname() == teacher.getSurname()) {
//            user1.clear();
//            user2.clear();
//            System.out.println(user1);
//            System.out.println(user2);
//            System.out.println(user3);
//            System.out.println(user4);
//        }
//
//        if (coder.getName() == doctor.getName() || coder.getSurname() == doctor.getSurname()) {
//            user1.clear();
//            user3.clear();
//            System.out.println(user1);
//            System.out.println(user2);
//            System.out.println(user3);
//            System.out.println(user4);
//        }
//
//        if (coder.getName() == artist.getName() || coder.getSurname() == artist.getSurname()) {
//            user1.clear();
//            user4.clear();
//
//            System.out.println(user1);
//            System.out.println(user2);
//            System.out.println(user3);
//            System.out.println(user4);
//        }
//
//        if (teacher.getName() == doctor.getName() || teacher.getSurname() == doctor.getSurname()) {
//            user2.clear();
//            user3.clear();
//            System.out.println(user1);
//            System.out.println(user2);
//            System.out.println(user3);
//            System.out.println(user4);
//        }
//
//        if (teacher.getName() == artist.getName() || teacher.getSurname() == artist.getSurname()) {
//            user2.clear();
//            user4.clear();
//            System.out.println(user1);
//            System.out.println(user2);
//            System.out.println(user3);
//            System.out.println(user4);
//        }
//
//        if (doctor.getName() == artist.getName() || doctor.getSurname() == artist.getSurname()) {
//            user3.clear();
//            user4.clear();
//            System.out.println(user1);
//            System.out.println(user2);
//            System.out.println(user3);
//            System.out.println(user4);
//        }


    }
}





