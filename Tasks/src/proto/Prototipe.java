package proto;

import java.io.Serializable;

public class Prototipe implements Cloneable {
   static private String name;
    private String surname;
    private int age;
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

     public Prototipe(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Prototipe{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", user=" + user +
                '}';
    }

    @Override
    public Prototipe clone() throws CloneNotSupportedException {
        Prototipe clone = (Prototipe) super.clone();
        clone.setUser(user.clone());
        return clone;
    }

}

class A extends B{

    public static void main(String[] args) {
        A as= new A();
    }
   public A(){

        super();
       System.out.println("A");

   }


}
class B{
    public  B(){
       super();
        System.out.println("B");
    }

}

interface C extends Serializable, Cloneable{

}