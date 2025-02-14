
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment compared) {
        int data1 = this.squares * this.pricePerSquare;
        int data2 = compared.squares * compared.pricePerSquare;

        return Math.abs(data1 - data2);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int data1 = this.squares * this.pricePerSquare;
        int data2 = compared.squares * compared.pricePerSquare;

        return data1 > data2;
    }
}
