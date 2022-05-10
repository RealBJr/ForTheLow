/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forthelow;

import java.util.Scanner;

/**
 *
 * @author junio
 */
public class UserManagement {
    
     public int recursiveSort(){
        Scanner sc = new  Scanner(System.in);
        int ans2 = 0;
        
        try {
             System.out.println("How do you want to sort: 1 = Price wise, 2 = Mileage wise");

         ans2 = sc.nextInt();
         
            if (ans2<1 || ans2>2) {
                
                System.out.println("Please choose between 1 and 2");
                return recursiveSort();
                
            }
            
            
        } catch(Exception e ) {
            
            System.out.println("Please inter the proper integer");
            
            return recursiveSort();
        }
        
        
        return ans2;
        
    }
    
    
    int menuTab() {
       
        Scanner sc = new Scanner(System.in);
   
        
        
        
        
         System.out.println("""
                           ================================================
                            [1] Search Bar
                            [2] Customer Service Agent   
                            [3] Sell my vehicule
                            [4] Display Inventory
                            [5] Exit
                            
                           
                            ===================================================""");
         System.out.print("What option do you want : ");
        
         
         int optionEntered = sc.nextInt();
        
        return optionEntered;
        
    }

    
}
