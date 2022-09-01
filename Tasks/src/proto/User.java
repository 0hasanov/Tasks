package proto;

public class User implements Cloneable {
    private String groupnumber;

//    public User(String groupnumber) {
//        this.groupnumber = groupnumber;
//    }


    public User() {
    }

    public String getGroupnumber() {
        return groupnumber;
    }

    public void setGroupnumber(String groupnumber) {
        this.groupnumber = groupnumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "groupnumber='" + groupnumber + '\'' +
                '}';
    }

    @Override
    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }

}
