public class find_largestnumber_given_array {
    public static void main(String[] args) {
        int[] number ={1,2,6,4,3};
        System.out.println("The largest number of given array is : "+largestnumber(number));
    }
    public static int largestnumber(int[] num){
        int largest=Integer.MIN_VALUE;
        for (int j : num) {
            if (largest < j) {
                largest = j;
            }
        }
        return largest;
    }
}
