
package forthelow;

public class SearchBar {
   public Inventory search(String search){
        Inventory result = new Inventory();
        
        for(int i = 0; i < search.length(); i++){//basic implementation where we only search for first keyword
            if(search.charAt(i) == 32){
                String keyword = search.substring(0, i);
                Inventory inventory = new Inventory();
                
                for(int j = 0; j < inventory.getInventory().size(); j++){
                    Collection<Post> suitableCars = inventory.getInventory().keySet();
                    Iterator<Post> isuitableCars = suitableCars.iterator();
                    
                    while(isuitableCars.hasNext()){
                        if (isuitableCars.next().getKeywords().contains(keyword)) {
                            result.getInventory().put(isuitableCars.next(), isuitableCars.next().getSetOfNbrs());
                        }
                    }
                }
            }
        }
        return result;
    }
    
}
