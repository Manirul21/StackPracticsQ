import java.util.Arrays;

public class first {
    //    public static void sum(String str){
//      for(int i=str.length()-1;i>=0;i--){
//          System.out.print(str.charAt(i));
//      }
//    }
//
//    public static void main(String[] args) {
//        String str= "Manirul";
//        sum(str);
//    }
    public static void main(String[] args) {
        String str="";
        String str1[]=str.split(" ") ;
        System.out.println(str1[0]);
        int sum= Integer.parseInt(str1[0]);
        System.out.println(sum);

    }
}
