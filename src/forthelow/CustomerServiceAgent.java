
package forthelow;

public class CustomerServiceAgent {
    public String getName(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("what is your full name");
        return sc.nextLine();
    }
    
    public String questions(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is your income? \n Press 1: 25K - 50K annually \n Press 2: 50K -75K annually \n Press 3: 75K - 100K annually \n Press 1: 100K and above");
        String answer1 = sc.nextLine();
        
        System.out.println("Do you have a preferred car model? \n Press 1: minivan \n Press 2: sportscar \n Press 3: pick-up truck \n Press 4: luxury car \n Press 5: sedan");
        String answer2 = sc.nextLine();
        
        return "" + answer1 + amswer2;
    }
    
    public Inventory displayCarPreferences(String answerList){
    }
    
}
