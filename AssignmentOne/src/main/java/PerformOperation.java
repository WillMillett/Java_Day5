/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fayt
 */
public class PerformOperation {
    
    public MyFunctionalInterface isOdd(){
        
        MyFunctionalInterface myIf = (num) ->  {
             return num % 2 == 0 ? 0 : 1;
        };
        return myIf;
    }
    
    public MyFunctionalInterface isPrime(){
        
        MyFunctionalInterface myIf = (num) ->  {
            //if num is 1 it is composite
            if (num == 1) {
                return 0;
            }
            
            for (int i = 2; i <= num/ 2; ++i) {
                if (num % i == 0) {
                     return 0;
                }
            }
            //return it is prime
            return 1;
        };
        return myIf;
    }
    
    public MyFunctionalInterface isPalindrome(){
        
        MyFunctionalInterface myIf = (num) ->  {
            String strNum = "" + num;
            int i = 0, j = strNum.length() - 1;
            while (i < j) {
                if (strNum.charAt(i) != strNum.charAt(j))
                        return 0;
                i++;
                j--;
            }
            return 1;
            
        };
        return myIf;
    }
    
}
