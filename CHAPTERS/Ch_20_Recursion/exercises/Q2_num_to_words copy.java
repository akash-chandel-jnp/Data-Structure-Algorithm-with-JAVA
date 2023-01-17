public class Q2_num_to_words {
    public static void num_to_words( int num, int i){

        // 45654 
        String str_num = Integer.toString(num);
        String num_arr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        if(i == str_num.length()){
            System.out.println("completed");
            return;
        }
        
        System.out.print ((num_arr[(int)str_num.charAt(i) - (int)str_num.charAt(0)])+ " ");
        num_to_words(num, i+1);
    }

    public static void main(String[] args) {
        int num = 42345;
        num_to_words(num, 0);
        
    }
}
