
package forthelow;

public class Post extends Cars{
    
    Private Cars carToSell;
    
    private String author;
    
    public Post(double price, String brand, String model, Dealership dealer, String color, String author) {
        super(price, brand, model, dealer, color);
        this.author = author;
    }
    public void buy(){
    }
    public void bookAnAppointment(){
    }
    
    
}
