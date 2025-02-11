
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int data = Integer.valueOf(scanner.nextLine());

        int basis = 1;

        for (int i = 2; i <= data; i++) {
            basis *= i;
        }

        System.out.println("Factorial: " + basis);
    }
}
