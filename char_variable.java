public class char_variable {
    public static void main(String[] args) {
//        char a = 'a';
//        char b = 'c';
//        char c =(char)  (a+b);
//        System.out.println(c);
        System.out.println(print12(3));
    }
    public static int  print12(int n){
        int c=0;
        for (int i=0;i<n;i++ ){
            for (int j=0 ;j<n;j++){
                if(i==j){
                    c=c+1;
                }
            }
        }
        return c;
    }


}
