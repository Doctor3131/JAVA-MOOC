
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here. 
        System.out.println("Enter the first string:");
        String data1 = scan.nextLine();
        System.out.println("Enter the second string:");
        String data2 = scan.nextLine();

        if (data1.equals(data2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

    }
}
