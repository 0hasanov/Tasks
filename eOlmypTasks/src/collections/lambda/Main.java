package collections.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student();
        student1.setId(1);
        student1.setName("Ayaz");
        student1.setSurname("Akhmetshin");
        student1.setAge((byte) 19);
        studentList.add(student1);
        System.out.println(studentList);
        student1.checkAge();
        System.out.println();


        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Tenz");
        student2.setSurname("Tyson ");
        student2.setAge((byte) 20);
        studentList.add(student2);
        System.out.println(studentList);
        student2.checkAge();
        System.out.println();

        Student student3 = new Student();
        student3.setId(3);
        student3.setName("Shahzam");
        student3.setSurname("Khan");
        student3.setAge((byte) 17);
        studentList.add(student3);
        System.out.println(studentList);
        student3.checkAge();
        System.out.println();

        System.out.println("\n"+"SortByAge");

        Collections.sort(studentList, Comparator.comparing(Student::getAge));
        System.out.println(studentList); //sorted by ascending

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {

                return o2.getAge()-o1.getAge(); //sorted by descending
            }
        });
        System.out.println(studentList);

        Collections.sort(studentList, (o1, o2) -> o1.getAge()-o2.getAge());
        System.out.println(studentList); //sorted by ascending




        ageList a = () -> {
            if (student1.getAge() > 18) {
                System.out.printf("\n" + "%s is more than 18", student1.getName());
            }
            if (student2.getAge() > 18) {
                System.out.printf("\n" + "%s is more than 18", student2.getName());
            }
            if (student3.getAge() > 18) {
                System.out.printf("\n" + "%s is more than 18", student3.getName());
            }

        };
        a.check();
        System.out.println();


        List<Student> ageListMoreThan18 = new ArrayList<>();

        ageListMoreThan18 b = () -> {
            for (Student student :
                    studentList) {
                if (student.getAge() > 18) {
                    ageListMoreThan18.add(student);
//                    System.out.println(student);
                    System.out.println(ageListMoreThan18);
                }

            }
        };
        b.check();

    }

}

interface ageList {
    public void check();
}

interface ageListMoreThan18 {
    public void check();
}
