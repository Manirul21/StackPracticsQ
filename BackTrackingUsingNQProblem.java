public class BackTrackingUsingNQProblem {
   static int cout=0;
    public static boolean issafe(char board[][],int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //left diagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        // right diagonal
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void quees(char board[][],int row){
        if(row==board.length){
            printQueen(board);
            cout++;
            return;
        }

        for(int j=0;j<board.length;j++){
            if(issafe(board,row,j)) {
                
                board[row][j] = 'Q';
                quees(board, row + 1);
                board[row][j] = 'X';
            }
        }

    }
    public static void printQueen(char board[][]){
        System.out.println("______________________Chess Board_____________________");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0;i<board.length;i++){
            for (int j=0;j<board.length;j++){
                board[i][j]='X';
            }
        }
        quees(board,0);
        System.out.println("The Total no of Ways "+cout);
    }
}
