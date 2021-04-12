
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
public class BasicLambdas {
    
    public static void main(String[] args) {
        
        //Question 1
        
        List<String> myList = new ArrayList<>();
        myList.add("cat");
        myList.add("apple");
        myList.add("bear");
        myList.add("finch");
        myList.add("dog");
        myList.add("elephant");

        List<String> myList2 = Arrays.asList("cat", "apple", "bear", "finch", "dog", "elephant","ark");
        
        //sort shortest to longest
        myList = shortTolong(myList);
        //sort longest to shortest
        myList = longToShort(myList);
        //sort by first letters
        myList = sortByFirstLetter(myList);
        //sort by a a specific character first
        myList = letterToSortBy(myList, 'e');
        
        Collections.sort(myList, (s1,s2) -> Utils.letterToSortBy(s1,s2));
        
        //-------------------------------------------
        //  Question 2
        List<Integer> intArr = Arrays.asList(1,2,3,4,5 );
        System.out.println(commaSeparate(intArr));
        
        //----------------------------------------------
          /*
           Question 3
            Given a list of Strings, write a method that returns a list of all strings 
            that start with the letter 'a' (lower case) and have exactly 3 letters. 
            TIP: Use Java 8 Lambdas and Streams API's.
          */
          
          myList2 = threeLetterAWords(myList2);
          myList2.forEach(t -> System.out.println("List 2: " + t));   
        
    }
    //Question 1
    public static List shortTolong(List<String> myList){
        //shortest to longeest
        Collections.sort(myList, (o1, o2) -> (o1.length() - o2.length()));
     // myList.forEach(t -> System.out.println(t));
      
      return myList;
    }
    
    public static List longToShort(List<String> myList){
        //longest to shortest
        Collections.sort(myList, (o1, o2) -> (o2.length() - o1.length()));
      //  myList.forEach(t -> System.out.println(t));
        return myList;
    }
    public static List sortByFirstLetter(List<String> myList){
        
        //sort by first char
        Collections.sort(myList, (o1, o2) -> (o1.charAt(0) - o2.charAt(0)));
      //  myList.forEach(t -> System.out.println(t));
       
        return myList;
    }
    public static List letterToSortBy(List<String> myList, char letterToSortBy){
    //   Collections.sort(myList, (o1, o2) -> (o2.indexOf(letterToSortBy) - o1.indexOf(letterToSortBy)));
//       System.out.println(myList);  

        //sort E first
        Collections.sort(myList, (o1,o2) -> {
            return o2.indexOf(letterToSortBy) > o1.indexOf(letterToSortBy) ? 1 : -1;
        });
         //  myList.forEach(t -> System.out.println(t));
        return myList;
    }
   // ------------------------------------
        /*Question 2
            Using Java 8 features write a method that returns a comma separated string based 
            on a given list of integers. Each element should be preceded by the letter 'e' 
            if the number is even, and preceded by the letter 'o' if the number is odd. 
            For example, if the input list is (3,44), the output should be 'o3,e44'.
        */
        
    public static String commaSeparate(List<Integer> intArr){
        
       StringBuilder myString = new StringBuilder();
       
       intArr.forEach(t -> {
           
           if(t % 2 == 0){
               myString.append("e" + t +",");
           }else{
               myString.append("o" + t +",");
           }
           
       });
        
        return myString.toString();
    }
    
    public static List<String> threeLetterAWords(List<String> tempString){
        
        List<String> myString = new ArrayList<>();
        
        tempString.stream().filter(s -> s.charAt(0) == 'a'&& s.length() == 3)
                .forEach(t -> myString.add(t));
    
        return myString;
    }
    
}

