package leetCode.countNums_204;

public class countNum {
    public static void main(String[] args) {
        System.out.println(sol(3));
    }

    public static int sol(int n){
        int ans = 0;
        for(int i = 2;i<n;i++){
            if(checkPrime(i)) ans++;
        }
        return ans;
    }
    public static boolean checkPrime(int n){
        if(n <= 1) return false;
        if(n == 2) return true;
        if(n == 3) return true;
        for(int i = 2;i<n;i++){
            if(n%i == 0) return false;
        }
        return true;
    }
}
