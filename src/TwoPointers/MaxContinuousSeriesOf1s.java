/**
 *
 * @author vipinsharma
 * @date May 31, 2016
 * @time 6:19:05 PM
 */

package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxContinuousSeriesOf1s {
    public static ArrayList<Integer> maxone(ArrayList<Integer> a, int b) {
        int size = a.size();
        ArrayList<Integer> zeroPos = new ArrayList<>();
        
        for(int i=0; i<size; i++){
            if(a.get(i) == 0)
                zeroPos.add(i);
        }
        
        int numOfZeroes = zeroPos.size();
        
        int finalStart = 0;
        int finalEnd = 0;
        
        if(numOfZeroes > b){
            int start = 0;
            int end = zeroPos.get(b) - 1;
            
            int maxSize = 0;
            int index = b;
            
            int startIndex = 0;
            
            while(index <= numOfZeroes){
                if(index == numOfZeroes)
                    end = size - 1;
                else
                    end = zeroPos.get(index)-1;
                
                int currSize = end - start + 1;
                
                if(currSize > maxSize){
                    maxSize = currSize;
                    finalStart = start;
                    finalEnd = end;
                }
                
                if(index != numOfZeroes)
                    start = zeroPos.get(startIndex)+1;
                index++;
                startIndex++;
            }
        }
        else{
            finalStart = 0;
            finalEnd = size-1;
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=finalStart;i<=finalEnd;i++){
            result.add(i);
        }
        return result;
    }
    
    public static void main(String args[]){
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,1,0,1,1,0,0,1,1,1));
        System.out.println(maxone(a,2));
    }

}
