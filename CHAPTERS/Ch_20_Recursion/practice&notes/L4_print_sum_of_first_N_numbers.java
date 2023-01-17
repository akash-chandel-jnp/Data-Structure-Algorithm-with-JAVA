

public class L4_print_sum_of_first_N_numbers {
    public static int sum_of_n_numbers(int n ){
        
        if(n == 0){
            return  0;
        }
        // int sumofPrevious = sum_of_n_numbers(n-1);
        // int sumOfFirstNnum = n +sumofPrevious;
        int sumOfFirstNnum = n + sum_of_n_numbers(n-1);

        return sumOfFirstNnum;

    }
    public static void main(String[] args) {
        System.out.println(sum_of_n_numbers(10));
        // sum_of_n_numbers(10);
        
    }
}
