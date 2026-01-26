package Basics;
//Type casting is a process in which the programmer manually converts one data type into another data type. Type conversion is a process in which the data type is automatically converted into another data type. Method. Explicitly done by the programmer using casting operators
//small to big size is called widening or implicit type casting
//big to small size is called narrowing or explicit type casting

public class TypeCasting{
    public static void main(String[] args){
        System.out.println("Type Casting in Java");
        //Implicit Type Casting
        int i= 100;
        float f = i;
        System.out.println("Implicit Type Casting:");
        System.out.println("Integer value: " + i);
        System.out.println("Float value: " + f);
        //Explicit Type Casting
        double d = 100.04;
        int j = (int) d;
        System.out.println("Explicit Type Casting:");
        System.out.println("Double value: " + d);
        System.out.println("Integer value: " + j);
        double g= 12.3456789;
        float h = (float) g;
        System.out.println("Double value: " + g);
        System.out.println("Float value: " + h);        
    }
}
//explict type casting is done by programmer using casting operators 
//it is dangerous because we may lose data while converting from big to small size
//implicit type casting is done by compiler automatically
//it is safe because we are converting from small to big size