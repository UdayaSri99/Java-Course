//Assignment Operators : Assignment operators are used to assign values to variables. 
//  a) = is used to assign a value to a variable
//  b) += is used to assign a value to a variable by adding it to the existing value
//  c) -= is used to assign a value to a variable by subtracting it from the existing value
//  d) *= is used to assign a value to a variable by multiplying it with the existing value
//  e) /= is used to assign a value to a variable by dividing it from the existing value
//  f) %= is used to assign a value to a variable by taking the modulus of the existing value


public class AssignmentOperator{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        System.out.println("the value of a:"+ a +"the value of b is:"+ b);
        a+=b;
        System.out.println("the avlue after addition"+ a);
        a-=b;
        System.out.println("the avlue after Subtraction "+ a);
        a*=b;
        System.out.println("the avlue after Multiplication "+ a);
        a/=b;
        System.out.println("the avlue after Division "+ a);
        a%=b;
        System.out.println("the avlue after Modulus "+ a);

    }
}