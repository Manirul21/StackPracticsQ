import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class GreedyUsingIndainCoin {
    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,500,100,200};
        Arrays.sort(coins, Comparator.reverseOrder());
        int MinCoin=0;
        int amount=590;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<coins.length;i++){
            if(amount>=coins[i]){
                while (amount>=coins[i]){
                    MinCoin++;
                    ans.add(coins[i]);
                    amount-=coins[i];

                }
            }
        }
        System.out.println("Total min coins are used "+ MinCoin);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
