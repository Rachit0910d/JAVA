package Polymorphism.MethodAndConstructor.Overriding;

public class Plane extends Vehicle{

    @Override
    public void start(){
        double i = 34.45;
        double j = 454.44;
        System.out.println(i+j);
    }
}
