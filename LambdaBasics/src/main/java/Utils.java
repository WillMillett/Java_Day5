
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
public class Utils {
    
    public static int letterToSortBy(String string1, String string2){

        return  string2.indexOf('e') > string1.indexOf('e') ? 1 : -1;
      
         //  myList.forEach(t -> System.out.println(t));
    }
    
}
