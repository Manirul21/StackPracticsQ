public class paratics4 {
    public static int lowest(int number[]){
        int max=0;
        int curr=0;
        for(int i=0;i<number.length;i++){
            curr=number[i];
            if(max<curr){
                max=curr;

            }
        }
        return max;
    }

    public static void main(String[] args) {
        int num[]={80,50,6,8,2,0,90};
        System.out.println("The lowest element is : "+lowest(num));
    }
}
