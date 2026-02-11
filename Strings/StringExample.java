package Strings;

public class StringExample{
    public static void main(String[] args){
        String str1 = "Hello World";
        String str2 = "I am UdayaSri";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("The Length of str1 is " + str1.length());
        System.out.println("the Char at index5  of str2 is " + str2.charAt(5));
        System.out.println("the index of 'a' in str2 is " + str2.indexOf('a'));
        System.out.println(str2.indexOf('a', str2.indexOf('a') + 1)); 
        System.out.println(str1.substring(0, 5));            
        System.out.println(str1.contains("World"));               
        System.out.println(str1.equals("Hello World"));
        System.out.println(str1.equalsIgnoreCase("hello world")); 
        System.out.println(str1.toLowerCase());                   
        System.out.println(str1.toUpperCase());                   
        System.out.println(str1.trim());                           
        System.out.println(str1.replace('o', 'a'));              
        System.out.println(str1.startsWith("Hello"));               
        System.out.println(str1.endsWith("World"));                   
    }
}