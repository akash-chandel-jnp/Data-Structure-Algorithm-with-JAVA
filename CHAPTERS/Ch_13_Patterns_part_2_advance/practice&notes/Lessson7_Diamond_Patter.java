public class Lessson7_Diamond_Patter {
    
    public static void diamond_pattern(int n){
        //printing upper half
        for(int i = 1 ; i<= n; i++){ // outer loop // lines in upper half is n
            
            // printing spaces
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            // print stars
            for (int j=1;j <= (2*i-1); j++){
                System.out.print("*");
            }System.out.println();
        } 
        // printing bottom half
        for(int i = n ; i>=1 ; i--){ // outer loop in reverse order ; from n to 1; rest logic is exactly same
            
            // printing spaces
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            // print stars
            for (int j=1;j <= (2*i-1); j++){
                System.out.print("*");
            }System.out.println();
        }
    }
    
    public static void main(String[] args) {
        //calling diamond_pattern function ; 
        diamond_pattern(4);        
    }
    
}
