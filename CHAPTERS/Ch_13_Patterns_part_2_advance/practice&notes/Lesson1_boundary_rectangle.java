/*print pattern like below: 

   * * * * * * * * *
   *               *
   *               *
   * * * * * * * * *
   
 */

public class Lesson1_boundary_rectangle{
    public static void print_boundary_rectangle(int tot_rows, int tot_columns) {
        for (int i = 1 ; i<=tot_rows; i++){           // no. of lines (rows) -- outer loop
            for (int j =1 ; j<=tot_columns; j++){
                
                // condition for boundary
                if(i==1 || i== tot_rows || j==1 || j==tot_columns){
                    System.out.print("*");
                }else{ System.out.print(" ");}  // for non boundary location print empty spaces
            }
            System.out.println();

        }
        
    }

    public static void main(String[] args) {

        print_boundary_rectangle(4, 5 );
        
    }
}