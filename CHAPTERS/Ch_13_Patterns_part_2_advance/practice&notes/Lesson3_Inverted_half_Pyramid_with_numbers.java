/*
 123456
 12345
 1234
 123
 12
 1
 */

public class Lesson3_Inverted_half_Pyramid_with_numbers {
    public static void  print_inverted_num_pyramid(int tot_rows){

        // no. of lines
        for (int i = 1; i<= tot_rows ; i++){
            
            for(int j = 1; j<= (tot_rows- i +1);j++){
                
                System.out.print(j);
            }
            System.out.println();
        }

    }
    
    public static void main(String[] args) {
        print_inverted_num_pyramid(6);
    }
    
}
