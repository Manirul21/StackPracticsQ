public class paractics3 {
    public static int  lagest(int number[]){
        int max=Integer.MIN_VALUE;
        int current =0;
        for(int i=0;i<number.length;i++){
            current=number[i];
            if(max<current){
                max=current;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int number[]={8,2,6,8,18};
        System.out.println("The largest element is :"+lagest(number));
    }
}
