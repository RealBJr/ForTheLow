package forthelow;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Inventory {

 private String authorFirstName = "";
  private  String authorLastName = "";
  private String OwnersPhoneNumbers = "";
  private String OwnersAdress = "";
   private   Posts finalPost = null;
    Scanner sc1 = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
     Scanner sc2 = new Scanner(System.in);
    private TreeMap<Posts, String> inventory;
    

   
    public String sellMyVehicule(){
        System.out.println("What is your first name");
        authorFirstName = sc1.nextLine();
      
        sc1.nextLine();
        
        System.out.println("What is your last name?");
        authorLastName = sc.nextLine();
        
          sc.nextLine();
        
        int answerMileage = 0;
     double answer1 = 0;
         String tempansw = "";
         String tempAns2 = "";
         String tempAns3 = "";
         
       
         
         
         
              System.out.println("What is the price of the car?");
         answer1 = sc.nextDouble();
         
       
        
    //}
        if (answer1 < 25000 ) {
            
             tempansw = "1";
        }
        
        if (answer1 >= 25000 && answer1 <= 50000) {
            
            tempansw = "2";
        }
        
        if (answer1>= 50000 && answer1 <=75000) {
            
            tempansw = "3";
        }
        
        if (answer1 >= 75000 && answer1 <= 100000) {
            
             tempansw = "4";
            
        }
        
        if (answer1> 100000 ) {
            
            tempansw = "5";
            
        }
        
       
      
        
        
        System.out.println("What is the brand  of the car");
        String answer2 = sc1.nextLine();
        
        System.out.println("What is the model  and the year of the car " );
        String answer3 = sc1.nextLine();
        
        System.out.println("to what category does it belong? \n Press 1: minivan \n Press 2: sportscar \n Press 3: pick-up truck \n Press 4: luxury car \n Press 5: compact cars \n Press 6 : SUV");
        String answer33 = sc1.nextLine();
       
        
         
        
     
        
        System.out.println("What is the color of the car");
        String answer4 = sc1.nextLine();
       
       
        
            
              System.out.println("What is the mileage of the car? ");
        answerMileage = sc1.nextInt();
        
        
            
        
        
      
        
        
        if (answerMileage < 100) {
            tempAns2 = "1";
            
        }
        
        if (answerMileage >= 100 && answerMileage <= 50000) {
            
            tempAns2 = "2";
        }
        
        if (answerMileage > 50000 && answerMileage <= 100000 ) {
             tempAns2 = "3";
            
        }
        
        if (answerMileage > 100000) {
             tempAns2 = "4";
            
        }
        
        
           String final1 = tempansw + answer33 + tempAns2;
        
           
        System.out.println("What is your adress");
        OwnersAdress = sc1.nextLine();
        
        sc1.nextLine();
        
        System.out.println("What is your phone number");
       OwnersPhoneNumbers  = sc1.nextLine();
        
        
        inventory.put(new Posted(answer1,answer2,answer3,OwnersAdress,OwnersPhoneNumbers,answer4,answerMileage), final1);  // ask Junior if he wants to make a seperate Inventory for new Vehicules 
        
        System.out.println("Your post has been added to our application!");
        return "";
        
    }
    
    
    
    
    
    public void display() {

        
        
        Set set = inventory.keySet();
        int position = 0;
        Iterator i = set.iterator();
        
      
            
              while (i.hasNext()) {
            Posts psts =  (Posts)i.next();

            psts.setInventoryPosition(position++);

            System.out.println(   "inventory position" + ":" + psts.getInventoryPosition() + "," + psts  );

            
        }
            
        
        
    }
    
    public Posts displayInventoryPositionDecision(){   // gets the Car that the person chose depending on the inventory position
            Posts psts = null;
           
            System.out.println(" \n Choose the vehicule u want to take a look  depending on the inventory position: " );
            int answer = sc.nextInt();
            
            
           Set set = inventory.keySet();
        int position = 0;
        Iterator i = set.iterator();

      //  try {
        while (i.hasNext()) {
            
            psts = (Posts) i.next();
            
            if (answer == psts.getInventoryPosition()) {
                
                 finalPost = psts;
                System.out.println(psts);
                
                break;
            }
            
            else if(!i.hasNext()){
                System.out.println("That car doesnt exist, plz try again");
                finalPost = null;
                return displayInventoryPositionDecision();
                
            }
           
        }
    //    }
        //catch(Exception e) {
            
       //   return    displayInventoryPositionDecision();
        //}
        return finalPost;   
        }
    
    public  void Decision() throws IOException{
       
        LocalDate localdate2 = LocalDate.now(Clock.systemUTC());
            LocalDateTime now = LocalDateTime.now();  
     
        
        CustomerServiceAgent csa = new CustomerServiceAgent();
        csa.getName();
       Posts tempPost = finalPost;
     
        double downPaymentAmount = (0.10 * tempPost.getPrice());
       
        if (tempPost.getType().equals("Posted")) {
            
             System.out.println(" \n Do you want to buy the vehicule or book an appointment with owner,\n press 1 to Reserve if you are ready to buy, and proceed with the downpayment \n  press 2 to book appointment with owner ");
        
        int answer = sc.nextInt();
        
        if (answer == 1) {
          
            System.out.println("The total for the down payment will be : " + downPaymentAmount);
           
            System.out.println("Enter your  16 digit card number");
            String answer1  = sc1.nextLine();
            
            System.out.println("Enter the Exp date");
             String answer2  = sc1.nextLine();
           
              System.out.println("Enter CVV");
             String answer3  = sc1.nextLine();
           
           
            // add file ouput as the bill
             System.out.println("Your " + tempPost.getBrand() + "," + tempPost.getModel() + " has been reserved at " + OwnersAdress  );
            System.out.println("The copy of your bill has been sent to your email");
            BufferedWriter br = new BufferedWriter(new FileWriter("/Users/keethen/Documents/BillPurchase.txt"));
            
            br.write(" Thank you " +csa.getClientsFirstName() + csa.getClientsLastName() + " for using  ForTheLow " + "to buy your " + tempPost.getBrand() + tempPost.getModel() + " \n here is your bill " + "You payed " + authorFirstName + ", " + authorLastName + " a down payment of : " + downPaymentAmount + " on " +  java.time.LocalDate.now() + " at " + java.time.LocalTime.now());
            
            br.close();
            
        }
        
         if(answer == 2){
            
            
            System.out.println("Here is the phone number of the Owner : "  + OwnersPhoneNumbers + " you may call him to book an appointment"  );
            
        }
            
        }
        
       else if (tempPost.getType().equals("Posts")) {
            
             System.out.println(" \n Do you want to buy the vehicule or lease it?,\n press 1 to Reserve if you are ready to buy, and proceed with the downpayment \n press 2 to lease \n press 3 to book appointment with dealer ");
        
        int answer = sc.nextInt();
        
        if (answer == 1) {
          
            System.out.println("The total for the down payment will be : " + downPaymentAmount);
           
            System.out.println("Enter your  9 digit card number");
            String answer1  = sc1.nextLine();
            
            System.out.println("Enter the Exp date");
             String answer2  = sc1.nextLine();
           
              System.out.println("Enter CVV");
             String answer3  = sc1.nextLine();
           
           
            System.out.println("Your " + tempPost.getBrand() + "," + tempPost.getModel() + " has been reserved at " +  tempPost.getAddressOfDealer() );
            
            
            System.out.println("The bill has been sent to your email");
        
            
            // add file ouput as the bill
            
            BufferedWriter br = new BufferedWriter(new FileWriter("/Users/keethen/Documents/BillPurchase.txt"));
            
            br.write(" Thank you " +csa.getClientsFirstName() + csa.getClientsLastName() + " for shopping with ForTheLow " + " \n here is your bill " + "You payed " + downPaymentAmount + " on " + java.time.LocalDate.now() + " at " + java.time.LocalTime.now() );
            br.close();
            
            
        }
        
        if (answer== 2) {
            
            
            System.out.println("For how many years do you want to lease it");
            
            
            int answer2 = sc.nextInt();
            
            
            System.out.println("Your details have been sent to the dealership at" + tempPost.getAddressOfDealer());
            
            
            System.out.println("Your copy of the appointment has been sent to your email!");
            
            BufferedWriter br = new BufferedWriter(new FileWriter("/Users/keethen/Documents/LeasePurchase.txt"));
            
            br.write("Thank you " +csa.getClientsFirstName() + "," +csa.getClientsLastName() + " for dealing with ForTheLow " + " The dealership at " + tempPost.getAddressOfDealer() + " will get back to you soon");
            br.close();
            
            
            
            
        }
        
        if(answer == 3){
            
            
            System.out.println("Here is the adress of the dealership : " + tempPost.getAddressOfDealer() + " \n Here is the phone number : " + tempPost.getPhoneNumber());
            
         //    inventory.remove(tempPost);
            
             
             
          
        }
        
           
        }
       
      
        
        
        
    }
    
   

    public Inventory sort() {

        return null;
    }

    public TreeMap<Posts, String> getInventory() {
        return inventory;
    }

    public void setInventory(TreeMap<Posts, String> inventory) {
        this.inventory = inventory;
    }

    

    public Inventory() {

        
        this.inventory = new TreeMap<>();
        inventory.put(new Posts(55000.0, "BMW", "Series 4 2017", "2000 Transcanadienne Su Dorval QC H9P 2N4 ","(514) 683-2000","red", 52000), "323");
        inventory.put(new Posts(25000.0, "Toyota", "Sienna 2021", "3333 Chem. de la Côte-de-Liesse, Saint-Laurent, QC H4N 3C2 ", " (514) 748-7777" ,"blue", 15000), "112");
        inventory.put(new Posts(10000.0, "Honda", "Civic 2010 ", "12435 Blvd. Laurentien, Montreal, Quebec H4K 2J2","(514) 337-2330" , "white", 101000), "154");
        inventory.put(new Posts(51000.0, "Ford", "F-150 2019 ", "7100 Rue Saint-Jacques, Montreal, QC H4B 1V2", ": (514) 487-7777" ,"white", 100451), "334");
        inventory.put(new Posts(390000.0, "RollsRoyce", "Wraith 2017", "8525 Decarie Blvd, Montreal, Quebec H4P 2J2","(514) 738-3030" , "black", 4096), "542");
        inventory.put(new Posts(55000.0, "Mitsubishi", "Outlander 2022", "2465 Bd du Curé-Labelle, Laval, QC H7T 1R3", "+1 833-960-1658", "brown", 35000), "362");
        inventory.put(new Posts(13590.0, "Kia", "Forte Ex 2014", "2250 Bd Crémazie O, Montréal, QC H2P 1C6","(514) 695-7777" , "brown", 101834 ), "154");
        inventory.put(new Posts(59654.0, "Acura", "Rdx 2021", "4040 Rue Jean-Talon O, Montréal, QC H4P 1V5", "(514) 340-1344" , "black", 11650 ), "362");
        inventory.put(new Posts(169800.0, "Audi", "RS 7 2021", "5805 Trans Canada Route, Saint-Laurent, Quebec H4T 1A1", " (514) 364-7777", "Grey", 10 ), "521");
        inventory.put(new Posts(138910.0, "Nissan", "GTR premium 2018","3500 Rue Jean-Talon O, Montréal, QC H3R 2E8", " (514) 509-7777" ,"yellow" , 52371 ), "523");
        inventory.put(new Posts(24888.0, "Subaru", "Forester Touring 2017", " 4900 Pare St, Montreal, Quebec H4P 1P3", " (514) 737-1880" , "orange" ,49324 ), "162");
        inventory.put(new Posts(45800.0, "Mercedes-Benz"," S-Class S550 2015" , "7800 Decarie Blvd, Montreal, Quebec H4P 2H4" , "(514) 359-7171", "black", 149179), "244");
        inventory.put(new Posts(76888.00, "Maserati" , "Levante Q4S 2018", "  8525 Decarie Blvd, Mount Royal, Quebec H4P 2J2", "(514) 738-3030", "white", 1500), "462");
        
    }
    
    public Inventory(Comparator com){
        
         this.inventory = new TreeMap<>(com);
    }



    
}
