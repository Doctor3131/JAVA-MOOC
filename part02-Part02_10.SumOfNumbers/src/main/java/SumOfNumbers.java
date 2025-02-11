
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int basis = 0;

        while (true) {
            System.out.println("Give a number:");
            int data = Integer.valueOf(scanner.nextLine());

            if (data == 0) {
                break;
            }
            
            basis += data;
        }
        System.out.println("Sum of the numbers: " + basis);
    }
}
