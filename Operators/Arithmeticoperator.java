//operators : opeators are special symbols that perform specific operations on one, two, or more operands and then return a result.
//operands : operands are the values or variables on which the operators perform operations.
//Arthmetic Operators : Arthmetic operators are used to perform mathematical operations such as addition, subtraction, multiplication, division, and modulus.

public class Arithmeticoperator {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        System.out.println("Addition: " + (a + b)); // Addition
        System.out.println("Subtraction: " + (b - a)); // Subtraction
        System.out.println("Multiplication: " + (a * b)); // Multiplication
        System.out.println("Division: " + (b / a)); // Division
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);
        --a;
        System.out.println(a);
        ++a;
        System.out.println(a);

    }
}