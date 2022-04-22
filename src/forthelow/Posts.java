
package forthelow;

public class Post extends Cars{
    
    Private Cars carToSell;
    
    private String author;
    
    public Post(double price, String brand, String model, Dealership dealer, String color, String author, String buyOrLease) {
        super(price, brand, model, dealer, color, buyOrLease);
        this.author = author;
    }
    public void buy(){
    }
    public void bookAnAppointment(){
    }
    
    
}
