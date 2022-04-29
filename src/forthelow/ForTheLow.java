
package forthelow;

import java.util.Scanner;


package forthelow;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

public class ForTheLow {

    public static void main(String[] args) {
        UserManagement userM = new UserManagement();
        Scanner sc = new Scanner(System.in);
        
         int optionEntered;
        do {
            
             optionEntered = userM.menuTab();
            
            
            if (optionEntered == 1) { 
            
            SearchBar search = new SearchBar();
                System.out.println("What car u want?");
                String ans1 = sc.nextLine();
                System.out.println("How do you want to sort: 1 = Price wise, 2 = Mileage wise");
                int ans2 = sc.nextInt();
                    if (ans2 == 1) {
                    
                    }
                    else if (ans2 == 2) {
                    
                    }
                search.search(ans1).setInventory(new TreeMap(Comparator)).display();//TODO implement comparator
                
                
            
            }
            
            
             else if (optionEntered == 2) { 
            
            CustomerServiceAgent csa = new CustomerServiceAgent();
            csa.questions();
            
            
            }
            
            else  if (optionEntered == 3) { 
            
            
            
            
            }
            
            
             else  if (optionEntered == 4) { 
            
            
                 System.out.println("See you next time :) " );
            
            
            }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        } while( optionEntered != 4);
        
        
        
        
        
        
        
        
    }
    
}
    



