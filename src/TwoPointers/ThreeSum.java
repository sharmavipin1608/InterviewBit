/**
 *
 * @author vipinsharma
 * @date May 30, 2016
 * @time 7:41:29 PM
 */

package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
    public static int threeSumClosest(List<Integer> a, int b) {
        Collections.sort(a);
        int result = a.get(0) + a.get(1) + a.get(2);
        int length = a.size();
        for(int i=0;i<length-2;i++){
            int target = b - a.get(i);
            int j = i+1;
            int k = length - 1;
            int min = a.get(j) + a.get(k);
            while(j < k){
                int sum = a.get(j) + a.get(k);
                if(sum == target){
                    min = sum;
                    return b;
                }
                else if(sum > target)
                    k--;
                else
                    j++;
                
                int diff = Math.abs(sum - target);
                int otherDiff = Math.abs(result - b);
                
                result = diff < otherDiff ? sum + a.get(i) : result;
                //min = Math.abs(min - target) > Math.abs(sum - target) ? sum : min;
            }
            //int sum = a.get(i) + min;
            //result = Math.abs(sum - b) > Math.abs(result - b) ? result : sum;
        }
        return result;
    }
    
    public static void  main(String args[]){
        List<Integer> a = Arrays.asList(-1,2,1,-4);
        System.out.println(threeSumClosest(a,1));
        
        a = Arrays.asList(1, 3 ,-3 ,4 ,-5 ,6 ,-8 ,10 ,9 ,-13,15);
        System.out.println(threeSumClosest(a,5));
        
        a = Arrays.asList(-5, 1, 4, -7, 10, -7, 0, 7, 3, 0, -2, -5, -3, -6, 4, -7, -8, 0, 4, 9, 4, 1, -8, -6, -6, 0, -9, 5, 3, -9, -5, -9, 6, 3, 8, -10, 1, -2, 2, 1, -9, 2, -3, 9, 9, -10, 0, -9, -2, 7, 0, -4, -3, 1, 6, -3);
        System.out.println(threeSumClosest(a,-1));
    }

}
