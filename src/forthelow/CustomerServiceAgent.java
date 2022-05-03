
package forthelow;

import java.util.Scanner;

public class CustomerServiceAgent {
   
     private  String clientsFirstName;
  private  String clientsLastName;

    public String getClientsFirstName() {
        return clientsFirstName;
    }

    public void setClientsFirstName(String clientsFirstName) {
        this.clientsFirstName = clientsFirstName;
    }

    public String getClientsLastName() {
        return clientsLastName;
    }

    public void setClientsLastName(String clientsLastName) {
        this.clientsLastName = clientsLastName;
    }

   
   
     public  String getName(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("what is your first name");
        clientsFirstName = sc.nextLine();
        
         System.out.println("What is your last name");
        clientsLastName = sc.nextLine();
        
        
        return clientsFirstName + clientsLastName;
    }
     
    
    
    public String questions(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is your income? \n Press 1: <25K \n Press 2: 25K - 50K annually \n Press 3: 50K -75K annually \n Press 4: 75K - 100K annually \n Press 5: 100K and above");
        String answer1 = sc.nextLine();
        
        System.out.println("Do you have a preferred car model? \n Press 1: minivan \n Press 2: sportscar \n Press 3: pick-up truck \n Press 4: luxury car \n Press 5: compact cars \n Press 6 : SUV");
        String answer2 = sc.nextLine();
        
        System.out.println("What mileage? \n Press 1: brand new (no mileage) \n Press 2: 100km - 50k km \n Press 3: 50k-100k km \n Press 4: 100k+ km");
        String answer3 = sc.nextLine();
        
        
        return "" + answer1 + answer2 + answer3;
    }
    
    public Inventory displayCarPreferences(String answerList){
        return null;
    }
    
}
