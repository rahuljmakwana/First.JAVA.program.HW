import java.util.Scanner;

public class Divicible_3_5 {

    public static void main(String[] args)
    {int i;

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter any Number: ");

         i = scanner.nextInt();


         if( i % 3 == 0) {
             System.out.println(i+" is Divisible by 3");

         }else {
             System.out.println(i + " is not divisible by 3 ");
         }

        if( i % 5 == 0) {
            System.out.println(i+" is Divisible by 5");

        }else {
            System.out.println(i + " is not divisible by 5 ");
        }
    }
}
