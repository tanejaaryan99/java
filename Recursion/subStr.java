package Recursion;

public class subStr {
    public static void main(String[] args) {
        subStr o = new subStr();
        o.subString("abc");
    }

    public void subString(String s){
        subString(s,"");
    }
    private void subString(String s, String ans){
        if(s.length() == 0) {
            System.out.println(ans);
            return;
        }
        subString(s.substring(1) , ans);
        subString(s.substring(1) , ans+s.charAt(0));
    }
}
