
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        while(true) {
            String data = scanner.nextLine();
            if (data.equals("")) {
                break;
            }

            int age = Integer.valueOf(data.split(",")[1]);
            if (oldest < age) {
                oldest = age;

            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
