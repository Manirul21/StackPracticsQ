public class leetcode14 {
    public static void replacevowel(String str){
        char ch[]=str.toCharArray();
        int last=0;
        int right=ch.length-1;

        int i=0;
        int j=0;
        while (last<=right){
            if(ch[last]=='a'|| ch[last]=='e'||ch[last]=='i'||ch[last]=='o'||ch[last]=='u'){
                i=last;

                last++;

            }
            if(ch[right]=='a'|| ch[right]=='e'||ch[right]=='i'||ch[right]=='o'||ch[right]=='u'){
                j=right;
                right--;
            }

            last++;
            right--;



        }
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        i=0;
        j=0;

        for(int z=0;z<ch.length;z++){
            System.out.print(ch[z]);
        }



    }

    public static void main(String[] args) {
        String ch="leetcode";
        replacevowel(ch);
    }
}
