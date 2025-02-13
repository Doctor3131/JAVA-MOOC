
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int basis = 0;
        while(true) {
            int data = Integer.valueOf(.nextLine());
            if (data.equals("end")){
                System.out.println(basis);
                break;
            }
            basis += Integer.valueOf(data);
        }
        System.out.println("end");        
    }
}
