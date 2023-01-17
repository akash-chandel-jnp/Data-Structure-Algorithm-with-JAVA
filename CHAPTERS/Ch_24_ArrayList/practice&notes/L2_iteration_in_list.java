import java.util.ArrayList;

public class L2_iteration_in_list {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(12);
        list.add(16);
        System.out.println(list);
        for(int i =list.size()-1;i>=0;i--){
            System.out.print(list.get(i) +" ");
        }



    
    }
}
