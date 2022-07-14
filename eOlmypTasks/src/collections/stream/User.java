package collections.stream;

import java.util.Objects;

public class User {
    private String mail;
    private String password;

    public User() {
    }

    public User(String mail, String password) {
        this.mail = mail;
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return password == user.password && mail.equals(user.mail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mail, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "mail=" + mail +
                ", password=" + password +
                '}';
    }
}

