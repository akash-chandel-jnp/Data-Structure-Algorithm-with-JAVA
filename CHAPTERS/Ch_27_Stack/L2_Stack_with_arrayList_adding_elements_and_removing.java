import java.util.ArrayList;
import java.util.List;
public class L2_Stack_with_arrayList_adding_elements_and_removing {
    public static void main(String[] args) {
        
        // creating stack object using stack class we created
        Stack s1 = new Stack();

        // push ( adding ) elements in the stack
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        
        // printing stack elements ---> this is working only beacause i have created extra functions ( get and size ) in stack class ---> otherwise this would not work we have to use some different method to print stack elements from bottom to top.
        for (int i=0; i<s1.size();i++){
            // System.out.println(s1.get(i));
        }

        // pop the elements one by one and print it  untill the stack is empty:
        while(! s1.isEmpty()){ // while s1 is not empty  
            System.out.println(s1.peek());
            s1.pop();

        }
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
            
            if(isEmpty()){ //corner case --> if empty --> return let say -1;
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek ---> just returns the last element but do not delete it.
        int peek  (){
            
            if(isEmpty()){ //corner case --> if empty --> return let say -1; 
                return -1;
            }
            return list.get(list.size()-1); 
        }

        // size of stack ---> me adding extra functionality in stack class
        int size(){
            return list.size();
        }
        // get function for stack ---> me adding extra functionality in stack class
        int get(int b){
            return list.get(b);
        }
    }
    
}
