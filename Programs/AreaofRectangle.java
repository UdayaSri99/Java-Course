package Programs;
import java.util.Scanner;

public class AreaofRectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Length");
        int length = sc.nextInt();
        System.out.println("Enter you breadth");
        int breadth = sc.nextInt();
        int Result = 2*(length+breadth);
        System.out.println("The Area of Reactangle is :"+ Result);
        sc.close();
        
    }
}
