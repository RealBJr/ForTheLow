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
    Scanner sc = new Scanner(System.in);
    public int menuTab(){
        
        
        
        
         System.out.println("""
                           ================================================
                            [1] Search Bar
                            [2] Customer Service Agent   
                            [3] Sell my vehicule
                            [4] Exit
                            
                           
                            ===================================================""");
         System.out.print("What option do you want : ");
        
         
         int optionEntered = sc.nextInt();
        
        return optionEntered;
        
    }
    
    
}