import java.util.Scanner;

public class Leap_Year {

    public static void main(String[] args)

    {

        int year;

        System.out.println("Enter any year: ");

        Scanner scanner = new Scanner(System.in);  // object of scanner class

        year = scanner.nextInt();

        boolean isLeap = false;

        // If year has 366 days than it is a leap year.

        if (year % 4 == 0) {

            if (year % 100 == 0) {
                if (year % 400 == 0)

                    isLeap = true;

                else
                    isLeap = false;

            } else
                isLeap = true;
        }

                if (isLeap == true )

                    System.out.println(year + " is a Leap Year");

                else
                    System.out.println(year + "is not a Leap Year");
        }

    }





