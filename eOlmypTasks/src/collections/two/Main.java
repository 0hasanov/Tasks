package collections.two;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        User coder = new User();
        Set<User> user1 = new HashSet<>();
        user1.add(coder);
        coder.setName("Emil");
        coder.setSurname("Hasanov");
        coder.setId(1);
        System.out.println(user1);

        User teacher = new User();
        Set<User> user2 = new HashSet<>();
        user2.add(teacher);
        teacher.setName("Fidan");
        teacher.setSurname("Rustamova");
        teacher.setId(2);
        System.out.println(user2);

        User doctor = new User();
        Set<User> user3 = new HashSet<>();
        user3.add(doctor);
        doctor.setName("Elvin");
        doctor.setSurname("Muradov");
        doctor.setId(3);
        System.out.println(user3);

        User artist = new User("Emil", "Hasanov", 4);
        Set<User> user4 = new HashSet<>();
        user4.add(artist);
        System.out.println(user4);


    }


}



