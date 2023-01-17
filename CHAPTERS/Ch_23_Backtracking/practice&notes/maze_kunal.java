public  class maze_kunal  {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        print_maze_route(3,3,"");
//        grid_path(na"");df

    }

    static int count (int r , int c ){
        if(r==1 || c==1){
            return 1;
        }
        int down_ans = count(r-1,c);  // if going downwards reduce rows by 1
        int right_ans = count(r,c-1);
        return  down_ans + right_ans;
    }

    static void print_maze_route(int row , int col, String path){
        if(row==1 && col==1){ // have to print only if both are 1,1 means reach in the bottom right corner
            System.out.println(path + " ");
            return;
        }
        //move down--> but only if row >1
        if(row!= 1){
            print_maze_route(row-1 , col , path+" -> D");
        }


        //move left--> only if col > 1 ;
        if(col !=1){
            print_maze_route(row, col-1, path+" -> R");
        }


    }
    // grid problem (0,0) to (n-1 , m-1) --> apna college
    static void grid_path(int n , int m , String path ){


        //go downwards
        grid_path(n);

        // go rightwards

    }

}