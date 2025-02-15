import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int totalWeight;
    private int maxWeight;

    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.totalWeight = 0;
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        int weight = suitcase.totalWeight(); 
        if (this.maxWeight - this.totalWeight >= weight) {
            this.suitcases.add(suitcase);
            totalWeight += weight;
        }
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }

    public String toString() {
        String a = "";
        if (this.suitcases.size() == 0) {
            a = "no suitcase ";
        } else if (this.suitcases.size() == 1) {
            a = this.suitcases.size() + " suitcase ";
        } else {
            a = this.suitcases.size() + " suitcases ";
        }

        return a + "(" + this.totalWeight + " kg)"; 
    }
}
