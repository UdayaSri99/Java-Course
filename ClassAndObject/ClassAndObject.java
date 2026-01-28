package ClassAndObject;

class Student{
    String Name;
    int Age;
    String Gender;

    Student(String Name, int Age, String Gender){
        this.Name = Name;
        this.Age = Age;
        this.Gender= Gender;
    }
    void SchoolName(){
        System.out.println("ZPHS Nidamanuru");
    }
    void info(){
        System.out.println("the name of the Student is " + Name);
        System.out.println("The Age of the Student is " + Age);
        System.out.println("the Gender of the Student is" + Gender);
    }
}
public class ClassAndObject{
    public static void main(String[] args){
        Student std1 = new Student("Ammu" , 22, "Female");
        Student std2 = new Student("Priya", 25, "Female");
        Student std3 = new Student("Srinu", 40, "Male");
        std1.SchoolName();  
        std1.info();
        std2.info();
        std3.info();
    }
}