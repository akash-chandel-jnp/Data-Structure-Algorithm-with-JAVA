// package class_20_Recursion.practice&notes;
// 
public class L1_printFrom_N_To_1 {
    public static void main(String[] args) {
        // int n =10;
        // for (int i=1;i<=n;i++){
        //     System.out.println(i);
        print_num_in_reverseOrder(10);
        
            
        }
        
    public static void print_num_in_reverseOrder(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        print_num_in_reverseOrder(n-1);
    }
    
    
    
    }
    
