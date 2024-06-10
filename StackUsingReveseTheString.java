import java.util.Stack;

public class StackUsingReveseTheString {
    public static String reverse(String str){
        Stack<java.lang.Character> s=new Stack<>();
        int i=0;
        while (i<str.length()){
            s.push(str.charAt(i));
            i++;
        }
        String str1=" ";
        while (!s.isEmpty()){
            str1+=s.pop();
        }
        return str1;
    }
    public static void main(String[] args) {
        String str="abc";
        System.out.println(reverse(str));

    }
}
