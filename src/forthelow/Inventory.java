
package forthelow;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
      
       Posts finalPost = null;
    
    Scanner sc = new Scanner(System.in);
    private TreeMap<Posts, String> inventory;

      public String sellMyVehicule(){
        
       
        
         String tempansw = "";
        System.out.println("What is the price of the car?");
        double answer1 = sc.nextDouble();
        
        if (answer1 < 25000 ) {
            
             tempansw = "1";
        }
        
        if (answer1 >= 25000 || answer1 <= 50000) {
            
            tempansw = "2";
        }
        
        
        
        
        
        System.out.println("What is the brand of the car");
        String answer2 = sc.nextLine();
        
        System.out.println("What is the model of the car?");
       String answer3 = sc.nextLine();
       
        System.out.println("What is the mileage of the car?");
        int answer4 = sc.nextInt();
        
        System.out.println("What is your adress");
        String answer5 = sc.nextLine();
        
        System.out.println("What is your phone number");
        
        inventory.put(finalPost, answer5);  // ask Junior if he wants to make a seperate Inventory for new Vehicules 
        
        
        return null;
    }
    
    
   
    
    
    public void display() {

        Set set = inventory.keySet();
        int position = 0;
        Iterator i = set.iterator();

        while (i.hasNext()) {
            Posts psts =  (Posts)i.next();

            psts.setInventoryPosition(position++);

            System.out.print(   "inventory position" + ":" + psts.getInventoryPosition() + "," + psts  );

            
        }
        
        
        
        
        
        

    }
    
    public Posts displayInventoryPositionDecision(){   // gets the Car that the person chose depending on the inventory position
            Posts psts = null;
           
        
            System.out.println(" \n Choose the vehicule u want to take a look  depending on the inventory position: " );
            int answer = sc.nextInt();
            
            
           Set set = inventory.keySet();
        int position = 0;
        Iterator i = set.iterator();

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
        
       
        
                
                
                
            
        
        
        
            
            
            
            
            return finalPost;
            
            
        }
    
    public  void Decision() throws IOException{
       
        CustomerServiceAgent csa = new CustomerServiceAgent();
          csa.getName();
       Posts tempPost = finalPost;
        double downPaymentAmount = (0.10 * tempPost.getPrice());
       
       
        System.out.println(" \n Do you want to buy the vehicule or lease it?,\n press 1 to Reserve if you are ready to buy, and proceed with the downpayment \n press 2 to lease \n press 3 to book appointment with dealer ");
        
        int answer = sc.nextInt();
        
        if (answer == 1) {
            
           
           
           
           
            System.out.println("The total for the down payment will be : " + downPaymentAmount);
           
            System.out.println("Enter your  9 digit card number ");
            String answer1  = sc.nextLine();
            
            System.out.println("Enter the  Exp date ");
             String answer2  = sc.nextLine();
           
              System.out.println("Enter CVV");
             String answer3  = sc.nextLine();
           
           
            System.out.println("Your " + tempPost.getBrand() + "," + tempPost.getModel() + " has been reserved at " +  tempPost.getAddressOfDealer() );
            
            inventory.remove(tempPost);
            
            // add file ouput as the bill
            
            BufferedWriter br = new BufferedWriter(new FileWriter("/Users/keethen/Documents/BillPurchase.txt"));
            
            br.write("Thank you " +csa.getClientsLastName() + csa.getClientsLastName() + "for shopping with ForTheLow " + " \n here is your bill " + "You payed " + downPaymentAmount);
            br.close();
            
            
            
            
        }
        
        if (answer== 2) {
            
            
            
            System.out.println("For how long do you want to lease it");
            
            
            int answer2 = sc.nextInt();
            
            
            System.out.println("Your details have been sent to the dealership at" + tempPost.getAddressOfDealer());
            
            
            System.out.println("Your copy of the appointment has been sent to you!");
            
            BufferedWriter br = new BufferedWriter(new FileWriter("/Users/keethen/Documents/LeasePurchase.txt"));
            
            br.write("Thank you " +csa.getClientsLastName() + csa.getClientsLastName() + "for dealing with ForTheLow " + " The dealership at " + tempPost.getAddressOfDealer() + "will get back to you");
            br.close();
            
            
            
            
            
            
            
        }
        
        if(answer == 3){
            
            System.out.println("Here is the adress of the dealership : " + tempPost.getAddressOfDealer() + " \n Here is the phone number : " + tempPost.getPhoneNumber());
            
        }
        
        
        
        
        
        
        
        
        
    }
    
    
    
    

    public Inventory sort() {

        return null;
    }

    public TreeMap<Posts, String> getInventory() {
        return inventory;
    }

    public <l> void setInventory(Comparator<? super l> comparator) {
        this.inventory = new TreeMap<Posts, String>((Comparator<? super Posts>) comparator);

    }

    public Inventory() {

        this.inventory = new TreeMap<>();
        inventory.put(new Posts(55000.0, "BMW", "Series 4 2017", "2000 Transcanadienne Su Dorval QC H9P 2N4 ","(514) 683-2000","red", 52000), "2,2,3");
        inventory.put(new Posts(25000.0, "Toyota", "Sienna 2021", "3333 Chem. de la Côte-de-Liesse, Saint-Laurent, QC H4N 3C2 ", " (514) 748-7777" ,"blue", 15000), "1,1,2");
        inventory.put(new Posts(10000.0, "Honda", "Civic 2010 ", "12435 Blvd. Laurentien, Montreal, Quebec H4K 2J2","(514) 337-2330" , "white", 101000), "1,5,4");
        inventory.put(new Posts(51000.0, "Ford", "F-150 2019 ", "7100 Rue Saint-Jacques, Montreal, QC H4B 1V2", ": (514) 487-7777" ,"white", 100451), "3,3,4");
        inventory.put(new Posts(390000, "RollsRoyce", "Wraith 2017", "8525 Decarie Blvd, Montreal, Quebec H4P 2J2","(514) 738-3030" , "black", 4096), "5,4,2");
        inventory.put(new Posts(55000, "Mitsubishi", "Outlander 2022", "2465 Bd du Curé-Labelle, Laval, QC H7T 1R3", "+1 833-960-1658", "brown", 35000), "3,6,2");
        inventory.put(new Posts(13590, "Kia", "Forte Ex 2014", "2250 Bd Crémazie O, Montréal, QC H2P 1C6","(514) 695-7777" , "brown", 101834 ), "1,5,4");
        inventory.put(new Posts(59654, "Acura", "Rdx 2021", "4040 Rue Jean-Talon O, Montréal, QC H4P 1V5", "(514) 340-1344" , "black", 11650 ), "3,6,2");
         inventory.put(new Posts(169800, "Audi", "RS 7 2021", "5805 Trans Canada Route, Saint-Laurent, Quebec H4T 1A1", " (514) 364-7777", "Grey", 10 ), "5,2,1");


        
    }
    
    public Inventory(Comparator com){
        
         this.inventory = new TreeMap<>(com);
    }

              
}

