package forthelow;

import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

public class ForTheLow {

    public static void main(String[] args) throws IOException {
        UserManagement userM = new UserManagement();

//        Scanner sc = new Scanner(System.in);
//        Scanner sc2 = new Scanner(System.in); // we created a second scanner because the first one would statr to bug
        Inventory inv = new Inventory();
        int optionEntered = 0;
        while (optionEntered != 5) {
            try {

                OUTER:
                do {
                    optionEntered = userM.menuTab();
                    switch (optionEntered) {
                        case 1:
                            Scanner sc = new Scanner(System.in);
                            Scanner sc2 = new Scanner(System.in);
                            SearchBar search = new SearchBar();
                            System.out.println("What car u want?");
                            String ans1 = sc2.nextLine();
                            System.out.println("How do you want to sort: 1 = Price wise, 2 = Mileage wise");

        int ans2 = sc.nextInt();
                            if (ans2 == 1) {
                                
                                Inventory newInv = search.search( ans1, new Comparators1());
                                if (newInv.getInventoryCopy().isEmpty()) {
                                    System.out.println("That car doesnt exist");
                                    break OUTER;
                                }
                                newInv.displayCopy();
                                Posts chosenPost = newInv.displayInventoryPositionDecision();
                                newInv.Decision();
                                //     inv.getInventory().remove(chosenPost);
                                //   inv.getInventoryCopy().remove(chosenPost);
                            } else if (ans2 == 2) {
                                Inventory newInv2 = search.search( ans1, new Comparators2());
                                if (newInv2.getInventory().isEmpty()) {
                                    System.out.println("That car doesnt exist");
                                    break OUTER;
                                }
                                newInv2.displayCopy();
                                Posts chosenPost = newInv2.displayInventoryPositionDecision();
                                newInv2.Decision();
                                //    inv.getInventory().remove(chosenPost);
                                //   inv.getInventoryCopy().remove(chosenPost);
                            }
                            //TODO implement comparator
                            break;
                        case 2:
                            CustomerServiceAgent csa = new CustomerServiceAgent();
                            //   csa.getName();
                            String decisionChoice = csa.questions();
                            inv = csa.displayCarPreferences(decisionChoice);
                            inv.displayFullInv();
                            Posts chosenPost = inv.displayInventoryPositionDecision();
                            inv.Decision();
                            //inv.getInventory().remove(chosenPost);
                            //   inv.getInventoryCopy().remove(chosenPost);
                            break;
                        case 3:
                            //  Inventory inv3 = new Inventory();
                            
                            inv.sellMyVehicule();
                            break;
                        case 4:
                            //  Inventory inv44 = new Inventory();
                            inv.displayFullInv();
                            Posts chosen = inv.displayInventoryPositionDecision();
                            inv.Decision();
                            //   inv.getInventory().remove(chosen);
                            //  inv.getInventoryCopy().remove(chosen);
                            break;
                        case 5:
                            System.out.println("See you next time :) ");
                            break;
                        default:
                            break;
                    }
                } while (optionEntered != 5);

            } catch (Exception e) {

                System.out.println("Please try again");

            }

        }

    }

}
