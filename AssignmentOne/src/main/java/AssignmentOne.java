
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fayt
 */



public class AssignmentOne {
    
    public static void main(String[] args) {
        /*
        Sample Input

            The first line contains an integer,  (the number of test cases).

            The  subsequent lines each describe a test case in the form of  space-separated integers:
            The first integer specifies the condition to check for ( for Odd/Even,  for Prime, or  for Palindrome). 
                    The second integer denotes the number to be checked.

            5
            1 4
            2 5
            3 898
            1 3
            2 12

        */
       // List<String> myList =  Arrays.asList("5","1 4", "2 5", "3 898", "1 3", "2 12");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount of input there will be");
        PerformOperation operation = new PerformOperation();
        MyFunctionalInterface myIF;
        Integer numOfInput = 0;
        //keep asking user for input till we get a numeric number > 0
        do {
            try {
                numOfInput = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                    System.out.println("Incorrect Input" + e.getMessage());
                    System.out.println("Please a numeric number greater than zero");
            }
        } while (numOfInput < 1);
        
        
        Integer userInput = 0;
        System.out.println("Please enter a new operation");
        //loop untill all the inputs have been processed
        do {
            
            try {
                
                userInput = scanner.nextInt();
               if(userInput == 1){
                   System.out.println("Please enter a number to check if it is even or odd");
                   myIF = operation.isOdd();
                    //check if the number is even or odd and display the output
                    if(myIF.numOperation(scanner.nextInt()) == 1){
                           System.out.println("The number is odd");
                    }else{
                           System.out.println("The number is even");
                    }//check if the number is prime and display the output
               }else if(userInput == 2){
                   System.out.println("Please enter a number to check if it is prime");
                   myIF = operation.isPrime();
                    if(myIF.numOperation(scanner.nextInt()) == 1){
                           System.out.println("The number is prime");
                    }else{
                        System.out.println("The number is not prime");
                    }
                }else{//check if the number is a palindrome and display the output
                   System.out.println("Please enter a number to check if it is palindrome");
                   myIF = operation.isPalindrome();
                   if(myIF.numOperation(scanner.nextInt()) == 1){
                           System.out.println("The number is a palindrome");
                   }else{
                       System.out.println("The number is not a palindrome");
                   }
                }
               //decrement numberOfInput
               numOfInput--;
               if(numOfInput != 0){
                   //ask for a new number
                System.out.println("Please enter a new operation");
               }else{
                  System.out.println("No more input");
               }
                              
            } catch (Exception e) {
                //if user enters a non numeric number throw an error
                System.out.println("Incorrect Input " + e.getMessage());
            }

        } while (numOfInput != 0);
        
        
    }
   
}
