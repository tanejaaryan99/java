package String;

public class classVar {
    public static void main(String[] args) {
        ansBadalDe obj = new ansBadalDe();
        obj.ans = 0;
        changeAns(obj);
        System.out.println(obj.ans);

    }
    public static void changeAns(ansBadalDe obj){
        obj.ans = 10;
    }
}

class ansBadalDe{
    public int ans;

}
