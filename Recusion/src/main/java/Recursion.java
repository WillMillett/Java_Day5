
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fayt
 */
public class Recursion {
    
    public static void main(String[] args) {
        
        int[] listOfInts1 = {2,4,4,8};
        int[] listOfInts2 = {1,2,4,8,1};
        int[] listOfInts3 = {2,4,4,8};
        int[] listOfInts4 = {5};
         
        Integer targetNumber = 2;
        Integer startPostion = 0;
        //System.out.println(groupSumClump(startPostion,listOfInts,targetNumber));
        //System.out.println(groupSumClump(startPostion,listOfInts2,targetNumber));
        //System.out.println(groupSumClump(startPostion,listOfInts3,targetNumber));
          System.out.println(groupSumClump(startPostion,listOfInts4,targetNumber));
    }
    public static boolean groupSumClump(int start, int[] numArr, int target){
        
//       Integer numOfConsecutive = 0;
//       Integer consecutiveStart = 0;
//       Integer consecutiveEnd = 0;
//       int counter = 0;
//        if(num.isEmpty() || target <= 0){
//            return false;     
//        }else{
//            if(start == 0){
//                //loop for each number in the list
//                while(start < num.size() - 1){
//                    //count the consecutive numbers if there are any
//                    for (int i = start; i < num.size(); i++) {
//                        if(num.get(i) == num.get(i++)){
//                            numOfConsecutive++;
//                        }else{
//                            break;
//                        }
//                    }
//                    //increment start
//                    start++;
//                }
//                //reset start to 0
//                start = 0;
//            }
//        }
//           try{
//                if(target < 0){
//                    return false;
//                }else if( target == 0){
//                    return true;
//                }
//                if(start == 0){
//                   if(groupSumClump(start + 1, num, target - num.get(start))){
//                       return true;
//                   }
//                     if(groupSumClump(start + 2, num, target - num.get(start))){
//                         return true;
//                     }
//                }else{
//
//                    if(groupSumClump(start + 1, num, target - num.get(start))){
//                        return true;
//                    }else{
//                        return false;
//                    }
//                }
//           }catch(Exception e){
//               
//           }
//            return false;
    //I did research and found this solution to this problem
    if(start >= numArr.length)
        return target == 0;
          
    int i = start;
    int sum = 0;
    
    while(i < numArr.length && numArr[start] == numArr[i]) {
        sum += numArr[i];
        i++;
    }
    if(groupSumClump(i, numArr, target - sum))
        return true;
                                        
    if(groupSumClump(i, numArr, target))
        return true;
                                                  
        return false;
    }
    
}
