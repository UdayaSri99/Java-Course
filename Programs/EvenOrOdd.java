package Programs;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your numnber:");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("This is Even Number");
        }else{
            System.out.println("This is odd Number");
        }
        sc.close();
    }
    
}
