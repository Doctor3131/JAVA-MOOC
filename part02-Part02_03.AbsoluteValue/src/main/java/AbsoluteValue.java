
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int data = Integer.valueOf(scanner.nextLine());
        if (data < 0) {
            System.out.println(data * -1);
        } else {
            System.out.println(data);
        }
    }
}
