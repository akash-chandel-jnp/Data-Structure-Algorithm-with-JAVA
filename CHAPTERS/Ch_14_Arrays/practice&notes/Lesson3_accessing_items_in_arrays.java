/* UPDATING AN ARRAY AND PRINTING ARRAY USING FOR LOOP  */

public class Lesson3_accessing_items_in_arrays {
    public static void main(String[] args) {
        int sub_marks[] = new int[5];
        sub_marks[0] = 85;
        sub_marks[1] = 75;
        sub_marks[2] = 65;
        sub_marks[3] = 80;
        sub_marks[4] = 82;

        int avg_marks = (sub_marks[0]+sub_marks[1] + sub_marks[2] + sub_marks[3] + sub_marks[4] )/5;
        System.out.println("avg marks is : " + avg_marks);

        // Deduct 5 marks from each subject marks..

        for (int i=1; i<sub_marks.length; i++){
            sub_marks[i] = sub_marks[i] -5;

        }


        // // print updated array 

        for (int i = 0 ; i<sub_marks.length ; i++){
            // System.out.print();
            System.out.print( sub_marks[i] + " " );
        }

    }    
}
