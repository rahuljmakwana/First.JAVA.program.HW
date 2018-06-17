import java.util.Scanner;

public class City_Name {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any alphabet from a to f : ");

        String cityname;
        cityname = scanner.next();


        if (cityname.equalsIgnoreCase("a"))

        {
            System.out.println("ahmadabad");
        } else if ( cityname.equalsIgnoreCase("b"))

            System.out.println("Baroda");

        else if (cityname.equalsIgnoreCase("c"))

            System.out.println("Chandigadh");

        else if (cityname.equalsIgnoreCase("d"))

            System.out.println("Dahod");

        else if (cityname.equalsIgnoreCase("e"))

            System.out.println("elephant and castle");

        else if (cityname.equalsIgnoreCase("f"))

            System.out.println("Faridabad");

        else

            System.out.println("invalid");
    }

}
