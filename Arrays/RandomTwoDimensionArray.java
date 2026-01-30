package Arrays;

public class RandomTwoDimensionArray {
    public static void main(String[] args){
        int[][] matrix = new int[4][5];
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                matrix[i][j] =(int)(Math.random()*100) ;
            }
        }
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[i].length;j++){
                    System.out.print(matrix[i][j]+ "\t");
                }
                System.out.println();
            }
        }
    }
    

