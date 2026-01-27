//loops are used to execute a block of code repeatedly until a certain condition is met.
//Do-While Loop : A do-while loop is a control flow statement that executes a block of code at least once, and then repeatedly executes the block as long as a specified condition is true. The key difference between a do-while loop and a while loop is that the do-while loop guarantees that the code block will be executed at least once, regardless of whether the condition is true or false at the beginning.


package Loops;

public class DoWhileLoop {

    public static void main(String[] args){
        int i = 100;
        do{
            System.out.println("tha value of i is:"+ i);
        }while(i<10);
    }
    
}
