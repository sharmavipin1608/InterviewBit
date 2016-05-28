//You are given a read only array of n integers from 1 to n.
//
//Each integer appears exactly once except A which appears twice and B which is missing.
//
//Return A and B.
//
//Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
//
//Note that in your output A should precede B.

package ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author vipinsharma
 */
public class RepeatAndMissingNumber {
    public static ArrayList<Integer> repeatedNumber(final List<Integer> a) {
        int length = a.size();
        int[] arr = new int[length+1];
        
        int duplicate = 0;
        int missing = 0;
        for(int i=0; i<length; i++){
            arr[a.get(i)] += 1;
        }
        
        for(int i=1; i<arr.length; i++){
            if(arr[i] == 0)
                missing = i;
            else if(arr[i] == 2)
                duplicate = i;
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add(duplicate);
        result.add(missing);
        
        return result;
    }
    
    public static void main(String args[]){
        List<Integer> a = Arrays.asList(1,2,5,5,3);
        System.out.println("Array : " + a.toString());
        
        List<Integer> b = repeatedNumber(a);
        System.out.println("Duplicate : " + b.get(0) + " Missing : " + b.get(1));
    }
}
