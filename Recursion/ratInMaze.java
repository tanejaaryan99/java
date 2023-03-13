package Recursion;

public class ratInMaze {
    public static void main(String[] args) {
        maze(3,4,0,0,"");
    }

    public static void maze(int er , int ec, int cr, int cc,String ans){
        if(cr>er || cc > ec) return;
        if(cr == er && cc == ec){
            System.out.println(ans);
            return;
        }
        maze(er,ec,cr,cc+1,ans+"r");
        maze(er,ec,cr+1,cc,ans+"d");
    }
}
