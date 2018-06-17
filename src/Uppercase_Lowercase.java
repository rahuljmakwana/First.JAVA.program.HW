import java.util.Scanner;

public class Uppercase_Lowercase {

    public static void main(String[] args) {
        String Upper , Lower;

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter any one alphabet in Upper care : ");

        Upper = scanner.nextLine();

        Lower = Upper.toLowerCase();

        System.out.println(" Entered alphabet in Uppercare is in lowercase: " + Lower);
    }


    }


