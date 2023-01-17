public class Lesson4_arrayAsArguments {
    public static void main(String[] args) {
        int marks[] =  { 85, 95, 80, 75 , 65 };
        int standard = 8;
        


        // step 1: 
        // print marks before passing array as an arguments
        System.out.print(" marks before passing as an argument into any funciton ;   ");
        for (int i = 1 ; i< marks.length; i++){
            System.out.print(marks[i] + " ");
        }

        System.out.println(" ");// extra line to start from next line 

        System.out.println("standard is : (in main  function before change  :  " + standard);
        System.out.println(" ");// extra line to start from next line 

        // calling update_marks_by_5 function to update the marks
        update_marks_by_5(marks, standard);


        // print marks after  passing array as an arguments ( print by main function)
        System.out.print(" marks after  passing as an argument into any funciton ( as per main function) :   ");
        for (int i = 1 ; i< marks.length; i++){
            System.out.print(marks[i] + " ");}

        System.out.println(" ");// extra line to start from next line 

        
        System.out.println("standard is : (in main function after update : " + standard);
        


        System.out.println(" // you can notice that original array is changed as array is passed as a reference but int standard is still the same after update also .. it is only changed within the update function not in the original funciton as int is always passed as paramenter not as reference");

    }



    // step 2: 
    public static void update_marks_by_5(int  sub_marks[] ,  int standard){
        for (int i=1; i< sub_marks.length; i++){
            sub_marks[i] = sub_marks[i] + 5;
        }
         standard = 7;

        
        System.out.print(" Marks after passing as an argument : print given by called function  :  ");
        for (int j = 1 ; j< sub_marks.length; j++){
            System.out.print(sub_marks[j] + " ");
         }
         System.out.println(" ");// to go to next line after loop is finished

         System.out.println("standard is : (in update function  : " + standard);
         System.out.println(" ");// to go to next line after loop is finished
}
}

