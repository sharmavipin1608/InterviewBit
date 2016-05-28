//You are given a binary string(i.e. with characters 0 and 1) S consisting of characters S1, S2, …, SN. In a single operation, you can choose two indices L and R such that 1 ≤ L ≤ R ≤ N and flip the characters SL, SL+1, …, SR. By flipping, we mean change character 0 to 1 and vice-versa.
//
//You aim is to perform ATMOST one operation such that in final string number of 1s is maximised. If you don’t want to perform the operation, return an empty array. Else, return an array consisting of two elements denoting L and R. If there are multiple solutions, return the lexicographically smallest pair of L and R.
//
//Notes: 
//- Pair (a, b) is lexicographically smaller than pair (c, d) if a < c or, if a == b, then b < d.
//
//For example,
//
//S = 010
//
//Pair of [L, R] | Final string
//_______________|_____________
//[1 1]          | 110
//[1 2]          | 100
//[1 3]          | 101
//[2 2]          | 000
//[2 3]          | 001
//
//We see that two pairs [1, 1] and [1, 3] give same number of 1s in final string. So, we return [1, 1].
//Another example,
//
//If S = 111
//
//No operation can give us more than three 1s in final string. So, we return empty array [].
//See Expected Output

package ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author vipinsharma
 */
public class Flip {
    public static ArrayList<Integer> flip(String A) {
        char[] a = A.toCharArray();
        int[] arr = new int[a.length];
        int bestTillNow = 0;
        int bestEndingHere = 0;
        int l = 0;
        int r = 0; 
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=0; i<a.length;i++){
            if(a[i] == '0')
                arr[i]=1;
            else
                arr[i]=-1;
        }
        
        for(int i=0; i<a.length; i++){
            if(bestEndingHere + arr[i] < 0){ //using < 0 and not <= 0 for 
                                             //lexicographically requirement
                bestEndingHere = 0;
                l = i+1;
            }
            else
                bestEndingHere+= arr[i];
            
            if(bestTillNow < bestEndingHere){
                bestTillNow = bestEndingHere;
                r = i;
                result.removeAll(result);
                result.add(l+1);
                result.add(r+1);
            }
        }
        return result;
    }
    
    public static void main(String args[]){
        String s = "011100111000101";
        ArrayList<Integer> result = flip(s);
        System.out.println(result.get(0) + "  " + result.get(1));
    }
}
