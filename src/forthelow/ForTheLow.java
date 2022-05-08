package forthelow;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

public class ForTheLow {

     UserManagement userM = new UserManagement();
    
        Scanner sc = new Scanner(System.in);
             Scanner sc2 = new Scanner(System.in); // we created a second scanner because the first one would statr to bug
        Inventory inv = new Inventory();
        int optionEntered = 0;
        while(optionEntered != 5) {
        try {
        
        // int optionEntered;
        do {
            
             optionEntered = userM.menuTab();
            
            
            if (optionEntered == 1) { 
            
            SearchBar search = new SearchBar();
                System.out.println("What car u want?");
                String ans1 = sc2.nextLine();
                System.out.println("How do you want to sort: 1 = Price wise, 2 = Mileage wise");
                int ans2 = sc.nextInt();
                    if (ans2 == 1) {
                    
                        Inventory newInv = search.search(ans1, new Comparators1());
                                if (newInv.getInventory().isEmpty()) {
                            
                                    System.out.println("That car doesnt exist");     
                                    
                                  break;  
                        }
                              
                                newInv.display();
                                Posts chosenPost = newInv.displayInventoryPositionDecision(); 
                                newInv.Decision();
                                inv.getInventory().remove(chosenPost);
                                 
                                 
                    }
                    else if (ans2 == 2) {
                    
                        
                        
                      Inventory newInv2    =  search.search(ans1, new Comparators2());
                      if (newInv2.getInventory().isEmpty()) {
                            
                                    System.out.println("That car doesnt exist");     
                                    
                                  break;  
                        }
                      
                      
                         newInv2.display();
                          Posts chosenPost = newInv2.displayInventoryPositionDecision();
                         inv.getInventory().remove(chosenPost);
                          
                         
                            
                    }
                //TODO implement comparator
                
                
            
            }
            
            
             else if (optionEntered == 2) { 
            
            CustomerServiceAgent csa = new CustomerServiceAgent();
           
         //   csa.getName();
           String decisionChoice = csa.questions();
        Inventory inv3 =    csa.displayCarPreferences(decisionChoice);
        
        inv3.display();
         Posts chosenPost = inv3.displayInventoryPositionDecision();
         inv3.Decision();
         inv.getInventory().remove(chosenPost);
            
            
            
            }
            
            else  if (optionEntered == 3) { 
            
            inv.sellMyVehicule();
            
            
            }
            
            
             else  if (optionEntered == 4) { 
            
                //Inventory inv2 = new Inventory();  
                 
                 inv.display();
              Posts chosen =   inv.displayInventoryPositionDecision(); 
                 inv.Decision();
                 inv.getInventory().remove(chosen);
                
            
            
            }
            
             else if (optionEntered == 5) {
                
                  System.out.println("See you next time :) " );
                  

            }
                     
            
        } while( optionEntered != 5);
        
        
        
        
        } catch(Exception e){
            
            System.out.println("Please try again");
            
            
        }
        
        
        }
        
    }
}
