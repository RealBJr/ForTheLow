
package forthelow;

public class SearchBar {
   public Inventory search(String search){
        Inventory result = new Inventory();
        
        for(int i = 0; i < search.length(); i++){//basic implementation where we only search for first keyword
            if(search.charAt(i) == 32){
                String keyword = search.substring(0, i);
                Inventory inventory = new Inventory();
                
                for(int j = 0; j < inventory.getInventory().size(); j++){
                    Set<Post> suitableCars =inventory.getInventory().keySet();
                    ArrayList<Post> suitableListCars = (ArrayList<Post>) suitableCars;
                    
                        for (int k = 0; k < suitableCars.size(); k++) {
                            if (suitableListCars.get(k).getKeywords().contains(keyword)) {
                                result.getInventory().put(suitableListCars.get(k),suitableListCars.get(k).getSetOfNbrs());
                            }
                           
                        }
                }
            }
        }
        return result;
    }
    
}
