package Abstraction;

public class Car extends Vehicle implements Transport{

    private int noOfDoors;

    public Car() {
        super(4);
    }


    @Override
    public void StratSound() {
        System.out.println("Vroommm.....");
    }

    @Override
    public void getSetGo(){
        System.out.println("going going.....");
    }
}
