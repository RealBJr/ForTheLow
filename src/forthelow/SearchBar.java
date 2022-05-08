package forthelow;

import java.util.List;
import java.util.stream.Collectors;

public class SearchBar {

    public  Inventory search(String search, Comparator com){
        Inventory result = new Inventory(com);
        
       // LinkedHashSet<Posts> lhm = new LinkedHashSet<>();
        
        
         for (int i = 0; i < search.length(); i++) {//basic implementation where we only search for first keyword
             
             if (search.charAt(i) == ' ') {
                String keyword = search.substring(0, i);
                Inventory inventory = new Inventory();

                List<Posts> collected = inventory.getInventory().keySet()
                        .stream()
                        .filter(n -> n.getKeywords().contains(keyword))
                        .collect(Collectors.toList());

                
                for (int j = 0; j < collected.size(); j++) {
                    result.getInventory().put(collected.get(j), collected.get(j).getSetOfNbrs());
                }
//                    for(int j = 0; j < inventory.getInventory().size(); j++){
//                    Collection<Posts> suitableCars = inventory.getInventory().keySet();
//                    Iterator<Posts> isuitableCars = suitableCars.iterator();
//                    
//                    while(isuitableCars.hasNext()){
//                        Posts n = isuitableCars.next();
//                        if (n.getKeywords().contains(keyword)) {
//                            
//                            result.getInventory().clear();
//                            result.getInventory().put(n, n.getSetOfNbrs());
//                        }
//                    }
//                }
            } else {

                String keyword = search;
                Inventory inventory = new Inventory();

                List<Posts> collected = inventory.getInventory().keySet()
                        .stream()
                        .filter(n -> n.getKeywords().contains(keyword))
                        .collect(Collectors.toList());

               
                for (int j = 0; j < collected.size(); j++) {
                    result.getInventory().put(collected.get(j), collected.get(j).getSetOfNbrs());
                }
                
            }
            search = search.substring(i+1);
        }
       if (result.getInventory().isEmpty()){
            String keyword = search.strip().stripTrailing().toLowerCase();
            Inventory inventory = new Inventory();

                List<Posts> collected = inventory.getInventory().keySet()
                        .stream()
                        .filter(n -> n.getKeywords().contains(keyword))
                        .collect(Collectors.toList());
                
                for (int j = 0; j < collected.size(); j++) {
                    result.getInventory().put(collected.get(j), collected.get(j).getSetOfNbrs());
                }
        }
        return result ;
    }
    
   
     public static void main(String[] args) {
        SearchBar s = new SearchBar();
        s.search("white", new Comparators1()).display();
        
    }

}


