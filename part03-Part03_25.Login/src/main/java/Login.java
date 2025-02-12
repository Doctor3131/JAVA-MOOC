
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String name = scanner.nextLine();
        System.out.print("Enter password: ");
        String passwd = scanner.nextLine();

        boolean result = false;
        if (name.equals("alex")) {
            if (passwd.equals("sunshine")) {
                result = true;
            }
        }
        if (name.equals("emma")) {
            if (passwd.equals("haskell")) {
                result = true;
            }
        }
        if (result) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
