//Logical Operators :
// Logical operators are used to perform logical operations on boolean values.
// There are three main logical operators in Java:
// 1. Logical AND (&&): Returns true if both operands are true.
// 2. Logical OR (||): Returns true if at least one operand is true.
// 3. Logical NOT (!): Returns true if the operand is false (inverts the value).

public class LogicalOperator{
    public static void main(String[] args){

        boolean a = true;
        boolean b = false;
        // Logical AND
        System.out.println("a && b" + (a && b)); // false
        // Logical OR
        System.out.println("a || b " + (a || b)); // true
        // Logical NOT
        System.out.println("!a " + (!a)); // false
        System.out.println("!b " + (!b)); // true
    }

}