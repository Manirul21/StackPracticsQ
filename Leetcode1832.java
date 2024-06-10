public class Leetcode1832 {
    public static void pangram(String str){
        char arr[]=new  char[26];
        char latter='a';
        int count=0;
        for (int i=0;i<arr.length;i++){
            arr[i]=latter;
            latter++;
        }
        int j=0;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)==arr[j]){
                count++;
                break;
            }
            j++;
        }
//        if(count== arr.length){
//            System.out.println("Ture");
//        }
//        else {
//            System.out.println("false");
//        }
        System.out.println(count);


    }
    public static void main(String[] args) {
        String str="thequickbrownfoxjumpsoverthelazydog";
        pangram(str);
    }
}
