package String;
import java.util.*;
public class reverseString {

    public static void main(String[] args){
        reverseString obj = new reverseString();

        String input1 = "Strive" ;
        System.out.println(obj.reverse(input1));
    }
    public String reverse(String input){
        if(input == null){
            return null;
        }
        return reverse(input.toCharArray());
    }

    private String reverse(char[] input) {
        int i = 0;
        int j = input.length-1;

        while (i <j) {
            swap(input, i, j);
            i++;
            j--;
        }
        return String.valueOf(input);
    }

    private void swap(char[] input, int i, int j){
        char temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }


}
