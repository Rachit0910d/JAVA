package Abstraction.Challenge1;

public class Circle extends Shape{

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

        @Override
        public void calculateArea() {
            double area = Math.PI * radius * radius;
            System.out.println("The area of the circe is : " + area);
        }
}







