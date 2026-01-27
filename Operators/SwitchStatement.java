// Switch Statement is a control flow statement that allows a variable to be tested for equality against a list of values, known as cases. Each case contains a block of code that is executed if the variable matches the case value. The switch statement is often used as an alternative to multiple if-else statements when dealing with a single variable that can take on multiple discrete values.


import java.util.Scanner;

public class SwitchStatement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 3:");
        int a = sc.nextInt();
        sc.close();
        switch(a){
            case 1 :
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:
                System.out.println("Value is 3");
                break;
            default:
                System.out.println("Value is not 1, 2 or 3");
        }
    }
}