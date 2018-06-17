import java.util.Scanner;

public class Day_name_of_week {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of day in week  : ");

        int DayoftheWeek;

        DayoftheWeek = scanner.nextInt();

        if (DayoftheWeek == 1)

            System.out.println("Sunday");

        else if (DayoftheWeek == 2)

            System.out.println("Monday");

        else if (DayoftheWeek == 3)

            System.out.println("Tuesday");

        else if (DayoftheWeek == 4)

            System.out.println("Wednesday");

        else if (DayoftheWeek == 5)

            System.out.println("Thursday");

        else if (DayoftheWeek == 6)

            System.out.println("Friday");

        else if (DayoftheWeek == 7)

            System.out.println("Saturday");
    }





}
