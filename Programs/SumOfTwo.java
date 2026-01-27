package Programs;
import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter Yur Second Number:");
        int num2 = sc.nextInt();
        int num3 = num1 + num2;
        System.out.println("The Result of Addition:" + num3);
        sc.close();


    }
    
}
