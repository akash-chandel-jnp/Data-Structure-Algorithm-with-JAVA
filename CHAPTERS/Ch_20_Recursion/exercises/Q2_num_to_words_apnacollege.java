public class Q2_num_to_words_apnacollege {
    static String num_arr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
    
    
    public static void num_to_words( int num){
        if(num == 0){
            System.out.println("completed");
            return;
        }
        
        int last_digit = num% 10;
        num_to_words(num/10);
        System.out.print(num_arr[last_digit]+  " ");

    }
    public static void main(String[] args) {
        int num = 42345;
        num_to_words(num);
        
    }
}
