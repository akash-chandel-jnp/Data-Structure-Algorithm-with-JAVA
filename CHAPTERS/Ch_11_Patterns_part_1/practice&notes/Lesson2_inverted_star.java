public class Lesson2_inverted_star{
    public static void main(String[] args) {
        for (int line = 1; line <= 5; line++ ){

            for ( int star = 1; star <= 5-line +1 ;  star = star-1 ) {
                System.out.print("*");
            
            }
            System.out.println("");
            
        }
    }
}