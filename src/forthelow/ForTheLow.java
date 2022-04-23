
package forthelow;

import java.util.Scanner;


public class ForTheLow {
//main class 
    public static void main(String[] args) {

        UserManagement userM = new UserManagement();
        Scanner sc = new Scanner(System.in);
        
         int optionEntered;
        do {
            
             optionEntered = userM.menuTab();
            
            
            if (optionEntered == 1) { 
            
            SearchBar search = new SearchBar();
                System.out.println("What car u want?");
                search.search(sc.nextLine()).display();
                
            
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
    

