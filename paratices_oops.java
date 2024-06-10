import java.util.Scanner;

public class paratices_oops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ab= sc.nextInt();
        int ca=sc.nextInt();
        Complex c=new Complex();
        c.a=ab;
        c.b=ca;
        System.out.println(c.sum());
        System.out.println(c.diff());
        System.out.println(c.multi());

    }
}
class Complex{
    int a,b;
    int sum(){
        return a+b;
    }
    int diff(){
       return a-b;
    }
    int  multi(){
        return a*b;
    }
}
