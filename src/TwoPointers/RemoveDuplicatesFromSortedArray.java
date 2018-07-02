/**
 *
 * @author vipinsharma
 * @date May 31, 2016
 * @time 5:00:17 PM
 */

package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(ArrayList<Integer> a) {
        if(a == null || a.size() == 0){
            return 0;
        }
        else if(a.size() == 1){
            return a.size();
        }
        
        int length = a.size()-1;
        int currentNum = a.get(length);
        length--;
        
        while(length >= 0){
            if(a.get(length) == currentNum){
                try{
                    a.remove(length+1);
                }
                catch(Exception ex){
                    ex.printStackTrace();
                }
                length--;
            }
            else{
                currentNum = a.get(length);
                length--;
            }
        }
        //System.out.println(a.toString());
        return a.size();
    }
    
    public static void main(String args[]){
        long start = System.currentTimeMillis();
        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,1,2,3,4,5,5,6,6,6,6,7));
        System.out.println("Size : " + a.size() + " time : " + (System.currentTimeMillis() - start) + " Sol" + removeDuplicates(a));
        
        start = System.currentTimeMillis();
        a = new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,3,4,5,5,6,6,6,6,7,7,7,7,7,7,7,7,7,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,9,9,9,9,9,9,9,9,9,9,9,9,10,10,10,10,10,10,10,10,10,10,11,11,11,11,11,11,11,11,22,22,22,22,22,22,22,22,33,33,33,33,33,33,33,33,33,33,44,44,44,44,44,44,44,44,44,44,44,44,44,55,55,55,55,55,66,66,66,66,66,66,66,66,66,66,66,66,77,77,77,77,77,77,77,77,88,99));
        System.out.println("Size : " + a.size() + " time : " + (System.currentTimeMillis() - start) + " Sol" + removeDuplicates(a));
    }
}
