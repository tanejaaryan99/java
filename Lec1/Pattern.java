package Lec1;

public class Pattern {
    public static void invertedRighttTriangle(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void spaceVPattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2*(n-i) ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");

            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        invertedRighttTriangle(5);
        System.out.println();
        spaceVPattern(5);
    }
}
