
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int data = Integer.valueOf(scan.nextLine());
        if (data >= 1000000) {
            double gifTax = (142100 + (data - 1000000) * 0.17);
            System.out.println("Tax: " + gifTax);
        } else if (data >= 200000) {
            double gifTax = (22100 + (data - 200000) * 0.15);
            System.out.println("Tax: " + gifTax);
        } else if (data >= 55000) {
            double gifTax = (4700 + (data - 55000) * 0.12);
            System.out.println("Tax: " + gifTax);
        } else if (data >= 25000) {
            double gifTax = (1700 + (data - 25000) * 0.10);
            System.out.println("Tax: " + gifTax);
        } else if (data >= 5000) {
            double gifTax = (100 + (data - 5000) * 0.08);
            System.out.println("Tax: " + gifTax);
        } else {
            System.out.println("No tax!");
        }
    }
}
