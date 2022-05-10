package forthelow;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

public class ForTheLow {

   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author 2177095
 */
public class ForTheLow {

    public static void main(String[] args) throws IOException {
        UserManagement userM = new UserManagement();

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in); // we created a second scanner because the first one would statr to bug
         Inventory inv = new Inventory();
        int optionEntered = 0;
        while (optionEntered != 5) {
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

                          
                                   Inventory newInv    = search.search(ans1, new Comparators1());
                            if (newInv.getInventory().isEmpty()) {

                                System.out.println("That car doesnt exist");

                                break;
                            }

                            newInv.display();
                            Posts chosenPost = newInv.displayInventoryPositionDecision();

                            newInv.Decision();
                       //     inv.getInventory().remove(chosenPost);
                         //   inv.getInventoryCopy().remove(chosenPost);

                        } else if (ans2 == 2) {

                          Inventory   newInv2 = search.search(ans1, new Comparators2());
                            if (newInv2.getInventory().isEmpty()) {

                                System.out.println("That car doesnt exist");

                                break;
                            }

                            newInv2.display();
                            Posts chosenPost = newInv2.displayInventoryPositionDecision();
                             newInv2.Decision();
                        //    inv.getInventory().remove(chosenPost);
                          //   inv.getInventoryCopy().remove(chosenPost);
                        }
                        //TODO implement comparator

                    } else if (optionEntered == 2) {

                        CustomerServiceAgent csa = new CustomerServiceAgent();

                        //   csa.getName();
                        String decisionChoice = csa.questions();
                        inv = csa.displayCarPreferences(decisionChoice);

                        inv.display();
                        Posts chosenPost = inv.displayInventoryPositionDecision();
                        inv.Decision();
                        //inv.getInventory().remove(chosenPost);
                      //   inv.getInventoryCopy().remove(chosenPost);

                    } else if (optionEntered == 3) {
                      //  Inventory inv3 = new Inventory();

                        inv.sellMyVehicule();

                    } else if (optionEntered == 4) {

                      //  Inventory inv44 = new Inventory();
                        inv.display();
                        Posts chosen = inv.displayInventoryPositionDecision();
                        inv.Decision();
                     //   inv.getInventory().remove(chosen);
                       //  inv.getInventoryCopy().remove(chosen);

                    } else if (optionEntered == 5) {

                        System.out.println("See you next time :) ");

                    }

                } while (optionEntered != 5);

            } catch (Exception e) {

                System.out.println("Please try again");

            }

        }

    }

}

}
