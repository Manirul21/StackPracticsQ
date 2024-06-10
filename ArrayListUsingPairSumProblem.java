import java.util.ArrayList;

public class ArrayListUsingPairSumProblem {
    public static boolean pairsum(ArrayList<Integer>list,int target){
        int lp=0;
        int rp= list.size()-1;
        while (lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return  true;

            }
            if(list.get(lp)+list.get(rp)<target){
                lp++;
            }
            else {
                rp--;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        int target=5;
        for(int i=1;i<6;i++){
            list.add(i);

        }
        System.out.println(pairsum(list,target));

    }
}
