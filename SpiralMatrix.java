public class SpiralMatrix {
    public static void printspiral(int matrix[][]){
        int startRow=0,startClo=0;
        int endRow=matrix.length-1;
        int endCol=matrix.length-1;
        while (startRow<=startClo && endRow<=endCol){
            // print top
            for(int j=startClo;j<endCol;j++){
                System.out.print(matrix[startRow][j]+"");
            }
            // print right
            for(int i=startRow+1;i<endRow;i++){
                System.out.print(matrix[i][endCol]+"");
            }
            //bottom
            for(int j=endCol-1;j>startClo;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+"");
            }
            //right
            for(int i=endRow;i>startRow;i--){
                if(startClo==endCol){
                    break;
                }
                System.out.print(matrix[i][startClo]+"");
            }
            startRow++;
            startClo++;
            endRow--;
            endCol--;

        }

    }

    public static void main(String[] args) {
        int matrix[][]={
                {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}
        };
        printspiral(matrix);


    }
}
