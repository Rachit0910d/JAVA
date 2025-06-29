package Inheritance;

public class Vehicle {


    protected int noOfTires;

    public void commute(){
        System.out.println("I am going to hell.");
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }
}
