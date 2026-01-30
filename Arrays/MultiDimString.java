package Arrays;

public class MultiDimString {
    public static void main(String[] args){
        String[][] arrStrings = new String[1][3];
        arrStrings[0][0] = "Ammu";
        arrStrings[0][1] = "Uday";
        arrStrings[0][2] = "Sri";
        for(int i=0;i<arrStrings.length;i++){
            for(int j=0;j<arrStrings[i].length;j++){
            System.out.print(arrStrings[i][j]);
            }
            System.out.println();
        }

        String[][] matrixStrings = {
            {"Ammu", "udaya" ,"Sri"},
            {"Priya","Chitti", "Chuchu"},
            {"chinni", "Lakshmi","Buuda"}
        };
        for(int i=0; i<matrixStrings.length;i++){
            for(int j=0;j<matrixStrings[i].length;j++){
                System.out.print(matrixStrings[i][j]);
            }System.out.println();
        }



        }
    }

    

