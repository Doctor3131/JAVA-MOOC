
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            System.out.println("Give a number:");
            int data = Integer.valueOf(scanner.nextLine());

            if (data == 0) {
                break;
            }
            
            sum += data;
            count += 1;

        }
        System.out.println("Average of the numbers: " + 1.0*sum / count);
    }
}
