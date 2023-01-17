public class L5b_constructors {
    public static void main(String[] args) {
        Students s1 = new Students(5,"akash");
        System.out.println(s1.roll + " " + s1.name);
        
    }

}

class Students{
    int roll;
    String name;

    Students(int rollno , String name){   // no need to mention return type like void , string, etc.
        this.roll = rollno;
        this.name = name;
    }
}

