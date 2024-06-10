import java.util.*;
public class Reverse_array {
    public static void reverse(int [] num){
        int fast=0,last=num.length-1;
        while (fast<last){
           int temp=num[last];
           num[last]=num[fast];
           num[fast]=temp;
           fast++;
           last--;
        }
    }

    public static void main(String[] args) {
        int [] number={2,4,6,8,10};
        reverse(number);
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+"");

        }
        System.out.println();

    }
}
