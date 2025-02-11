
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int data1 = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int data2 = Integer.valueOf(scan.nextLine());

        if (data1 == data2) {
            System.out.println("The number are equal!");
        } else if (data1 > data2) {
            System.out.println("Greater number is: " + data1);
        } else {
            System.out.println("Greater number is: " + data2);
        }

    }
}
