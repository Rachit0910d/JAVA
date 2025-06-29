package in.kgCoding.equals;

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {
        Person person1 = new Person("Rachit", 19, "420");
        Person person2 = new Person("Rachit", 19, "420");

        if(person1.equals(person2)){
            System.out.println("Equals");
        }
        else System.out.println("Not Equals");
    }
}
