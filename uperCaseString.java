public class uperCaseString {
    public static void upper(String str){
        String newStr=" ";
        String sr=" ";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
            sr+=str.charAt(i+1);
            newStr+=sr.toUpperCase();
            sr=" ";
            i++;


            }
            else {
                newStr+=str.charAt(i);
            }
        }
        System.out.println(newStr);
    }

    public static void main(String[] args) {
        String str="Manirul islam go in khanna";
        upper(str);
    }
}
