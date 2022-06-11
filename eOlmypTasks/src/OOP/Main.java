package OOP;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.name);
        Cat Alf = new Cat();
        Alf.name = "Alf";
        System.out.println(Alf.name);
       // Alf.meowing() = new Alf.meowing();
        //Alf.meowing() = "Alf is meowing";



        cat.meowing();




        /*String dogName = Dog.name;
        System.out.println(dogName);
        Dog.barking();

        System.out.println(Cat.name);
        Cat.meowing();
        System.out.println(Cat.gender);

        System.out.println(Parrot.name);
        Parrot.speaking();
        System.out.println(Parrot.age);
*/
    }
}
