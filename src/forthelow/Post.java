
package forthelow;

public class Post extends Cars{
 private Cars carToSell;
 
 private int inventoryPosition;

    public int getInventoryPosition() {
        return inventoryPosition;
    }

    public void setInventoryPosition(int inventoryPosition) {
        this.inventoryPosition = inventoryPosition;
    }
    
    
    private String author;

   public Posts( double price, String brand, String model, String addressOfDealer,String phoneNumber ,String color, int mileage) {
        super(price, brand, model, addressOfDealer,phoneNumber ,color, mileage);
        this.carToSell = carToSell;
        this.author = author;
   
    }
    
   
    public void buy(){
    }
    public void bookAnAppointment(){
    }
    
}
