package Arrays;
import Stacks.StackMethods;


public class ArrayStacks {
    public static void main(String[] args){

        StackMethods s = new StackMethods();
        s.stack(10);
        s.push(6);
        s.push(7);
        s.push(88778);
        s.push(8);
        s.display();
//        s.push(99);
//        s.push(999);
        System.out.println(s.peek());
//        s.display();
    }


}
