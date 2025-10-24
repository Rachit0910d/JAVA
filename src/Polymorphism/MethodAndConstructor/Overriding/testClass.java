package Polymorphism.MethodAndConstructor.Overriding;

public class testClass {

    public static void main(String[] args) {
        Car c = new Car();
        Plane p = new Plane();
        Bus b = new Bus();

        c.start();
        p.start();
        b.start();
    }
}
