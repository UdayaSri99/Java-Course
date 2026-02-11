package Strings;

public class StringExample {
    public static void main(String[] args){
        String str1 = "Hello World";
        String str2 = ("Here I Am to Learn Java Programming");
        
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("Length of str1 is " + str1.length());
        //charAt() method is used to get the character at a specific index in a string. The index starts from 0.            
        System.out.println("Character at index 1 of str2 is " + str2.charAt(1));
        //substring() method is used to extract a portion of a string. It takes two parameters: the starting index and the ending index (exclusive).
        System.out.println("Substring of str2 from index 5 to 10 is " + str2.substring(5,10));
        //toUpperCase() method is used to convert all characters in a string to uppercase.  
        System.out.println("str1 in uppercase is " + str1.toUpperCase());
        //toLowerCase() method is used to convert all characters in a string to lowercase.
        System.out.println("str2 in lowercase is " + str2.toLowerCase());
        //equals() method is used to compare two strings for equality. It returns true if the
        //strings are equal, and false otherwise.
        String str3 = "Hello World";
        System.out.println("str1 equals str3: " + str1.equals(str3));
        //indexOf() method is used to find the index of the first occurrence of a specified character or substring in a string. It returns -1 if the character or substring is not found.
        System.out.println("Index of 'World' in str1 is " + str1.indexOf("World"));
        

    }
}
