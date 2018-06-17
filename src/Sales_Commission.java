import java.util.Scanner;

public class Sales_Commission {


    public static void main(String[] args) {


        double CommissionRate;
        double TotalSales, Commission;

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter id");
        int id = scanner.nextInt();

        System.out.println("enter name:");
        String name = scanner.next();

        System.out.println("Please enter total sales ");
        TotalSales=scanner.nextDouble();

        if (TotalSales>=50000)

            CommissionRate=0.35;

        else if (TotalSales>=3000){

            CommissionRate=20.0;

        }else if (TotalSales>=20000){

            CommissionRate = 10.0;

        } else if ( TotalSales>=1000)

            CommissionRate=0.05;

        else if (TotalSales<1000 )

            CommissionRate=0.02;
        else
            CommissionRate= 0.00;

        Commission = CommissionRate * TotalSales;
        System.out.println("The Commision is: "+ Commission);
    }



















}
