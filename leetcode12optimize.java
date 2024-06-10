import java.util.HashSet;
import java.util.Set;

public class leetcode12optimize {
    public static void findextra(String s,String t){
        Set<java.lang.Character> set=new HashSet<>();
        String str=" ";
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            if(!set.contains(t.charAt(i))){
                str+=t.charAt(i);
                
            }
        }
        System.out.print("'"+str+" ' ");
    }

    public static void main(String[] args) {
        String s=" ";
        String t="y";
        findextra(s,t);
    }
}
