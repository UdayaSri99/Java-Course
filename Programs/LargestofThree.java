package Programs;

import java.util.Scanner;

public class LargestofThree{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter your Num2:");
        int num2 = sc.nextInt();
        System.out.println("Enter your Num3:");
        int num3 = sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println("Num1 is the Largest");
        }else if(num2>num1 && num2>num3){
            System.out.println("Num2 is the Largest");
        }else{
            System.out.println("Num3 is the Largest");

    }
}
}