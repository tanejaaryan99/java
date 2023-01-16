package dynamicPrograming;

public class boardPath {
    public static void main(String[] args) {
        System.out.println(sol(0,10,6));
    }

    public static int sol(int src , int dest, int dice){
        int cnt = 0;
        if(src== dest) return 1;
        if(src > dest) return 0;
        for(int i = 1;i<=dice;i++){
            cnt += sol(src+i,dest,dice);
        }
        return cnt;
    }
}
