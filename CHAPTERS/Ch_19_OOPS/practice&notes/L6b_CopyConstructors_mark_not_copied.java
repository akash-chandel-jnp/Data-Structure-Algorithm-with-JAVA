import javax.swing.plaf.basic.BasicBorders.MarginBorder;

public class L6b_CopyConstructors_mark_not_copied {
    public static void main(String[] args) {
        
        Student s1 = new Student(23,"akash");
        s1.marks[0] =86;
        s1.marks[1] = 94;
        s1.marks[2] = 80;

        // copying the properties of s1 into s2;
        Student s2 = new Student(s1); // except password other details have been copied .
        s2.password ="naya password";

        s1.name = "atul";
        System.out.println(s2.name);
        
        for(int i= 0;i<s2.marks.length;i++){
            System.out.println(s2.marks[i]);
        }

        s1.marks[2]=100;

        for(int i= 0;i<s2.marks.length;i++){
            System.out.println(s2.marks[i]);
        }

    }

}

class Student{
    int roll;
    String name;
    int marks[]; // for 3 subjects
    String password;

    Student(int roll, String name){
        marks = new int[3];
        this.roll = roll;
        this.name = name;
        
        
    }

    // copy constructor taking another object (student) as parameter
    Student (Student s){ // only shallow copy constructor not deep copy
        marks = new int[3];
        this.roll = s.roll; 
        this.name = s.name; 
        this.marks = s.marks;
        
    }

}