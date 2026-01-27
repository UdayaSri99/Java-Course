//Relational operators : relational operators are used to compare two values or expressions. They return a boolean value (true or false) based on the comparison.  
// There are six main relational operators in Java:
// 1. Equal to (==): Returns true if both operands are equal.
// 2. Not equal to (!=): Returns true if both operands are not equal.
// 3. Greater than (>): Returns true if the left operand is greater than the right operand.
// 4. Less than (<): Returns true if the left operand is less than the right operand.
// 5. Greater than or equal to (>=): Returns true if the left operand is greater than or equal to the right operand.
// 6. Less than or equal to (<=): Returns true if the left operand is less than or equal to the right operand. 

public class RelationalOperators {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        // Equal to
        System.out.println("a == b: " + (a == b)); // false

        // Not equal to
        System.out.println("a != b: " + (a != b)); // true

        // Greater than
        System.out.println("a > b: " + (a > b)); // false

        // Less than
        System.out.println("a < b: " + (a < b)); // true

        // Greater than or equal to
        System.out.println("a >= b: " + (a >= b)); // false

        // Less than or equal to
        System.out.println("a <= b: " + (a <= b)); // true
    }
}