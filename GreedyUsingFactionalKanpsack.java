import java.util.Arrays;
import java.util.Comparator;


public class GreedyUsingFactionalKanpsack {
    public static void main(String[] args) {
        int val[]={60,100,120};
        int weight[]={10,20,30};
        int W=50;
        double ratio[][]=new double[val.length][2];
        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));
        int finalVal=0;
        int capacity=W;
        for(int i=ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];
            if(capacity>=weight[idx]){
                finalVal+=val[idx];
                capacity-=weight[idx];
            }
            else {
                finalVal+=(ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }
        System.out.println("The max is profit  "+finalVal );

    }
}
