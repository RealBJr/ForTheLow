
package forthelow;

public class Inventory {
 private HashMap <Post, String> inventory = new HashMap<>();

    public HashMap<Post, String> getInventory() {
        return inventory;
    }

    public void setInventory(HashMap<Post, String> inventory) {
        this.inventory = inventory;
    }
    public static void main(String[] args) {
        //Collections<Cars> cars = Inventory.getInventory().values();
    }

    void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Inventory sort(){
    }
        
}
