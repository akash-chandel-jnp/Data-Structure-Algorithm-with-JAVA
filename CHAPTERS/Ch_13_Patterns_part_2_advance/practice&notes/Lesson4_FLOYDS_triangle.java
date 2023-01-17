/*

 1
 2  3 
 4  5  6 
 7  8  9  10
 11 12 13 14 15 



 */


public class Lesson4_FLOYDS_triangle {
    
    public static void floyds_triangle(int tot_rows){
        
        int num_to_print = 1;
        
        for (int i =1; i<=tot_rows; i++){  // for each lines

            for (int j =1 ; j<=i ; j++){
                
                System.out.print(num_to_print + "    ");
                
                num_to_print++;
                   
            }
            System.out.println();

        }
    }
    
    public static void main(String[] args) {
        floyds_triangle(6);

        
    }
    
}
