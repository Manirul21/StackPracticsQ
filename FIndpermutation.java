public class FIndpermutation {
    public static void permutation( String s,String t) {
        int sum=0;
        int diff=0;
        int last=0;
        while (last<s.length()){
            char ch=s.charAt(last);
            for(int i=0;i<t.length()-1;i++){
                if(ch==t.charAt(i));
                diff=last-i;
                if(diff<0){
                    diff*=-1;
                }
            }
            sum+=diff;
            diff=0;
            last++;

        }
        System.out.print(sum);

    }


    public static void main(String[] args) {
        String s="abc";
        String t="bac";
        permutation(s,t);
    }

}
