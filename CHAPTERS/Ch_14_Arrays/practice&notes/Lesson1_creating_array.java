public class Lesson1_creating_array {
    public static void main(String[] args) {
        
        //method 1st to build an array
        int marks[] = new int [10]; // default value is 0
        marks[0] = 68 ;
        marks[1] = 98 ;
        System.out.println(marks[0]);

        //method 2nd to build an array
        String names[] = {"Ram", "Lakshaman", "Hanuman"};
        System.out.println(names[0]);
    }
    
}

// learning ==>>
// if array is of primitive data type like int , byte, etc... default values of elements in the array is 0
// but if the array is of OBject dadta type like INTEGER, string  etc then default value is null..