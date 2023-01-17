public class L2_print_inreasing_order_1_to_n {
    public static void main(String[] args) {
        print_increasing_order(10);
        
    }

    public static void print_increasing_order(int n) {
        
        if(n==1){
            System.out.print(1 + " ");
            return;}
        print_increasing_order(n-1);
        System.out.print(n + " ");
        }
    }

