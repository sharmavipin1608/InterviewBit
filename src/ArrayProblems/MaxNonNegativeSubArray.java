//Find out the maximum sub-array of non negative numbers from an array.
//The sub-array should be continuous. That is, a sub-array created by choosing the second and fourth element and skipping the third element is invalid.
//
//Maximum sub-array is defined in terms of the sum of the elements in the sub-array. Sub-array A is greater than sub-array B if sum(A) > sum(B).
//
//Example:
//
//A : [1, 2, 5, -7, 2, 3]
//The two sub-arrays are [1, 2, 5] [2, 3].
//The answer is [1, 2, 5] as its sum is larger than [2, 3]
//NOTE: If there is a tie, then compare with segment's length and return segment which has maximum length
//NOTE 2: If there is still a tie, then return the segment with minimum starting index

package ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxNonNegativeSubArray {
    public static ArrayList<Integer> maxset(List<Integer> a) {
        int length = 0, left = 0, right = 0;
        double currSum;
        double maxSum = 0;
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        
        for(int i=0; i<a.size(); i++){
            left=i;
            currSum = 0;
            temp.removeAll(temp);
            
            while(i < a.size() && a.get(i) >= 0){
                currSum += a.get(i);
                temp.add(a.get(i));
                right=i;
                i++;
            }
            
            if(maxSum < currSum){
                maxSum = currSum;
                result.removeAll(result);
                result.addAll(temp);
                length = right - left + 1;
            }
            else if(maxSum == currSum && (right - left + 1) > length){
                result.removeAll(result);
                result.addAll(temp);
                length = right - left + 1;
            }
        }
        return result;
    }
    
    public static void main(String args[]){
        List<Integer> a = Arrays.asList(2, 4, 2 , -7, 2, 3, 1, 2);
        ArrayList<Integer> b = maxset(a);
        System.out.print(b.toString());
        
        List<Integer> a1 = Arrays.asList(1967513926, 1540383426, -1303455736, -521595368);
        b = maxset(a1);
        System.out.print(b.toString());
    }
}
