//Mutli-dimensional array is nothing but an array of arrays. It is used to store data in a tabular form, like a matrix or a table with rows and columns. Each element in a multi-dimensional array can be accessed using multiple indices.

package Arrays;
public class MultiDimensionalArray {
    public static void main(String[] args){
        int[][] matrix = {
            {10,20,30},
            {40,50,60},
            {70,80,9}};
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[i].length;j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

        
        }
    }
    

