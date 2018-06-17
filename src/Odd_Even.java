import java.util.Scanner;

public class Odd_Even {


    public static void main(String[] args)
    {
        int num;

        System.out.println(" Enter any Integer Number: ");
        // scanner class allows the user to enter number

        Scanner scanner = new Scanner (System.in); //object of scanner class

        num = scanner.nextInt();

        // when number is divisible by 2 then its even number otherwise its Odd
        if(num % 2 == 0)

            System.out.println("Entered number is Even");
        else
            System.out.println("Enter number os Odd");

    }


}
