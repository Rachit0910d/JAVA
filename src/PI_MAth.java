import java.sql.SQLOutput;
import java.util.Scanner;


public class PI_MAth {

    double radiusInMM;

    public PI_MAth(double radiusInMM) {
        this.radiusInMM = radiusInMM;
    }

    public double getCircumference(){
        return 2 * radiusInMM * Math.PI;
    }

    public double getArea(){
        return Math.PI * Math.pow(radiusInMM, 2);
    }

    @Override
    public String toString() {
        return "The Radius of the Circle in MM is : "+ radiusInMM+"\nThe Circumference of the Circle in MM is : "+getCircumference()+"\nThe Area of the circle in MM is : "+getArea();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        double r = sc.nextInt();

        PI_MAth circumference = new PI_MAth(r);
        System.out.println(circumference);

    }
}
