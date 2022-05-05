package forthelow;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

public class ForTheLow {

    public static void main(String[] args) {
        UserManagement userM = new UserManagement();
        Scanner sc = new Scanner(System.in);

        int optionEntered = 0;
        while (optionEntered != 5) {
            try {

                // int optionEntered;
                do {

                    optionEntered = userM.menuTab();

                    if (optionEntered == 1) {

                        SearchBar search = new SearchBar();
                        System.out.println("What car u want?");
                        String ans1 = sc.nextLine();
                        System.out.println("How do you want to sort: 1 = Price wise, 2 = Mileage wise");
                        int ans2 = sc.nextInt();
                        if (ans2 == 1) {

                            //  TreeMap<Posts,String> trMap = new TreeMap<>(new Comparators1());
                            Inventory inv = search.search(ans1, new Comparators1());

                            inv.display();
                            inv.displayInventoryPositionDecision();
                            inv.Decision();

                        } else if (ans2 == 2) {

                            Inventory inv2 = search.search(ans1, new Comparators1());
                            inv2.display();
                            inv2.displayInventoryPositionDecision();
                            inv2.Decision();

                        }
                        //TODO implement comparator

                    } else if (optionEntered == 2) {

                        CustomerServiceAgent csa = new CustomerServiceAgent();

                        csa.getName();
                        csa.questions();

                    } else if (optionEntered == 3) {

                    } else if (optionEntered == 4) {

                        Inventory inv = new Inventory();
                        inv.display();
                        inv.displayInventoryPositionDecision();
                        inv.Decision();

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
