public class RecursionUsingallOcuurence {
    public static void recursionocurence(int arr[], int i,int val){
        String str=" ";
        if(i==0){
            return;
        }
        recursionocurence(arr,i-1,val);
        if(arr[i]==val){

            str+=i;

        }
        System.out.print(str);


    }

    public static void main(String[] args) {
        int arr[]={2,5,3,5,8,5,3};
        int val=5;
        recursionocurence(arr,6,val);
    }
}
