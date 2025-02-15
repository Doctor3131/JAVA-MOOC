import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        persons.add(person);
    }

    public boolean isEmpty() {
        if (persons.size() == 0) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        if (persons.size() == 0) {
            return null;
        }
        Person shortest = persons.get(0);
        for (int i = 1; i < persons.size(); i++) {
            if (shortest.getHeight() > persons.get(i).getHeight()) {
                shortest = persons.get(i);
            }
        }
        return shortest;
    }

    public Person take() {
        if (persons.size() == 0) {
            return null;
        }
        Person shortest = this.shortest();
        this.persons.remove(shortest);
        return shortest;
    }
}
