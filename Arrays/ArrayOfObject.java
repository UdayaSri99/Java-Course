//Arrayofobjects: An array of objects is an array that can hold multiple objects of a specific class type. Each element in the array is a reference to an object, allowing you to store and manage collections of related objects efficiently.

package Arrays;

class Student{
    String Name;
    int Age;
    int Marks;
    Student(String Name, int Age, int Marks){
        this.Name = Name;
        this.Age = Age;
        this.Marks = Marks;
    }
}

public class ArrayOfObject {
    public static void main(String[] args){
        Student s1 = new Student("Ammu" , 23, 90);
        Student s2 = new Student("Udaya" , 21 , 99);
        Student s3 = new Student("Sri", 24, 100);

        Student[] students = {s1,s2,s3};
        for(int i=0; i<students.length;i++){
            System.out.println("Students Name : "+ students[i].Name);
            System.out.print("Marks of the Students "  + students[i].Marks);
            System.out.println("Age of the Student " + students[i].Age);
        }
            //Using FOrEach Loop
            for(Student s : students){
            System.out.println("Name: " + s.Name);
            System.out.println("Age: " + s.Age);
            System.out.println("Marks: " + s.Marks);
        }
        }
    
    
}
