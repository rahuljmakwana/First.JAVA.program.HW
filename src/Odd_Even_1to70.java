public class Odd_Even_1to70 {


    public static void main(String[] args) {
        int num = 70;
        System.out.println("Enter an Integer number:");
        for (int i = 0; i < num; i++) {
            if (i % 2 == 0)
                System.out.println("even number:" + i);
            else
                System.out.println("odd number:" + i);
        }
    }
}