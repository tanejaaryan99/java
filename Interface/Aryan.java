package Interface;

public class Aryan implements Human{
    public static void main(String[] args) {
//        this.height();
//        System.out.println(this.age());
//        this.DOB();
//        this.education();
//        this.college();
    }

    @Override
    public void height() {
        System.out.println("5'8 foot");
    }

    @Override
    public void DOB() {
        System.out.println("31/03/2002");
    }

    @Override
    public int age() {
        return 21;
    }

    @Override
    public void education() {
        System.out.println("UnderGraduate");
    }
    public void college(){
        System.out.println("Chitkara University");
    }
}
