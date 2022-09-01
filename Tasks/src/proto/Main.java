package proto;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User();
        user.setGroupnumber("32456");
        Prototipe prototipe = new Prototipe("Emil","Hasanov",20);
        prototipe.setUser(user);
        System.out.println(prototipe);
        Prototipe clone = prototipe.clone();

        System.out.println(clone);
        clone.getUser().setGroupnumber("5555");

        System.out.println(prototipe);
        System.out.println(clone);
    }
}
