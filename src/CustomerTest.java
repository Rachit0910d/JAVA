import java.util.Scanner;

public class CustomerTest {
    public static void main(String[] args) {
        BankAccount customer1  = new BankAccount(928990639, "Rachit", 10924.45);
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the HDFC bank online service ! \n");
        System.out.println("Enter the money you want to deposit in your account : ");
        double deposit = sc.nextDouble();

        System.out.println("Enter the amount you want to withdraw from your account : ");
        double withdraw = sc.nextDouble();

        double newBalance = customer1.depositMoney(deposit);
        double remainingBalance = customer1.withdrawMoney(withdraw);

        System.out.println("The New Balance After Depositing money in your account is : "+newBalance);
        System.out.println("The New Balance After withdrawing money from your account is : "+remainingBalance);

    }
}
