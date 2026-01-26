package Basics;
public class DataTypes{
    public static void main(String[] args){
        System.out.println("Data Types In Java ");
        System.out.println(2+3);
        int int1 = 3;
        int int2 = 4;
        int int3 = int1+int2;
        System.out.println("the sum is: " + int3);
        byte by = 125;
        short sh = 558;
        long  l = 5856l; //long need to put l at last to make sure saying its long
        float f = 5.8f; // here 5.8 is double but when you want to mention it as float you have mention f in the last 
        double d = 5.8;
        char c = 'k';
        boolean b = true;
        
        System.out.println("byte value is: " + by);
        System.out.println("short value is: " + sh);
        System.out.println("long value is: " + l);
        System.out.println("float value is: " + f);
        System.out.println("double value is: " + d);
        System.out.println("char value is: " + c);
        System.out.println("boolean value is: " + b);

    }
}


//Primitive: integer, float, characters , boolean
//integer : int-4bytes, byte=1 byte , short-2 bytes, Long - 8bytes
//char : 2 bytes for char we have to use only single quots ''
//Boolean in java Is only True or false not 0 or 1 like others
//float : 4 bytes
//double : 8 bytes


//Non primitive : String , Arrays , Classes , Interfaces
// String is not a primitive data type it is a class , a string is a sequence of characters
//Arrays is a collection of similar data types
//Classes are blueprints for creating objects
//Interfaces are contracts that classes can implement