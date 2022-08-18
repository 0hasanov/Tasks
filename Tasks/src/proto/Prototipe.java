package proto;

public class Prototipe implements Cloneable {
    private String name;
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

    public Prototipe clone() throws CloneNotSupportedException {
        Prototipe clone = (Prototipe) super.clone();
        clone.setUser(user.clone());
        return clone;
    }

}
