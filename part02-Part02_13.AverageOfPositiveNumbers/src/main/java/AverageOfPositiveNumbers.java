
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positive = 0;
        int count = 0;

        while (true) {
            int data = Integer.valueOf(scanner.nextLine());

            if (data == 0) {
                break;
            }

            if (data > 0) {
                positive += data;
                count += 1;
            }

        }

        if (positive != 0) {
            System.out.println(1.0 * positive / count);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
