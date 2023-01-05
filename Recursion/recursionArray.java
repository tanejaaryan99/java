package Recursion;

public class recursionArray {
    public int Max(int[]arr){
        return Max(arr,0,arr.length-1);
    }
    private int Max(int[]arr , int lo , int hi){
        if(lo == hi){
            return arr[lo];
        }
        int ans = Max(arr , lo+1 , hi);
        return Math.max(ans, arr[lo]);
    }
    private class isPresentPair{
        int khaHai = -1;
        boolean haikya = false;
    }
    public void isPresent(int[] arr , int target){
        isPresentPair p = yeHaiKya(arr, target ,0,arr.length-1);
        System.out.println(p.haikya + " " + p.khaHai);
    }
    private isPresentPair yeHaiKya(int[]arr ,int target , int lo,int hi){
        if(lo>hi) {
            return new isPresentPair();
        }
        if(lo == hi){
            if(arr[lo] == target){
                isPresentPair p = new isPresentPair();
                p.khaHai = lo;
                p.haikya = true;
                return p;
            }
        }

        isPresentPair p = yeHaiKya(arr , target ,lo+1,hi);
        if(p.haikya){
            return p;
        }
        return new isPresentPair();
    }

    public int lastOccInArr(int[]arr , int tar){
        return AakhriBaarKbAya(arr,tar,0);
    }
    private int AakhriBaarKbAya(int[]arr ,int target , int lo){

        if(lo > arr.length){
            return lo-1;
        }
        int idx = AakhriBaarKbAya(arr,target,lo+1);
        if(idx != -1){
            return idx;
        }
        else{
            if(arr[lo] == target){
                return lo;
            }
            return -1;
        }
    }

}
