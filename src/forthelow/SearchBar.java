
package forthelow;

public class SearchBar {
    public Inventory Search(String search){
        for(int i = 0; i < search.length; i++){
            if(search.charAt(i) == 32){
                String keyword = search.substring(0, i);
            }
        }
    }
    
}
