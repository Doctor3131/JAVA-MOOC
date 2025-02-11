
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number? ");
        int data1 = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number? ");
        int data2 = Integer.valueOf(scanner.nextLine());

        int basis = 0;

        for (int i = data1; i <= data2; i++) {
            basis += i;
        }

        System.out.println("The sum is " + basis);
    }
}
