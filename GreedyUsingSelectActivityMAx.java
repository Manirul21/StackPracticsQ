import java.util.ArrayList;

public class GreedyUsingSelectActivityMAx {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        int maxAct=0;
        ArrayList<Integer>ans=new ArrayList<>();
        // select fast activity
        maxAct=1;
        ans.add(0);
        int lastend=end[0];
        for(int i=0;i<start.length;i++){
            if(start[i]>=lastend){
                maxAct++;
                ans.add(i);
                lastend=end[i];
            }
        }
        System.out.println("Max Activity = "+maxAct);
        for (int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
