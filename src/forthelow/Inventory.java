package forthelow;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Inventory {

    private String authorFirstName = "";
    private String authorLastName = "";
    private String OwnersPhoneNumbers = "";
    private String OwnersAdress = "";
    private Posts finalPost = null;

    private static TreeMap<Posts, String> inventory = new TreeMap<>() {
        {
            put(new Posts(55000.0, "BMW", "Series 4 2017", "2000 Transcanadienne Su Dorval QC H9P 2N4 ", "(514) 683-2000", "red", 52000), "323");
            put(new Posts(25000.0, "Toyota", "Sienna 2021", "3333 Chem. de la Côte-de-Liesse, Saint-Laurent, QC H4N 3C2 ", " (514) 748-7777", "blue", 15000), "112");
            put(new Posts(10000.0, "Honda", "Civic 2010 ", "12435 Blvd. Laurentien, Montreal, Quebec H4K 2J2", "(514) 337-2330", "white", 101000), "154");
            put(new Posts(51000.0, "Ford", "F-150 2019 ", "7100 Rue Saint-Jacques, Montreal, QC H4B 1V2", ": (514) 487-7777", "white", 100451), "334");
            put(new Posts(390000.0, "RollsRoyce", "Wraith 2017", "8525 Decarie Blvd, Montreal, Quebec H4P 2J2", "(514) 738-3030", "black", 4096), "542");
            put(new Posts(55000.0, "Mitsubishi", "Outlander 2022", "2465 Bd du Curé-Labelle, Laval, QC H7T 1R3", "+1 833-960-1658", "brown", 35000), "362");
            put(new Posts(13590.0, "Kia", "Forte Ex 2014", "2250 Bd Crémazie O, Montréal, QC H2P 1C6", "(514) 695-7777", "brown", 101834), "154");
            put(new Posts(59654.0, "Acura", "Rdx 2021", "4040 Rue Jean-Talon O, Montréal, QC H4P 1V5", "(514) 340-1344", "black", 11650), "362");
            put(new Posts(169800.0, "Audi", "RS 7 2021", "5805 Trans Canada Route, Saint-Laurent, Quebec H4T 1A1", " (514) 364-7777", "Grey", 10), "521");
            put(new Posts(138910.0, "Nissan", "GTR premium 2018", "3500 Rue Jean-Talon O, Montréal, QC H3R 2E8", " (514) 509-7777", "yellow", 52371), "523");
            put(new Posts(24888.0, "Subaru", "Forester Touring 2017", " 4900 Pare St, Montreal, Quebec H4P 1P3", " (514) 737-1880", "orange", 49324), "162");
            put(new Posts(45800.0, "Mercedes-Benz", " S-Class S550 2015", "7800 Decarie Blvd, Montreal, Quebec H4P 2H4", "(514) 359-7171", "black", 149179), "244");
            put(new Posts(76888.00, "Maserati", "Levante Q4S 2018", "  8525 Decarie Blvd, Mount Royal, Quebec H4P 2J2", "(514) 738-3030", "white", 1500), "462");

        }
    };

    public Inventory() {
        Inventory.inventory.putAll(posteds);
        this.inventoryCopy = inventory;

    }
    public Inventory(Comparator com) {

        this.inventoryCopy = new TreeMap<>(com);
        
    }

    private TreeMap<Posts, String> inventoryCopy;

    public static TreeMap<Posts, String> posteds = new TreeMap<Posts, String>();

    public TreeMap<Posts, String> getInventory() {
        return Inventory.inventory;
    }

    public void setInventory(TreeMap<Posts, String> inventory) {
        Inventory.inventory = inventory;
    }

    public TreeMap<Posts, String> getInventoryCopy() {
        return this.inventoryCopy;
    }

    public void setInventoryCopy(TreeMap<Posts, String> inventoryCopy) {
        this.inventoryCopy = inventoryCopy;
    }

    public void sellMyVehicule() {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("What is your first name");
        authorFirstName = sc1.nextLine();

        System.out.println("What is your last name?");
        authorLastName = sc1.nextLine();

        int answerMileage = 0;

        String tempansw = "";
        String tempAns2 = "";
        String tempAns3 = "";

        double answer1_0 = PriceOfCar();
        tempansw = priceCarIf(answer1_0);

        System.out.println("What is the brand  of the car");
        String answer2 = sc1.nextLine();

        System.out.println("What is the model  and the year of the car ");
        String answer3 = sc1.nextLine();

        // System.out.println("to what category does it belong? \n Press 1: minivan \n Press 2: sportscar \n Press 3: pick-up truck \n Press 4: luxury car \n Press 5: compact cars \n Press 6 : SUV");
        // String answer33 = sc1.nextLine();
        String answer33 = String.valueOf(CatgueoryAnswer());

        System.out.println("What is the color of the car");
        String answer4 = sc1.nextLine();

        answerMileage = MileageCar();
        tempAns2 = mileageCarIf(answerMileage);

        String final1 = tempansw + answer33 + tempAns2;

        System.out.println("What is your adress");
        OwnersAdress = sc1.nextLine();

        System.out.println("What is your phone number");
        OwnersPhoneNumbers = sc1.nextLine();

        inventory.put(new Posted(answer1_0, answer2, answer3, OwnersAdress, OwnersPhoneNumbers, answer4, answerMileage), final1);  // ask Junior if he wants to make a seperate Inventory for new Vehicules 

        System.out.println("Your post has been added to our application!");

    }

    public int CatgueoryAnswer() {
        Scanner sc1 = new Scanner(System.in);
        int answer33 = 0;
        try {
            System.out.println("to what category does it belong? \n Press 1: minivan \n Press 2: sportscar \n Press 3: pick-up truck \n Press 4: luxury car \n Press 5: compact cars \n Press 6 : SUV");

            answer33 = sc1.nextInt();

            if (answer33 <= 0 || answer33 > 6) {

                System.out.println("Enter an answer between 1 and 6 plz");

                return CatgueoryAnswer();
            }

        } catch (Exception e) {
            System.out.println("Enter the proper input");
            return CatgueoryAnswer();

        }

        return answer33;
    }

    public int MileageCar() {

        Scanner sc22 = new Scanner(System.in);

        int answerMileage = 0;
        try {

            System.out.println("What is the mileage of the car? ");
            answerMileage = sc22.nextInt();

        } catch (Exception e) {
            System.out.println("Please enter the mileage!");

            return MileageCar();

        }

        return answerMileage;

    }

    public String mileageCarIf(int answerMileage) {
        String tempAns2 = "";

        if (answerMileage < 100) {
            tempAns2 = "1";

        }

        if (answerMileage >= 100 && answerMileage <= 50000) {

            tempAns2 = "2";
        }

        if (answerMileage > 50000 && answerMileage <= 100000) {
            tempAns2 = "3";

        }

        if (answerMileage > 100000) {
            tempAns2 = "4";

        }

        return tempAns2;
    }

    public double PriceOfCar() {
        Scanner sc22 = new Scanner(System.in);

        double answer1 = 0;

        try {
            System.out.println("What is the price of the car?");
            answer1 = sc22.nextDouble();

        } catch (Exception e) {

            System.out.println("Please enter a price");

            return PriceOfCar();

        }

        return answer1;
    }

    public String priceCarIf(double answer1) {

        String tempansw = "";

        if (answer1 < 25000) {

            tempansw = "1";
        }

        if (answer1 >= 25000 && answer1 <= 50000) {

            tempansw = "2";
        }

        if (answer1 >= 50000 && answer1 <= 75000) {

            tempansw = "3";
        }

        if (answer1 >= 75000 && answer1 <= 100000) {

            tempansw = "4";

        }

        if (answer1 > 100000) {

            tempansw = "5";

        }

        return tempansw;

    }

    public void displayFullInv() {

        Set set = this.inventory.keySet();
        int position = 0;
        Iterator i = set.iterator();

        while (i.hasNext()) {
            Posts psts = (Posts) i.next();

            psts.setInventoryPosition(position++);

            System.out.println("inventory position" + ": " + psts.getInventoryPosition() + ", " + psts);

        }

    }

    public void displayCopy() {

        Set set = this.inventoryCopy.keySet();
        int position = 0;
        Iterator i = set.iterator();

        while (i.hasNext()) {
            Posts psts = (Posts) i.next();

            psts.setInventoryPosition(position++);

            System.out.println("inventory position" + ": " + psts.getInventoryPosition() + ", " + psts);

        }

    }

    public Posts displayInventoryPositionDecision() {   // gets the Car that the person chose depending on the inventory position
        Scanner sc1 = new Scanner(System.in);
        Posts psts = null;
        int answer = 0;
        try {
            System.out.println(" \n Choose the vehicule u want to take a look  depending on the inventory position ");
            answer = sc1.nextInt();

        } catch (Exception e) {

            return displayInventoryPositionDecision();

        }

        Set set = inventoryCopy.keySet();

        int position = 0;
        Iterator i = set.iterator();

        //  try {
        while (i.hasNext()) {

            psts = (Posts) i.next();

            if (answer == psts.getInventoryPosition()) {

                finalPost = psts;
                System.out.println(psts);

                break;
            } else if (!i.hasNext()) {
                System.out.println("That car doesnt exist, plz try again");
                finalPost = null;
                return displayInventoryPositionDecision();
            }

        }
        System.out.println(finalPost);
        return finalPost;
    }
    
    public void Decision() throws IOException {

//        Scanner sc1 = new Scanner(System.in);
//        Scanner sc2 = new Scanner(System.in);
        CustomerServiceAgent csa = new CustomerServiceAgent();
        // if (csa.getClientsFirstName() != null && csa.getClientsLastName() != null) {
        csa.getName();
        //}

        Posts tempPost = finalPost;

        double downPaymentAmount = (0.10 * tempPost.getPrice());

        if (tempPost.getType().equals("Posted")) {

            Scanner sc1 = new Scanner(System.in);

            System.out.println(" \n Do you want to buy the vehicule or book an appointment with owner,\n press 1 to Reserve if you are ready to buy, and proceed with the downpayment \n  press 2 to book appointment with owner \n press 3 to return to main menu ");

            int answer = sc1.nextInt();

            if (answer == 1) {
                Scanner sc2 = new Scanner(System.in);
                System.out.println("The total for the down payment will be : " + downPaymentAmount);

                System.out.println("Enter your  16 digit card number");
                String answer1 = sc2.nextLine();

                System.out.println("Enter the Exp date");
                String answer2 = sc2.nextLine();

                System.out.println("Enter CVV");
                String answer3 = sc2.nextLine();

                // add file ouput as the bill
                System.out.println("Your " + tempPost.getBrand() + "," + tempPost.getModel() + " has been reserved at " + OwnersAdress);
                System.out.println("The copy of your bill has been sent to your repository");
                BufferedWriter br = new BufferedWriter(new FileWriter("Bill"));

                br.write(" Thank you " + csa.getClientsFirstName() + csa.getClientsLastName() + " for using  ForTheLow " + "to buy your " + tempPost.getBrand() + tempPost.getModel() + " \n here is your bill " + "You payed " + authorFirstName + ", " + authorLastName + " a down payment of : " + downPaymentAmount + " on " + java.time.LocalDate.now() + " at " + java.time.LocalTime.now());

                br.close();

                Inventory.inventory.remove(tempPost);
                inventoryCopy.remove(tempPost);
            }

            if (answer == 2) {

                System.out.println("Here is the phone number of the Owner : " + OwnersPhoneNumbers + " you may call him to book an appointment");

                inventory.remove(tempPost);
                inventoryCopy.remove(tempPost);
            }

        } else if (tempPost.getType().equals("Posts")) {
            Scanner sc1 = new Scanner(System.in);

            int answer = 0;

            try {
                answer = questionPosts();

            } catch (Exception e) {
                answer = questionPosts();

            }

            if (answer == 1) {
                Scanner sc2 = new Scanner(System.in);

                System.out.println("The total for the down payment will be : " + downPaymentAmount);

                System.out.println("Enter your  9 digit card number");
                String answer1 = sc2.nextLine();

                System.out.println("Enter the Exp date");
                String answer2 = sc2.nextLine();

                System.out.println("Enter CVV");
                String answer3 = sc2.nextLine();

                System.out.println("Your " + tempPost.getBrand() + ", " + tempPost.getModel() + " has been reserved at " + tempPost.getAddressOfDealer());

                System.out.println("The bill has been sent to your repository");

                // add file ouput as the bill
                BufferedWriter br = new BufferedWriter(new FileWriter("Bill"));

                br.write(" Thank you " + csa.getClientsFirstName() + csa.getClientsLastName() + " for shopping with ForTheLow " + " \n here is your bill " + "You payed " + downPaymentAmount + " on " + java.time.LocalDate.now() + " at " + java.time.LocalTime.now());
                br.close();

                //    tempRemoves.put(tempPost, tempPost.getSetOfNbrs());
                Inventory.inventory.remove(tempPost);
                inventoryCopy.remove(tempPost);
            }

            if (answer == 2) {
                Scanner sc3 = new Scanner(System.in);
                System.out.println("For how many years do you want to lease it");

                int answer2 = sc3.nextInt();

                System.out.println("Your details have been sent to the dealership at" + tempPost.getAddressOfDealer());

                System.out.println("Your copy of the appointment has been sent to your repository!");

                BufferedWriter br = new BufferedWriter(new FileWriter("Appointment"));

                br.write("Thank you " + csa.getClientsFirstName() + ", " + csa.getClientsLastName() + " for dealing with ForTheLow " + " The dealership at " + tempPost.getAddressOfDealer() + " will get back to you soon");
                br.close();
                //   tempRemoves.put(tempPost, tempPost.getSetOfNbrs());

                inventory.remove(tempPost);
                inventoryCopy.remove(tempPost);
            }

            if (answer == 3) {

                System.out.println("Here is the adress of the dealership : " + tempPost.getAddressOfDealer() + " \n Here is the phone number : " + tempPost.getPhoneNumber());
                //    tempRemoves.put(tempPost, tempPost.getSetOfNbrs());

                inventory.remove(tempPost);
                inventoryCopy.remove(tempPost);
            }

        }

    }

    public int questionPosts() {
        Scanner sc1 = new Scanner(System.in);

        int answer = 0;

        try {

            System.out.println(" \n Do you want to buy the vehicule or lease it?,\n press 1 to Reserve if you are ready to buy, and proceed with the downpayment \n press 2 to lease \n press 3 to book appointment with dealer \n press 4 to return to main menu ");

            answer = sc1.nextInt();

            if (answer <= 0 || answer > 4) {

                System.out.println("Enter an answer between 1 and 4 plz");
                return questionPosts();
            }

        } catch (Exception e) {

            System.out.println("Enter the proper Input");
            return questionPosts();
        }

        return answer;
    }

    public int questionPosted() {

        Scanner sc1 = new Scanner(System.in);
        System.out.println(" \n Do you want to buy the vehicule or book an appointment with owner,\n press 1 to Reserve if you are ready to buy, and proceed with the downpayment \n  press 2 to book appointment with owner \n press 3 to return to main menu ");

        int answer = sc1.nextInt();

        return 0;
    }

    public static TreeMap<Posts, String> posted(Posts p, String value) {
        posteds = new TreeMap<Posts, String>();
        posteds.put(p, value);

        return posteds;
    }

}
