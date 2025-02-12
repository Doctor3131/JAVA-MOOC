
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String word = scanner.nextLine();
            if (word.equals("")) {
                break;
            }
            String[] array = word.split(" ");
            for (String a : array) {
                if (a.contains("av")) {
                    System.out.println(a);
                }
            }
        }

    }
}
