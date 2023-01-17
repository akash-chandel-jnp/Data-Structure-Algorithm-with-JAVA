import java.util.ArrayList;
import java.util.Collections;
public class L5_sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(8);
        list.add(25);
        list.add(16);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder()); // it is used for sorting in descending order.
        System.out.println(list);

    }

    
}
