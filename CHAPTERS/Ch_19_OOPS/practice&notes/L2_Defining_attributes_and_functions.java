

public class L2_Defining_attributes_and_functions {
    public static void main(String[] args) {
        Pen p1 = new Pen() ; // created a pen object using blueprint created in class pen // pen( ) is called constructor.// created in heap memory as new keyword is used
        p1.setColor("Blue");
         
        Student std1 = new Student();
    }

class Pen{ // creating class blueprint // but not created pen object , will be created only when we call it in public class above
    String color ; // every pen object created will have color attribute
    int tip; // attribute tip size
    
    void setColor(String newcolor ){  // object has function for changing color
        color =  newcolor ;
    } 

    void setTip(int NewTip){
        tip = NewTip; 
    }
}


class Student{
    String name ; 
    int age;
    int standard;
    float percemtage ; 
    void calcPercentage(int phy, int chem, int maths){
        percemtage = (phy + chem + maths) / 3 ; 
    }

}

 // object like pen etc
}
