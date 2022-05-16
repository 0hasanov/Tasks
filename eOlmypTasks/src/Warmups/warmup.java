package Warmups;
public class warmup {
    public static void main(String[] args) {
 /*       char[] ch={'j','a','v','a','t','p','o','i','n','t'};
        String s1=new String(ch);
        String s2 = "Example";
        String s3=new String ("javA");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        String str = "CodersAze";
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(args.length));
        String s1 = str.toLowerCase("AZerBaiJAn");
        System.out.println(s1);
        System.out.println(str.indexOf("A"));
        System.out.println(str.charAt(7));


        String str = "CCC111aZeRCCCCbaIJanCCCCCCC";
        String replace = str.replace('C', ' ');
        String substring = replace.substring(0, 3) + replace.substring(16, 21);
        String trim = replace.trim();
        System.out.println(trim);
        String adding = trim.substring(0, 7) + "CCCC" + trim.substring(7, trim.length());
        System.out.println(adding);

        String str = "CCCaZeRCCbaIJanCCCCCCCC";
        System.out.println(str.lastIndexOf("C"));


        String str = "CCC111aZeRCCCCbaIJanCCCCCCC";
        String replace = str.replace('C', ' ');
        String substring = replace.substring(0,3) + replace.substring(16,21);
        String trim = substring.trim();
        String adding = trim.substring(0, 7) + "CCCC"  + trim.substring(7, trim.length());
        System.out.println(trim);

*/
        String str = "CCC111aZeRCCCCbaIJanCCCCCCC";
        String replace = str.replace('C', ' ');
        String substring = replace.substring(0, 10) + "CCCC" + replace.substring(14, 21);
        String trim = substring.trim();
        System.out.println(trim);
    }
}