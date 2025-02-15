import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (item.getWeight() <= this.maxWeight) {
            this.items.add(item);
            this.maxWeight -= item.getWeight();
        }
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getWeight();
        }
        return sum;
    }

    public Item heaviestItem() {
        if (items.size() == 0) {
            return null;
        }

        Item basis = items.get(0);
        for (int i = 1; i < items.size(); i++) {
            if (items.get(i).getWeight() > basis.getWeight()) {
                basis = items.get(i);
            }
        }
        return basis;
    }

    

    public String toString() {
        int basis = 0;
        for (Item item : this.items) {
            basis += item.getWeight();
        }

        String name = "";
        if (items.size() == 1) {
            name = items.size() + " item ";
        } else if (items.size() == 0) {
            name = "no items ";
        } else {
            name = items.size() + " items ";
        }

        return name + "(" + basis + "kg)";
    }

}
