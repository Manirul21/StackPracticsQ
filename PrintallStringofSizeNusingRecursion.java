public class PrintallStringofSizeNusingRecursion {
    public static void printString(int n,int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printString(n-1,0,str+"0");
        if(lastplace==0){
            printString(n-1,1,str+"1");
        }
    }

    public static void main(String[] args) {
        printString(2,0,"");
    }
}
