
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int data1 = Integer.valueOf(scan.nextLine());

        String result = "";
        if (data1 > 100) {
            result = "incredible!";
        } else if (90 <= data1) {
            result = "5";
        } else if (80 <= data1) {
            result = "4";
        } else if (70 <= data1) {
            result = "3";
        } else if (60 <= data1) {
            result = "2";
        } else if (50 <= data1) {
            result = "1";
        } else if (0 <= data1) {
            result = "failed";
        } else {
            result = "impossible!";
        }

        System.out.println("Grade: " + result);
    }
}
