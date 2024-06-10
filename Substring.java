public class Substring {
    public static void substring(String str){
        String str1=" ";
        for(int i=0;i<str.length();i++){

                str1+=str.charAt(i);
                System.out.println(str1);

           // System.out.println(str1);
        }


    }

    public static void main(String[] args) {
        String str ="helloworld";
        substring(str);
    }
}
