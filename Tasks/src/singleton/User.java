package singleton;


public class User {

    private  static    User u;

    private User(){

    }
    public  static  User getUserObj(){

        if(u==null)
        synchronized (User.class){
            if(u==null){
                u= new User();
            }
        }
        return u;
    }


}
