public class ReversTheString {
    public static void Revers(String str){
        int fast=0;
        int last=str.length()-1;
        char chr[]=str.toCharArray();
       while (fast<=last){
           char temp=chr[last];
           chr[last]=chr[fast];
           chr[fast]=temp;
           fast++;
           last--;
       }
       for(int i=0;i<chr.length;i++){
           System.out.print(chr[i]+" ");
       }

    }

    public static void main(String[] args) {
        String str="Hello";
        Revers(str);
    }
}
