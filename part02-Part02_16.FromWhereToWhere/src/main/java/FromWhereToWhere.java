
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to? ");
        int data1 = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        int data2 = Integer.valueOf(scanner.nextLine());

        for (int i = data2; i <= data1; i++) {
            System.out.println(i);
        }

    }
}
