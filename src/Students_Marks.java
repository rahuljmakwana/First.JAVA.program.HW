import java.util.Scanner;

public class Students_Marks {


    public static void main(String[] args) {

        String sub1,sub2,sub3,total;


        // write your code here
        int marks;

        System.out.println(" Enter any Integer Number: ");

        // scanner class allows the user to enter number
        Scanner scanner = new Scanner (System.in); //object of scanner class

        marks = scanner.nextInt();

        if(marks<50){
            System.out.println("fail");
        }
        else if(marks>=50 && marks<60){
            System.out.println("D grade");
        }
        else if(marks>=60 && marks<70){
            System.out.println("C grade");
        }
        else if(marks>=70 && marks<80){
            System.out.println("B grade");
        }
        else if(marks>=80 && marks<90){
            System.out.println("A grade");
        }else if(marks>=90 && marks<100){
            System.out.println("A+ grade");
        }else{
            System.out.println("Invalid!");
        }
}


}


