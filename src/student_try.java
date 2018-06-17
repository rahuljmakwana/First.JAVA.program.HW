import java.sql.SQLOutput;
import java.util.Scanner;

public class student_try {


    public static void main(String[] args)
    {
       Scanner scanner =  new Scanner (System.in);

        System.out.println( "Enter marks for Maths ");
       int marks1  = scanner.nextInt();

        System.out.println(" Enter Marks for English");
       int marks2 = scanner.nextInt();

        System.out.println(" Enter marks for science");
        int marks3 = scanner.nextInt();

        //System.out.println("Percentage of student " + (marks1+marks2+marks3)/300*100);

        System.out.println("total marks of student :" +(marks1+marks2+marks3));

    }



}
