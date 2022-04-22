
package forthelow;

public class Inventory {
 private HashMap <Post, String> inventory = new HashMap<>();

    public HashMap<Post, String> getInventory() {
        return inventory;
    }

    public void setInventory(HashMap<Post, String> inventory) {
        this.inventory = inventory;
    }
    
 
   public Inventory(){
            
            
            inventory.put( new Posts(55000.0, "BMW" , "Series 4 2017", "2000 Transcanadienne Su Dorval QC H9P 2N4 ",  " red" , " 52000 km"  ) , "2,2,3");
        inventory.put( new Posts(25000.0, "Toyota" , "Sienna 2021", "3333 Chem. de la Côte-de-Liesse, Saint-Laurent, QC H4N 3C2 ",  " blue" , " 15 000  km" ) , "1,1,2");
        inventory.put( new Posts(10000.0, "Honda" , "Civic 2010 ", "12435 Blvd. Laurentien, Montreal, Quebec H4K 2J2",  " white" , " 101 000 km" ) , "1,5,4");
        inventory.put( new Posts(51000.0, "Ford" , "F-150 2019 ", "12435 Blvd. Laurentien, Montreal, Quebec H4K 2J2",  " white" , " 100 451 km" ) , "3,3,4");
        
            
        }
        

 
    void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Inventory sort(){
    }
        
}
