public class leetcode12 {
    public static void findremov(String str,String t){
        String str1=" ";
        for(int i=0;i<t.length();i++) {
            char cha= t.charAt(i);
            boolean found=false;
            for (int j = 0; j < str.length(); j++) {
                if (cha== str.charAt(j)) {
                   found=true;
                   break;
                }
            }
            if(!found){
                str1+=cha;
            }
        }
        System.out.print("'"+str1+" ' ");


    }

    public static void main(String[] args) {
        String str=" abc";
        String t="abce";
        findremov(str,t);

    }


}
