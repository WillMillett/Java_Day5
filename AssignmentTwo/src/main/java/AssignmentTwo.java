
import java.util.ArrayList;
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
public class AssignmentTwo {
    
    public static void main(String[] args) {
        //lists for rightDigit
        List<Integer> intList1 = Arrays.asList(1,22,93);
        List<Integer> intList2 = Arrays.asList(16,8,886,8,1);
        List<Integer> intList3 = Arrays.asList(10,0);
        //lists for doubling
        List<Integer> doubleList = Arrays.asList(1,2,3);
        List<Integer> doubleList2 = Arrays.asList(6,8,6,8,-1);
        List<Integer> doubleList3 = Arrays.asList();
        //lists for removing X
         List<String> removeXList = Arrays.asList("ax", "bb", "cx");
         List<String> removeXList2 = Arrays.asList("xxax", "xbxbx", "xxcx");
         List<String> removeXList3 = Arrays.asList("x");
         
        //rightdigit output
        System.out.println("Right Digiit Output");
        System.out.println(rightDigit(intList1));
        System.out.println(rightDigit(intList2));
        System.out.println(rightDigit(intList3));
        //double output
        System.out.println("Doubling Output");
        System.out.println(doubling(doubleList));
        System.out.println(doubling(doubleList2));
        System.out.println(doubling(doubleList3));
        
        //removeX output
        System.out.println("RemoveX Output");
        System.out.println(removeX(removeXList));
        System.out.println(removeX(removeXList2));
        System.out.println(removeX(removeXList3));
        
    }
    
    public static List<Integer> rightDigit(List<Integer> tempList){
        
        tempList.replaceAll(t -> t % 10 );
        
        return tempList;
    }
    
    public static List<Integer> doubling(List<Integer> tempList){
        
        tempList.replaceAll(t -> t * 2 );

        return tempList;
    }
    
     public static List<String> removeX(List<String> tempList){
        
        tempList.replaceAll(t -> t.replace("x", "") );
        
        return tempList;
    }
}
