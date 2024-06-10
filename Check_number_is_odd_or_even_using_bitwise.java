public class Check_number_is_odd_or_even_using_bitwise {
    public static void oddeven(int n){
        int bitmask=1;
        if(((n&bitmask)==0)){
            System.out.println("It is even number "+n);
        }
        else {
            System.out.println("It is odd number "+n);
        }
    }

    public static void main(String[] args) {
        oddeven(6);
        oddeven(3);
    }
}
