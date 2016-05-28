//Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
//
//For example:
//
//Given the array [-2,1,-3,4,-1,2,1,-5,4],
//
//the contiguous subarray [4,-1,2,1] has the largest sum = 6.
//
//For this problem, return the maximum sum.

package ArrayProblems;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author vipinsharma
 */
public class MaxSumContiguousArray {
    //This will only be good if there are positive and negative numbers
    //won't work for all negative numbers
    public static int maxSubSum(int[] array){
        int length = array.length;
        int currMax=array[0];
        int maxSoFar=array[0];
        for(int i=1; i<length; i++){
            currMax = Math.max(array[i], currMax+array[i]);
            maxSoFar = Math.max(currMax, maxSoFar);
        }
        return maxSoFar;
    }
    
    public static int maxSubArray(final List<Integer> a) {
        int length = a.size();
        int currMax=a.get(0);
        int maxSoFar=a.get(0);
        for(int i=1; i<length; i++){
            currMax = Math.max(a.get(i), currMax+a.get(i));
            maxSoFar = Math.max(currMax, maxSoFar);
        }
        return maxSoFar;
    }
    
    public static void main(String args[]){
        int[] array = {2,3,-10,6,4,-8,2,3,5,6,-10};
        System.out.println("Max sub sum : " + maxSubSum(array));
        
        int[] array1 = {-2,-3,-10,-6,-4,-8,-2,3,-5,-6,-10};
        System.out.println("Max sub sum : " + maxSubSum(array1));
        
        List<Integer> a = Arrays.asList(2,3,-10,6,4,-8,2,3,5,6,-10);
        System.out.println("Max sub sum : " + maxSubArray(a));
        
        List<Integer> a1 = Arrays.asList(-2,-3,-10,-6,-4,-8,-2,3,-5,-6,-10);
        System.out.println("Max sub sum : " + maxSubArray(a1));
    }
}
