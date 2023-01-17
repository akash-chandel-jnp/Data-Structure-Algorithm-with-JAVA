public class L11_Interfaces {
    public static void main(String[] args) {
        Queen q1 = new Queen();
        q1.moves();        
        
    }
    
}

interface ChessPlayer{
    void moves(); // implementation cannot be written for any function in interface

}

class Queen implements ChessPlayer{
    public void moves(){ // must be public
        System.out.println(" up , down left, right, diagonal (in all directions");
    }

}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down , left , right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down , left , right , diagonal (by 1 step)");
    }
}