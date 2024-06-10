public class geeksforgeeksQ1 {
    public static int maxmin(int a[],int n){
        int min = a[0];
        int max = a[0];

        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            } else if (a[i] > max) {
                max = a[i];
            }
        }

        return  0;
    }
}
