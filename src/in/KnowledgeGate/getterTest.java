package in.KnowledgeGate;
import in.getterSetter.Car;
public class getterTest {


    public static void main(String[] args) {
        Car car = new Car("Red", "BMW", 3, 5000);
        System.out.printf("%s,  %s",car.getColor(), car.getModal());


    }
}
