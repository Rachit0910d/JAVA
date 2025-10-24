package ValuePassing;

public class passByValue {
    public static void main(String[] args) {
        int x = 23;
        int y = 34;
        System.out.println("x = "+x+",y = "+y); // but here it will print x = 23
        System.out.println("result = "+add(x,y));
    }

    public static int add(int x, int y){
         x += y;
        return x; // here x is assigned to new value 57
    }
}
