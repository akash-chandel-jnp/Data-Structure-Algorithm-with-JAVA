import java.lang.reflect.Array;
import java.util.ArrayList;


public class L6_b_multidimentional_arraylist_using_forLoop {
  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
    ArrayList<Integer> list0 =new ArrayList<>();
    ArrayList<Integer> list1 =new ArrayList<>();
    ArrayList<Integer> list2 =new ArrayList<>();

    for(int i = 1;i<6;i++){
        list0.add(i*1);
        list1.add(i*2);
        list2.add(i*3);
    }
    
// adding sublist into the mainlist 
mainList.add(list0);
mainList.add(list1);
mainList.add(list2);

System.out.println((mainList) + " mainList"); 


//printing the main arraylist by iteration method 
for(int i=0;i<mainList.size() ; i++){
    
    ArrayList<Integer>   currList = mainList.get(i);  // getting each arraylist at a time 
    System.out.print("list"+i + "  ");
    
    for(int j =0; j<currList.size();j++){ // printing each arraylist elements on by one using loop;
        System.out.print(currList.get(j)+ ", ");
    }
    System.out.println();
    
}
  }  
}
