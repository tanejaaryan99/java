package Arrays;

public class ArrayWithAllDT {
    public static void main(String[] args) {

        Object[] arr = new Object[5];
        arr[0] = 1;
        arr[1] = false;
        arr[2] = "a";
        arr[3] = "Hello";
        arr[4] = 1.099;
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

    }
}
