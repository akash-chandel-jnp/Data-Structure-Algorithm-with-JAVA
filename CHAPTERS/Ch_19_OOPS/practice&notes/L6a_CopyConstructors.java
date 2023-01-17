public class L6a_CopyConstructors {
    public static void main(String[] args) {
        
        Student s1 = new Student(23,"akash");

        // copying the properties of s1 into s2;
        Student s2 = new Student(s1); // except password other details have been copied .
        s2.password ="naya password";


    }

}

class Student{
    int roll;
    String name;
    String password;

    Student(int roll, String name){
        this.roll = roll;
        this.name = name;
        
    }

    // copy constructor taking another object (student) as parameter
    Student (Student s){// copying data of s object to calling(this) object
        this.roll = s.roll; // roll no. of s object  becomes roll no of calling(this) object
        this.name = s.name; // name of s object  becomes roll no of calling(this) object
        //note we hava not copied password as we want to assign it separately and not copy it

    }

}