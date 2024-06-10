public class LeetcodeQ1 {
   public static boolean sum(int x){
       int rev=0;
       int org=x;
       while (x>0){
           int last=x%10;
           rev=(rev*10)+last;
           x=x/10;
       }
       if(rev==org){
           return true;
       }
       return false;
   }

    public static void main(String[] args) {
        int x=121;
        System.out.println(sum(x));
    }

}
