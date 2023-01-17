public class Lesson2_inverted_Half_rotated_Pyramid_with_Stars {
    
    public static void inverted_pyramid( int torRows){
        for (int i = 1; i<=torRows ; i++){ // how many lines to print into

            for(int j = 1 ; j<= (torRows -i); j++){  // print spaces 
                System.out.print(" ");

            }
            // now print * int same line after space is printed
            for(int k = 1 ; k <= i; k ++ ){
                System.out.print("*");
            }
            System.out.println(); // change line when space and star is printed
        }

    }
    
    
    
    public static void main(String[] args) {
        inverted_pyramid(5);
        
    }
}
