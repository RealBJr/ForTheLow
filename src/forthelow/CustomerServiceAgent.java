package forthelow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;

public class CustomerServiceAgent {
    
    private String clientsFirstName;
    private String clientsLastName;
    
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
    
    public String getName() {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("what is your first name");
        clientsFirstName = sc.nextLine();
        
        System.out.println("What is your last name");
        clientsLastName = sc.nextLine();
        
        return clientsFirstName + clientsLastName;
    }
    
    public String questions() {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is your income? \n Press 1: <25K \n Press 2: 25K - 50K annually \n Press 3: 50K -75K annually \n Press 4: 75K - 100K annually \n Press 5: 100K and above");
        String answer1 = sc.nextLine();
        
        System.out.println("Do you have a preferred car model? \n Press 1: minivan \n Press 2: sportscar \n Press 3: pick-up truck \n Press 4: luxury car \n Press 5: compact cars \n Press 6 : SUV");
        String answer2 = sc.nextLine();
        
        System.out.println("What mileage? \n Press 1: brand new (no mileage) \n Press 2: 100km - 50k km \n Press 3: 50k-100k km \n Press 4: 100k+ km");
        String answer3 = sc.nextLine();
        
        return "" + answer1 + answer2 + answer3;
    }
    
    public Inventory displayCarPreferences(String answerList) {
        Inventory cars = new Inventory();
        final ArrayList<Character> charsAnswerList = new ArrayList<>();

        //pushing each chars in the arrayList of charsAnswerList
        for (int i = 0; i < charsAnswerList.size(); i++) {
            charsAnswerList.add(answerList.charAt(i));
        }

        //compare 1st chars in values of post with arrayList objects()
        Collection<String> values = cars.getInventory().values();

        //creating a List of values that i would easily manipulate
        List<String> valuesAsList = new ArrayList();
        valuesAsList.addAll(values);
        
        int maxRepeated = 0;
        TreeMap<Posts, String> recommendation = new TreeMap<>();
        
            for (int i = 1; i < valuesAsList.size(); i++) {
                if (charsAnswerList.get(0).equals(valuesAsList.get(i).charAt(0))) {
                String singleValue = valuesAsList.get(i);
                int repeated = 0; // nbr of times there are common nbrs
                for (int j = 1; j < singleValue.length(); j++) {
                    if (singleValue.charAt(j) == charsAnswerList.get(j)) {
                        repeated++;
                    }
                }
                
                if (repeated > maxRepeated) {
                    maxRepeated = repeated;
                    recommendation.put(getKey(cars.getInventory(), valuesAsList.get(i)), valuesAsList.get(i));
                }
                if (repeated == maxRepeated) {
                    recommendation.put(getKey(cars.getInventory(), valuesAsList.get(i)), valuesAsList.get(i));
                }
            }            
        }
        
        cars.setInventory(new TreeMap<Posts, String>(recommendation));
        return cars;
    }
    
    private static <K, V> K getKey(Map<K, V> map, V value) {
        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        CustomerServiceAgent csa = new CustomerServiceAgent();
        csa.displayCarPreferences(csa.questions());
    }
    
}
