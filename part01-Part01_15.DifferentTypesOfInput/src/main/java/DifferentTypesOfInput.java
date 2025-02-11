
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String data1 = scan.nextLine();
        System.out.println("Give an integer:");
        int data2 = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double data3 = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean data4 = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + data1);
        System.out.println("You gave the integer " + data2);
        System.out.println("You gave the double " + data3);
        System.out.println("You gave the boolean " + data4);

        

    }
}
