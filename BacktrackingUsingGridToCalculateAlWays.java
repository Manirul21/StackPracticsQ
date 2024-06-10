public class BacktrackingUsingGridToCalculateAlWays {
    public static int GridWays(int i,int j,int n,int m){
        if(i==n-1&&j==m-1){// condition for last cell
            return 1;
        }
        else if (i==n||j==n) {//boundary condition
            return 0;

        }
        int w1=GridWays(i+1,j,n,m);
        int w2=GridWays(i,j+1,n,m);
        return w1+w2;
    }

    public static void main(String[] args) {
        int n=3,m=6;
        System.out.print(GridWays(0,0,n,m));
    }

}
