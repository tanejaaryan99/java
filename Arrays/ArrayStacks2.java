package Arrays;
import Stacks.StackMethods;

public class ArrayStacks2 extends StackMethods{

    int res[];
    public void push(int val){
        if(size>=arr.length){
            res = new int[arr.length*2];
        }
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        arr = res;
        tos++;
        res[tos] = val;
        size++;

    }
}
