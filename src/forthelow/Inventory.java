
package forthelow;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
      
       private TreeMap<Posts, String> inventory = new TreeMap<>();
       
    public void display(){
        Set set = inventory.entrySet();
        int position = 0;
        Iterator i = set.iterator();

         while(i.hasNext()) {
             Posts psts = (Posts)i.next();
             Map.Entry me = (Map.Entry)psts;
             psts.setInventoryPosition(position++);
             System.out.print(me.getKey() + ": (click " + psts.getInventoryPosition() + ")");
             
         }
      
      
        
    }

    public Inventory sort() {
        return null;
    }
        
     public TreeMap<Posts, String> getInventory() {
        return inventory;
    }

    public void setInventory(TreeMap<Posts, String> inventory) {
        this.inventory = inventory;
    }
 
   public Inventory(){
            
            
           inventory.put( new Posts(55000.0, "BMW" , "Series 4 2017", "2000 Transcanadienne Su Dorval QC H9P 2N4 ",  "red" , "52000 km"  ) , "2,2,3");
        inventory.put( new Posts(25000.0, "Toyota" , "Sienna 2021", "3333 Chem. de la Côte-de-Liesse, Saint-Laurent, QC H4N 3C2 ",  "blue" , " 15 000  km" ) , "1,1,2");
        inventory.put( new Posts(10000.0, "Honda" , "Civic 2010 ", "12435 Blvd. Laurentien, Montreal, Quebec H4K 2J2",  "white" , "101 000 km" ) , "1,5,4");
        inventory.put( new Posts(51000.0, "Ford" , "F-150 2019 ", "7100 Rue Saint-Jacques, Montreal, QC H4B 1V2",  "white" , "100 451 km" ) , "3,3,4");
        inventory.put(new Posts(390000, "RollsRoyce" , " Wraith 2017" , "8525 Decarie Blvd, Montreal, Quebec H4P 2J2" , "black" , "4096 km"), "5,4,2");
        inventory.put(new Posts(55000, "Mitsubishi" , " Outlander 2022" , " 2465 Bd du Curé-Labelle, Laval, QC H7T 1R3" , "brown" , "35000 km"), "3,6,2");
          inventory.put(new Posts(13590, "Kia", "Forte Ex 2014", "2250 Bd Crémazie O, Montréal, QC H2P 1C6", "brown", 101834 ), "1,5,4");
        inventory.put(new Posts(59654, "Acura", "Rdx 2021", "4040 Rue Jean-Talon O, Montréal, QC H4P 1V5", "black", 11650 ), "3,6,2");
         inventory.put(new Posts(169800, "Audi", "RS 7 2021", "5805 Trans Canada Route, Saint-Laurent, Quebec H4T 1A1", "Grey", 10 ), "5,2,1");

            
        }
              
}

