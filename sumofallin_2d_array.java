public class sumofallin_2d_array {
    public static  int  sumof(int arr[][]){
        int sum=0;
        int start=1,end=arr[0].length;
        while (start<=end) {
            for (int i = 0; i < arr.length-1; i++) {
                for (int j = 0; j <arr[0].length-1; j++) {
                    sum += arr[i][j];
                }

            }
            start++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[][]=
                {{20,43,12},
                {2,5,3,2},
                {23,54,54}};
        System.out.println(sumof(arr));

    }
}
