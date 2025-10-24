package Polymorphism;

public class TestClass {

    public static void main(String[] args) {
        Car c = new Car();
    //  Vehicle v = new Vehicle();
        Plane p = new Plane();

        CastTest2(c);
    //  castTest(v);
        castTest(p);
    //  Vehicle vCar = new Car();


    }

    private static void castTest(Vehicle veh){
    //  Car cVehicle  = (Car) veh;
        veh.start();
    //  cVehicle.start();
    //  cVehicle.noOfDoors();

    //  ((Car) veh).noOfDoors();
    }

    private static void CastTest2(Car car){
    //  Car cVehicle = new Car();
    //  cVehicle.noOfDoors();
        car.start();
    //    cVehicle.start();

    }
}
