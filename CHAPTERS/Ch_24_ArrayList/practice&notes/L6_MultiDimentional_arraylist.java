import java.util.ArrayList;

public class L6_MultiDimentional_arraylist {
    public static void main(String[] args) {
        //creating main arraylist
        ArrayList<ArrayList<>> mainList = new ArrayList<>();

        //creating first sublist list1 
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(list1);

        // adding list1 into main list 
        mainList.add(list1);
        System.out.println(mainList);

        //creating 2nd sublist list2 
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);
        System.out.println(list2);

        // adding list1 into main list 
        mainList.add(list2);
        System.out.println(mainList);

        //creating 2nd sublist list2 
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("a");
        list3.add("b");
        list3.add("c");
        list3.add("d");
        list3.add("e");
        System.out.println(list3);

        // adding list1 into main list 
        mainList.add(list3);
        System.out.println(mainList);


    }
    
}
