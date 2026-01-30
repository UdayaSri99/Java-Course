package Arrays;

public class RandomArray{
    public static void main(String[] args){
        int[] arr = new int[5];
        for(int i =0; i<5;i++){
            arr[i] = (int) (Math.random()*100);
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}