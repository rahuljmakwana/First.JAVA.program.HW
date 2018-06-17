import java.util.Scanner;

public class Average_Of_Five_Number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter first number");
        int num1 = scanner.nextInt();


        System.out.println("Enter second number");
        int num2 = scanner.nextInt();


        System.out.println("Enter third number");
        int num3 = scanner.nextInt();


        System.out.println("Enter forth number");
        int num4 = scanner.nextInt();


        System.out.println("Enter fifth number");
        int num5 = scanner.nextInt();

        System.out.println("Average of five number is :" +(num1+num2+num3+num4+num5)/5);
    }


}
