/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author 2177095
 */
class CustomerServiceAgent {

   
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
        String stringPref = "";
        try {
        System.out.println("What is your income? \n Press 1: <25K \n Press 2: 25K - 50K annually \n Press 3: 50K -75K annually \n Press 4: 75K - 100K annually \n Press 5: 100K and above");
        int answer01 = sc.nextInt();
        
        
          
        
    ////    String answer1 =   String.valueOf(question1());    // sc.nextLine();
               
        
        
       System.out.println("Do you have a preferred car model? \n Press 1: minivan \n Press 2: sportscar \n Press 3: pick-up truck \n Press 4: luxury car \n Press 5: compact cars \n Press 6 : SUV");
       int answer02 = sc.nextInt();
     ////   String answer2 = String.valueOf(question2());
        
        System.out.println("What mileage? \n Press 1: brand new (no mileage) \n Press 2: 100km - 50k km \n Press 3: 50k-100k km \n Press 4: 100k+ km");
        int answer03 = sc.nextInt();
      ////  String answer3 = String.valueOf(question3());
        
         stringPref = stringPref + answer01 + answer02 + answer03;
        
        }catch(Exception e) {
            System.out.println("Try again!");
            return questions();
        }
        return stringPref ;
    }
      
      public int question1(){
        
           Scanner sc = new Scanner(System.in);
          
          
          int answer01 = 0;
          
          
          try {
          System.out.println("What is your income? \n Press 1: <25K \n Press 2: 25K - 50K annually \n Press 3: 50K -75K annually \n Press 4: 75K - 100K annually \n Press 5: 100K and above");
         answer01 = sc.nextInt();
          
            if (answer01 <= 0 || answer01 >5) {
                
                System.out.println("Enter an answer between 1 and 5 plz");
                
                 return question1();
            }
          
          
        }catch(Exception e) {
            System.out.println("Enter the proper input");
            return question1();
            
            
        }
        
         
        
        return answer01;
    
          
      }
      
      public int question2(){
          Scanner sc = new Scanner(System.in);
          
          int answer02 = 0;
          try {
              
                System.out.println("Do you have a preferred car model? \n Press 1: minivan \n Press 2: sportscar \n Press 3: pick-up truck \n Press 4: luxury car \n Press 5: compact cars \n Press 6 : SUV");
        answer02 = sc.nextInt();
              
         if (answer02 <= 0 || answer02 >6) {
                
                System.out.println("Enter an answer between 1 and 6 plz");
                
                 return question2();
            }
          
        
        
          } catch(Exception e) {
              
              
              System.out.println("Enter the proper input");
            return question2();
              
          }
        
       
          
          
       
          
          
          return answer02;
      }
    
      public int question3(){
          Scanner sc = new Scanner(System.in);
          
          int answer03 = 0;
          
          try {
              
          
            System.out.println("What mileage? \n Press 1: brand new (no mileage) \n Press 2: 100km - 50k km \n Press 3: 50k-100k km \n Press 4: 100k+ km");
         answer03 = sc.nextInt();
         
         if (answer03 <= 0 || answer03 >4) {
                
                System.out.println("Enter an answer between 1 and 4 plz");
                
                 return question3();
            }
         
          
          } catch(Exception e) {
              
                 System.out.println("Enter the proper input");
            return question3();
              
              
          }
          
          return answer03;
      }
      
      
      
   public Inventory displayCarPreferences(String answerList) {
        
        Inventory cars = new Inventory();
        ArrayList<Character> charsAnswerList = new ArrayList<>();
 int repeated = 0;
        //pushing each chars in the arrayList of charsAnswerList
        for (int i = 0; i < answerList.length(); i++) {
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
                // nbr of times there are common nbrs
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
         if (repeated == 0) {
                        System.out.println("Did not find any  good match according to ur preferences so we displayed what fits ur budget");
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
      
        csa.displayCarPreferences(csa.questions()).display();
        
        
        
        
    }
     
     
     
     
     
}
