package Abstraction;

public abstract class Vehicle implements Transport {
    private int noOfTires;


    public abstract void StratSound();
    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public void commute(){
        System.out.println("going......");
    }


}
