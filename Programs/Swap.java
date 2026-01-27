package Programs;

public class Swap {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;
        System.out.println("The value of num1: " + num1);
        System.out.println("The Value of num2 is "+ num2);
        // num1 = num1 + num2;
        // num2 = num1 - num2;
        // num1 = num1 - num2;
        
        int temp;  //without using 3rd Variable
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swapping");
        System.out.println("the Value of num1 is:"+ num1);
        System.out.println("the value of num2 is :"+ num2);
    }
    
}
