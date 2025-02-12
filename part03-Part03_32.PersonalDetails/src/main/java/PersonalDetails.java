
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String name = "";
        int basis = 0;
        while(true) {
            String data = scanner.nextLine();
            if (data.equals("")) {
                break;
            }

            String n = data.split(",")[0];
            int age = Integer.valueOf(data.split(",")[1]);
            oldest += age;
            basis += 1;
            
            if (n.length() > name.length()) {
                name = n;
            }
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + 1.0*oldest/basis);
    }
}
