import java.sql.Struct;

public class L6c_shallow_deepCopy{
    public static void main(String[] args) {
        Students s1 = new Students("akash", 38 );
            s1.marks[0]=86; 
            s1.marks[1]=90; 
            s1.marks[2]=80; 
        
            Students s2 = new Students(s1); // calling deep copy constructor 

            //printing marks of s2 ===> (86, 90,80)
            for(int i = 0; i < s2.marks.length;i++){
                System.out.print(s2.marks[i] + " ");
            }

            System.out.println();

            // changing the marks of s1 and see whether s2 changes or not 
            s1.marks[0]=50;
            s1.marks[1]=60;
            s1.marks[2]=70;

            for(int i = 0; i<s2.marks.length;i++){  
                System.out.print(s2.marks[i] +" ");  // ( 86 , 90, 80 )
            } 
            //marks of s2 will not change this time as it was deep copied  
            

    }


    
}



class Students{
    String name;
    int roll;
    int marks[];


    // normal constructor (not a copy constructor)
    Students(String name, int roll){
        marks = new int[3];// every student can have 3 subjects marks only; as this was not in argument so created separately
        this.name = name;
        this.roll = roll;
        

    }


    /*                               SHALLOW COPY CONSTRUCTOR                               */ 

    // Students(Students s){
    //     marks = new int[3];// every student can have 3 subjects marks only; as this was not in argument so created separately
    //     this.name = s.name;
    //     this.roll = s.roll;
    //     this.marks = s.marks; // (shallow copied : only reference of marks have been copied)

    // }


   /*                                  DEEP COPY CONSTRUCTOR                                            */ 
    Students(Students s){
        marks = new int[3];// every student can have 3 subjects marks only; as this was not in argument so created separately
        this.name = s.name;
        this.roll = s.roll;
        for(int i =0;i<marks.length;i++){ 
            this.marks[i] = s.marks[i];
        }
        // deep copy : each element of s.marks called and copied to new array of this.marks

    }
    
}