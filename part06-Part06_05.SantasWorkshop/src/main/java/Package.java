import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> data;

    public Package() {
        this.data = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        this.data.add(gift);
    }

    public int totalWeight() {
        int basis = 0;
        for (Gift item : data) {
            basis += item.getWeight();
        }
        return basis;
    }
}
