package Interface;


public class Bike implements Vehicle{
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        System.out.println(bike.noOfTyres());
        bike.typeOfEngine();
        Bike b = new Bike();
        b.color();
        System.out.println(b.MaxSpeed());
    }

    @Override
    public void typeOfEngine() {
        System.out.println("Petrol");
    }

    @Override
    public int noOfTyres() {
        return 2;
    }
    public void color(){
        System.out.println("Red");
    }
    public int MaxSpeed(){
        return 200;
    }

}
