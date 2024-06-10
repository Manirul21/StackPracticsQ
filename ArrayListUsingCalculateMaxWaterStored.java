import java.util.ArrayList;

public class ArrayListUsingCalculateMaxWaterStored {
    public static int storedWater(ArrayList<Integer>list){
        int max=0;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                int height=Math.min(list.get(i),list.get(j));
                int width=j-i;
                int currwater=height*width;
                max=Math.max(max,currwater);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[]={1,8,6,2,4,8,5,3,7};
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        System.out.println(storedWater(list));
    }

}
