import java.util.Scanner;

public class Multiplication_Table {

    public static void main(String[] args)

    {
        int a,b;

        System.out.print("Input the number(Table to be calculated): ");
        {
            System.out.print("Input number of terms : ");

            Scanner scanner = new Scanner(System.in);

            b = scanner.nextInt();

            System.out.println ("\n");

            for(a=0;a<=b;a++){

                System.out.println(b+" X "+a+" = " +b*a);

            }
        }
    }

}
