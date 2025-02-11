
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Last number? ");
        int data = Integer.valueOf(scanner.nextLine());

        int basis = 0;

        for (int i = 1; i <= data; i++) {
            basis += i;
        }

        System.out.println("The sum is " + basis);
    }
}
