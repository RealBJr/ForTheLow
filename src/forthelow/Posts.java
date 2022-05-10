package forthelow;

public class Posts extends Cars implements Comparable<Posts> {

    private Cars carToSell;

    private int inventoryPosition;
    private int position = 0;
    String type = "Posts";

    public String getType() {
        return type;
    }

    public int getInventoryPosition() {
        return inventoryPosition;
    }

    public void setInventoryPosition(int inventoryPosition) {
        this.inventoryPosition = inventoryPosition;
    }

    private String author;

    public Posts(double price, String brand, String model, String addressOfDealer, String phoneNumber, String color, int mileage) {
        super(price, brand, model, addressOfDealer, phoneNumber, color, mileage);
        this.carToSell = carToSell;
        this.author = author;

    }

    public void buy() {
    }

    public void bookAnAppointment() {
    }

    @Override
    public int compareTo(Posts o) {

        int value = this.getBrand().compareTo(o.getBrand());

        return value;

    }

}
