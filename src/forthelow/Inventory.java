
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
            
            
           inventory.put( new Posts(55000.0, "BMW" , "Series 4 2017", "2000 Transcanadienne Su Dorval QC H9P 2N4 ",  "red" , "52000 km"  ) , "2,2,3");
        inventory.put( new Posts(25000.0, "Toyota" , "Sienna 2021", "3333 Chem. de la Côte-de-Liesse, Saint-Laurent, QC H4N 3C2 ",  "blue" , " 15 000  km" ) , "1,1,2");
        inventory.put( new Posts(10000.0, "Honda" , "Civic 2010 ", "12435 Blvd. Laurentien, Montreal, Quebec H4K 2J2",  "white" , "101 000 km" ) , "1,5,4");
        inventory.put( new Posts(51000.0, "Ford" , "F-150 2019 ", "7100 Rue Saint-Jacques, Montreal, QC H4B 1V2",  "white" , "100 451 km" ) , "3,3,4");
        inventory.put(new Posts(390000, "RollsRoyce" , " Wraith 2017" , "8525 Decarie Blvd, Montreal, Quebec H4P 2J2" , "black" , "4096 km"), "5,4,2");
        inventory.put(new Posts(55000, "Mitsubishi" , " Outlander 2022" , " 2465 Bd du Curé-Labelle, Laval, QC H7T 1R3" , "brown" , "35000 km"), "3,6,2");
        
        
        
            
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
