public class lastAtzero {
    public static void lastAt(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            if (arr[right] == 0) {
                right--;
            }
            if (arr[left] == 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right--;
                left++;
            }
            left++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {0, 0, 2, 0};
        lastAt(arr);
    }
}
