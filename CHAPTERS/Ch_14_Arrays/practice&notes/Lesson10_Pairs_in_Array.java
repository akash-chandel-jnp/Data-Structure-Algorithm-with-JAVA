public class Lesson10_Pairs_in_Array {
    public static void distinct_pair_in_array(int numbers[]){
        for (int i = 0; i<numbers.length; i++){
            int current_item =numbers[i]; // not nececassary line no. 4
            for (int j = i+1; j<numbers.length ; j++){
                
                System.out.print("( " + current_item +" , "+  numbers[j]+ " )");
                
                // System.out.print("( " + numbers[i] +" , "+  numbers[j]+ " )"); // use when line no. 4 is not used
            }
            System.out.println();
        }
    }
    
    
    public static void main(String[] args) {
        int numbers[ ] = { 2, 4, 6, 8, 10 , 12};

        distinct_pair_in_array(numbers);


    }
}
