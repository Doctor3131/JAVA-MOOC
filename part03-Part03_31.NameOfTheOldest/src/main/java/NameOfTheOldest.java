
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String name = "";
        while(true) {
            String data = scanner.nextLine();
            if (data.equals("")) {
                break;
            }

            String n = data.split(",")[0];
            int age = Integer.valueOf(data.split(",")[1]);
            if (oldest < age) {
                oldest = age;
                name = n;
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}
