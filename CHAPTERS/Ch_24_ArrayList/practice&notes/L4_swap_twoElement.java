import java.util.ArrayList;

import javax.print.attribute.standard.DialogTypeSelection;;

public class L4_swap_twoElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(12);
        list.add(16);
        System.out.println(list);
        
        // swap indx1 =2 and indx2= 3; 
        
        // list.get(2) =list.get(3); 
        // this will not work as in arraylist values update ke liye set operation use hota hai..so do as below..
        
        int temp = list.get(2);
        list.set(2, list.get(3)); // index 2 par value of index 3 set kar diya
        list.set(3, temp);              //index 3 ppar value of temp set kar DialogTypeSelection

        System.out.println(list);

        // swap(list, 2, 3);
        // System.out.println(list);




    
    }

    // creating funciton for swapping

    public static void swap(ArrayList<Integer> list, int indx1,int indx2){
        int temp = list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2, temp);
        

    }
    
}
