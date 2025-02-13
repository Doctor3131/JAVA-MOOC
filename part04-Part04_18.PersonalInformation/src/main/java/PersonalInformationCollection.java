
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("First name: ");
            String first = scanner.nextLine();
            System.out.print("Last name: ");
            String second = scanner.nextLine();
            System.out.print("Identification number: ");
            String id = scanner.nextLine();
            
            if (first.equals("")) {
                break;
            }

            PersonalInformation person = new PersonalInformation(first, second, id);
            infoCollection.add(person);
        }
        System.out.println("");
        for(PersonalInformation data : infoCollection) {
            System.out.println(data.getFirstName() + " " + data.getLastName());
        }
    }
}
