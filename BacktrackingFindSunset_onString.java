public class BacktrackingFindSunset_onString {
    public static void findsubset(String str,int i,String ans){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("Null");
            }
            else {
                System.out.println(ans);
            }
            return;
        }
        // It is yes choice
        findsubset(str,i+1,ans+str.charAt(i));
        // It is no choice
        findsubset(str,i+1,ans);
    }

    public static void main(String[] args) {
        String str="abc";
        findsubset(str,0," ");
    }
}
