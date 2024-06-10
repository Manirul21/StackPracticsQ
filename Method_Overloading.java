public class Method_Overloading {
    public static void main(String[] args) {
        Calculate cal=new Calculate();
        System.out.println(cal.sum(5,6));
        System.out.println(cal.sum((float) 2.65,(float) 5.65));
        System.out.println(cal.sum(2,5,7));

    }
}
class Calculate{
    int sum(int a,int b){
        return a +b;
    }
   float sum(float a,float b){
        return a+b;
   }
   int sum(int a,int b,int c){
        return a+b+c;
   }
}
