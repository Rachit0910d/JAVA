package Abstraction.Challenge1;

public class Square extends Shape{
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void calculateArea(){
        double area = side * side;
        System.out.println("The area the Square is : "+area);
    }
}
