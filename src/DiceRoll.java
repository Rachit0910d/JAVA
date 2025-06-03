public class DiceRoll {

      public static int getNumber(){
        return (int)Math.round(Math.ceil(6 * Math.random()));
    }

    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            int a = getNumber();
            System.out.println(a);
        }
    }
}
