package hackerRank;

import java.util.InputMismatchException;

public class OwnException extends InputMismatchException {
    public OwnException (){
        super("can't be fitted anywhere.");
    }
     public OwnException(String message){
        super(message);
     }

}
