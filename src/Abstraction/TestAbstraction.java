package Abstraction;

public class TestAbstraction {
    public static void main(String[] args) {
//        Vehicle testCase1 = new Vehicle(2);
        Car car;
        car = new Car();
        car.commute();
        car.getSetGo();
        car.setNoOfTires(4);
        car.StratSound();

    }
}
