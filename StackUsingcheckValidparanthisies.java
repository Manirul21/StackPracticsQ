import java.util.Stack;

public class StackUsingcheckValidparanthisies {
    public static boolean isValid(String str){
        Stack<java.lang.Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('|| ch=='{'||ch=='['){
                s.push(ch);
            }
            else {
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek()=='(')&&ch==')'||(s.peek()=='{')&&ch=='}'||(s.peek()=='[')&&ch==']'){
                    s.pop();
                }
                else {
                    return  false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str="({}()[])";
        System.out.println(isValid(str));

    }
}
