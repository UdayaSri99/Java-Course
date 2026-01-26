package Basics;
import java.util.Scanner;

public class InputOutput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        sc.close();
        System.out.println("enter your salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();
        System.out.println("your salary is: " + salary);
    }
    
}