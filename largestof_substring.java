public class largestof_substring {
    public static void main(String[] args) {


    String str[]={"apple","mango","banana"};
    int n=str.length;
    String largest=str[0];
    for (int i=1;i<n;i++){
        if(largest.compareTo(str[i])<0){
            largest=str[i];

        }
    }

        System.out.println(largest);

    }
}
