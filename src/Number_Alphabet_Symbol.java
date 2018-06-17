import java.util.Scanner;

public class Number_Alphabet_Symbol {
    public static void main(String args[])

    {

        char input;

        int temp;

        Scanner s=new Scanner(System.in);

        System.out.println("Enter The Input Character");

        input=s.next().charAt(0);

        temp=(int) input;



        if(temp>=65 && temp<=90)

        {

            System.out.println(input+" is a Upper Case Alphabet");

        }

        else if(temp>=97 && temp<=122)

        {

            System.out.println(input+" is a Small Case Alphabet");

        }

        else if(temp>=48 && temp<=57)

        {

            System.out.println(input+" is a Digit");

        }

        else if((temp>=32 && temp<=47) || (temp>=58 && temp<=64) || (temp>=91 && temp<=96) || (temp>=123 && temp<=126))

        {

            System.out.println(input+ " Is A Special Symbol");

        }

    }
    }
