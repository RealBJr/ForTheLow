package forthelow;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SearchBar {

    public Inventory search(String search, Comparator com) {
        Inventory result = new Inventory(com);

        for (int i = 0; i < search.length(); i++) {

            if (search.charAt(i) == ' ') {
                String keyword = search.substring(0, i);
                Inventory inventory = new Inventory();

                List<Posts> collected = inventory.getInventory().keySet()
                        .stream()
                        .filter(n -> n.getKeywords().contains(keyword))
                        .collect(Collectors.toList());

                for (int j = 0; j < collected.size(); j++) {
                    result.getInventoryCopy().put(collected.get(j), collected.get(j).getSetOfNbrs());
                }
                search = search.substring(i + 1);
                i = -1;

            } else if (i == search.length() - 1) {

                String keyword = search;
                Inventory inventory = new Inventory();

                List<Posts> collected = inventory.getInventory().keySet()
                        .stream()
                        .filter(n -> n.getKeywords().contains(keyword))
                        .collect(Collectors.toList());

                for (int j = 0; j < collected.size(); j++) {
                    result.getInventoryCopy().put(collected.get(j), collected.get(j).getSetOfNbrs());
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Inventory i = new Inventory();
        i.display();
        i.posted(new Posts(76888.00, "Maserati", "Levante Q4S 2018",
                "  8525 Decarie Blvd, Mount Royal, Quebec H4P 2J2", "(514) 738-3030", "red", 1500), "442");
        
        
               
        System.out.println("");
        
        i.display();
        
        System.out.println("");
        
        SearchBar s = new SearchBar();
        s.search("red", new Comparators1()).display();
    }

}
