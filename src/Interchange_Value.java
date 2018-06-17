import java.util.Scanner;

public class Interchange_Value {

    public static void main(String[] args) {
        String a,b
                ;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first value : ");
        a = scanner.next();

        System.out.println("Enter second value : " +
                "");
        b = scanner.next();

        StringBuffer sf = new StringBuffer(a);
        System.out.println("Interchange value is  : "+sf.reverse());

        StringBuffer s = new StringBuffer(b);
        System.out.println("Interchange value is  : "+s.reverse());
    }


}
