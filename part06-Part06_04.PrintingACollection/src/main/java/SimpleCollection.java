
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        if (elements.size() == 0) {
            return "The collection " + name + " is empty.";
        } else {
            String listData = "";
            for (String data : elements) {
                listData += "\n" + data;
            }
            return "The collection " + name + " has " + elements.size() + " element:" + listData;
        }
    }
    
}
