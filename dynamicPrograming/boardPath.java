package dynamicPrograming;

public class boardPath {
    public static void main(String[] args) {
        System.out.println(sol(0,10,6));
        System.out.println(solTopDown(0,1000,6,new int[1000]));
        System.out.println(solBottomUp(0,1000,6));
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

    public static int solTopDown(int src , int dest, int dice,int arr[]){ // memoization
        int cnt = 0;
        if(src== dest) return 1;
        if(src > dest) return 0;
        if(arr[src] != 0) return arr[src];
        for(int i = 1;i<=dice;i++){
            cnt += solTopDown(src+i,dest,dice ,arr);
        }
        arr[src] = cnt;
        return cnt;
    }

    public static int solBottomUp(int src , int dest , int dice){
        int arr[] = new int[dest+dice+1];
        arr[dest] = 1;
        int sum = 1;
        for(int i = dest-1 ; i>=0;i--){
            int cnt = 0;
            for (int j = 1; j<=dice ; j++) {
                cnt += arr[i+j];
            }
            arr[i]=cnt;
//            arr[i] = sum;
//            sum+=arr[i];
        }
        return arr[0];
    }
}
