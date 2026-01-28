package Programs;
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your reactangle Raduis:");
        double radius = sc.nextDouble();
        double Area = Math.PI * radius*radius;
        System.out.println("Area of Triangle with Radius:"+ radius + "is:"+ Area);
        sc.close();
    }

    
}
