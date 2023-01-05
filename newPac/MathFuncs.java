package newPac;

public class MathFuncs {
    public static int gcd(int dividend, int divisor){
//        int min = Math.min(dividend, divisor);
        int rem = 1;
        while(divisor != 0){
            rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }
        int ans = dividend;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(gcd(16,24));
    }
}
