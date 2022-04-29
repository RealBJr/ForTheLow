
package forthelow;

public class Post extends Cars{
 private Cars carToSell;
 private int position;
    
    private String author;

    public Post( double price, String brand, String model, String addressOfDealer, String color, String mileage) {
        super(price, brand, model, addressOfDealer, color, mileage);
        this.carToSell = carToSell;
        this.author = author;
    }
    
   
    public void buy(){
    }
    public void bookAnAppointment(){
    }
    
}
