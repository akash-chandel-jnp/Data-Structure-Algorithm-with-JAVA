public class L1_Creating_Node{
    public static void main(String[] args) {
        
    }
    class LinkedList{

        public class Node{
            int data;           // property of node
            Node next;          // property of node
            
            Node(int data){              // node constructor taking data only while creation ,   
                this.data = data;           
                this.next = null;        //next will be nill by default until next node is created
                
            }
        }
    }
}