package hackerRank;

public class IntToString {
    public static void main(String[] args) {
        int n = 100;
        String s = Integer.toString(n);
        if(s.equals(Integer.toString(n))){
            System.out.println("Good job");
        }
        else{
            System.out.println("Wrong answer");

        }
    }
}
