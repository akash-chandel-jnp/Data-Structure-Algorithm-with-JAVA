import java.util.ArrayList;

import javax.print.attribute.standard.Sides;

public class L1_Stack_with_arrayList_making_Stacks_push_pop_peek{
    public static void main(String[] args) {
        
    }

    public static class Stack{
        ArrayList<Integer> list  = new ArrayList<>();
        //is empty function
        boolean isEmpty(){
            return list.size() == 0;
        }

        //push ---> adding elements at the top (i.e. at last)
        void push(int a){
            list.add(a);
        }

        // pop ---> remove element from the last and also returns that last element
        int pop(){
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek ---> just returns the last element but do not delete it.
        int peek  (){
            return list.get(list.size()-1); 
        }
    }
}