import java.util.Scanner;

public class Symbol {

        public static void main(String[] args) {


            int num1, num2;
            String op;
            Scanner scanner = new Scanner(System.in);

            System.out.println("enter first number:");
            num1 = scanner.nextInt();

            System.out.println("enter second number:");
            num2 = scanner.nextInt();

            System.out.println("Enter operator either + or * or /:");
            op = scanner.next();

            switch(op)
            {
                case "+":
                    System.out.println("addition is :"+num1+num2);
                    break;

                case "*":
                    System.out.println("multiplication is :"+num1*num2);
                    break;

                case "/":
                    System.out.println("division is :"+num1/num2);
                    break;

                default:

                    // If the operator is other than +, * or /, error message is shown
                    System.out.println("Error! operator is not correct");
                    break;
            }
        }
    }


