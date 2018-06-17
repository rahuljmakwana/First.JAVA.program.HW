import java.util.Scanner;

public class Gross_Salary {

    public static void main(String[] args){

        float basicsalary,da,hra,da1,hra1,GrossPayment;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Basic Salary Of Employee: ");

        basicsalary=scanner.nextFloat();

        System.out.println("Enter Basic DA Of Employee: ");
        da1=scanner.nextFloat();

        System.out.println("Enter Basic HRA Of Employee: ");
        hra1=scanner.nextFloat();

        da = (da1 * basicsalary) / 100;
        hra = (hra1 * basicsalary) / 100;

        GrossPayment = basicsalary + da + hra;

        System.out.println("Gross Salary Of Employee: "+GrossPayment);
    }
}


