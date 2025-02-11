
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year:");
        int data1 = Integer.valueOf(scan.nextLine());
        if (data1 % 4 == 0 && data1 % 100 != 0) {
            System.out.println("The year is a leap year.");
        } else if (data1 % 100 == 0 && data1 % 400 == 0) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }

    }
}
