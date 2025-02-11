
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int basis = 0;

        while (true) {
            System.out.println("Give a number:");
            int data = Integer.valueOf(scanner.nextLine());

            if (data == 0) {
                break;
            }
            
            if (data < 0) {
                basis += 1;
            }
        }
        System.out.println("Number of negative numbers: " + basis);
    }
}
