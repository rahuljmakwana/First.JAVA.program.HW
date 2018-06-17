import java.util.Scanner;

public class Positive_Negative_Zero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter number :");

        int n = scanner.nextInt();

        if (n>0) {

            System.out.println("Number is Positive");

        }else if (n<0){

            System.out.println("Number is Negative");

        }else

            System.out.println("number is zero");
    }
}
