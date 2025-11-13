package Polymorphism;

public class TestClass {

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle plane = new Plane();

        testVehicle(car);
        testVehicle(plane);

        // To use methods specific to Car, we need to cast
        if (car instanceof Car) {
            Car specificCar = (Car) car;
            System.out.println("Number of doors: " + specificCar.noOfDoors());
        }
    }

    private static void testVehicle(Vehicle veh){
        veh.start();
    }
}
