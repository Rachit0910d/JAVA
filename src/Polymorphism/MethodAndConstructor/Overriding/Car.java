package Polymorphism.MethodAndConstructor.Overriding;

public class Car extends Vehicle{

    @Override
    public void start(){
        super.start();
        int buttons = 4;
        System.out.println(buttons);
    }
}
