public class L5a_constructors{
    public static void main(String[] args) {
        Student s1 = new Student();
        
    }

}

class Student{
    int roll;
    String name;

    Student(){ // no need to mention return type like void , string, etc.
        System.out.println("constructor is being called ..");

    }
}