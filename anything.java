import java.util.Scanner;

public class anything {
    public static void main(String[] args) {

//        String str= "Geeks", nstr="";
//        char ch;
//
//        System.out.print("Original word: ");
//        System.out.println("Geeks"); //Example word
//
//        for (int i=0; i<str.length(); i++)
//        {
//            ch= str.charAt(i); //extracts each character
//            nstr= ch+nstr; //adds each character in front of the existing string
//        }
//        System.out.println("Reversed word: "+ nstr);
        Scanner sc = new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String sb=" ";
        char ch;
        for(int i=0;i<A.length();i++){
            ch=A.charAt(i);
            sb=ch+sb;
        }
        if("noon".equals(sb)){
            System.out.println("Yes");
        }
        else
        {
            System.out.println("no");
        }
        System.out.println(sb);
    }
}
