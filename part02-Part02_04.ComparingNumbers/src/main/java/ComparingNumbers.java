
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int data1 = Integer.valueOf(scanner.nextLine());
        int data2 = Integer.valueOf(scanner.nextLine());
        if (data1 > data2) {
            System.out.println(data1 + " is greater than " + data2);
        } else if (data2 > data1) {
            System.out.println(data1 + " is smaller than " + data2);
        } else {
            System.out.println(data2 + " is equal to " + data1);
        }
    }
}
