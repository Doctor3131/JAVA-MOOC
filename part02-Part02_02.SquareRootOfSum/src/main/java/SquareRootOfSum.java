
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int data1 = Integer.valueOf(scanner.nextLine());
        int data2 = Integer.valueOf(scanner.nextLine());
        System.out.println(Math.sqrt(data1+data2));

    }
}
