package BitManipulation;

public class ithBit {
    public static void main(String[] args) {
        int num = 7;
        int i = 2;
        System.out.println("Ith Bit is : "+ findingBit(num,i));
        System.out.printf("Ith Bit is set to : %d\n", settingBit(num,i));
        System.out.println("Ith Bit is reset to : "+ resetBit(num,i));
    }

    // if the ith bit is 1 --> it will give me 1
    // if ith bit is 0 --> it will give me 0  (because of the use of & (AND) operator)
    private static int findingBit(int num, int i){
        return num & (1<<(i-1));
    }

    // if the ith bit is 1 --> it will remain 1
    // if ith bit is 0 --> it will be set to 1  (because of the use of | (OR) operator)
    private static int settingBit(int num, int i){
       return num | 1<<(i-1);
    }

    // if the ith bit is 1 --> it will be changed to 0
    // if ith bit is 0 --> it will remain 0  (because of the use of ~ (Compliment) operator)
    private static int resetBit(int num, int i){
        return ~(num & (1<<(i-1)));
    }
}
