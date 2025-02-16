
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int container1 = 0;
        int container2 = 0; 

        while (true) {
            System.out.println("First: " + container1 + "/100");
            System.out.println("Second: " + container2 + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int value = Integer.valueOf(parts[1]);

            if (value < 0) {
                continue;
                
            } else if (command.equals("add")) {
                container1 += value;

            } else if (command.equals("move")) {
                if (container1 < value) {
                    value = container1;
                }
                container1 -= value;
                container2 += value;

            } else if (command.equals("remove")) {
                if (container2 < value) {
                    value = container2;
                }
                container2 -= value;
            }

            if (container1 > 100) {
                container1 = 100;
            }
            
            if (container2 > 100) {
                container2 = 100;
            }
            

            System.out.println("");
        }
    }

}
