public class music_array {
    public static int music(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                return 0;
            }

        }
        return 1;
    }

    public static void main(String[] args) {
        int arr[]={0,1,6,5};
        System.out.println(music(arr));
    }
}
