package forthelow;

import java.util.Comparator;
import java.util.List;
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
                    result.getInventory().put(collected.get(j), collected.get(j).getSetOfNbrs());
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
                    result.getInventory().put(collected.get(j), collected.get(j).getSetOfNbrs());
                }
            }
        }

        return result;
    }

}
