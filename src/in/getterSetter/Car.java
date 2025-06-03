package in.getterSetter;

public class Car {
    private String color;

    private String modal;

    private double fuelLevel;

    private long costOfPurchase;

    public Car(String color, String modal, double fuelLevel, long CostOfPurchase){
        this.color = color;
        this.modal = modal;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;

    }

    public String getColor(){
        return color;
    }

    public String getModal(){
        return modal;
    }
}
