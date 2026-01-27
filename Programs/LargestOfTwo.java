package Programs;
import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your Num1:");
    int num1 = sc.nextInt();
    System.out.println("Enter Your Num2");
    int num2 = sc.nextInt();
    if(num1 > num2){
        System.out.println("num1 is Greater");
        
    }else{
        System.out.println("Num2 is Greater");
    }

    }
    
}

