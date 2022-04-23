
package forthelow;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
 private HashMap <Post, String> inventory = new HashMap<>();

    public HashMap<Post, String> getInventory() {
        return inventory;
    }

    public void setInventory(HashMap<Post, String> inventory) {
        this.inventory = inventory;
    }
    
 
   public Inventory(){
            
            
            inventory.put( new Post(55000.0, "BMW" , "Series 4 2017", "2000 Transcanadienne Su Dorval QC H9P 2N4 ",  " red" , " 52000 km"  ) , "2,2,3");
        inventory.put( new Post(25000.0, "Toyota" , "Sienna 2021", "3333 Chem. de la Côte-de-Liesse, Saint-Laurent, QC H4N 3C2 ",  " blue" , " 15 000  km" ) , "1,1,2");
        inventory.put( new Post(10000.0, "Honda" , "Civic 2010 ", "12435 Blvd. Laurentien, Montreal, Quebec H4K 2J2",  " white" , " 101 000 km" ) , "1,5,4");
        inventory.put( new Post(51000.0, "Ford" , "F-150 2019 ", "12435 Blvd. Laurentien, Montreal, Quebec H4K 2J2",  " white" , " 100 451 km" ) , "3,3,4");
        
            
        }
        

 
    void display() {
for ( Map.Entry x: inventory.entrySet()) {
            
            System.out.println( x.getKey());
            
        }
        
    }
    
    public Inventory sort(){
     return null;
    }
        
}
