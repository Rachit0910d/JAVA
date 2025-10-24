package Exceptions;

import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("first no. = ");
        int a = sc.nextInt();
        System.out.println("Second no. = ");
        int b = sc.nextInt();

        try{
            int result = a/b;
            System.out.println(result);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index exception : "+e.getMessage());
        } catch(NumberFormatException | ArithmeticException e){
            System.out.println("Multiple Exception.");
        } catch(Exception e){
            System.out.println("Last Exception.");
        } catch(Throwable e){
            System.out.println("General Exception.");
        }
    }

}
