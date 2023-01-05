package Stacks;

public class StackMethods {
    public int arr[];
    public int tos = -1;
    public int size = 0;

    public void stack(int cap){
        arr = new int[cap];
    }
    public void push(int val)
    {
//        if(arr.length > size) {throw new Exception("Stack Full");}
        arr[tos+1] = val;
        tos++;
        size++;
    }

    public void pop(){
        tos--;
        size--;
    }

    public boolean isEmpty() {
        if (tos == -1) {
            return true;
        } else {
            return false;
        }
    }

    public int peek(){
        if(tos == -1){
            return -1;
        }
        else{
            return arr[tos];
        }
    }
    public void display(){
        int topTemp = tos;
        while(topTemp != -1){
            System.out.println(arr[topTemp]);
            topTemp--;
        }
    }
}
