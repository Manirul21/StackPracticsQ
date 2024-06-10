public class paratices {
    public static void sum(int arr[]) {
        int left = 0;
        int right = 1;
        int target = 9;
        for (int i = right; i < arr.length; i++) {
            if (arr[i] + arr[left] == target) {
                System.out.println(left);
                System.out.println(i);
            }
        }
        //sum(left+1,right+1);
    }

        public static void main (String[]args){
            int arr[] = {5, 6, 3, 8, 6};
//        int left=0;
//        int right=1;
//        int target=9;
//        for(int i=right;i<arr.length;i++){
//            if(arr[i]+arr[left]==target){
//                System.out.println(left);
//                System.out.println(i);
//            }
//
//
//        }
        }
    }

