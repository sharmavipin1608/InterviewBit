/**
 *
 * @author vipinsharma
 * @date May 30, 2016
 * @time 9:54:38 PM
 */

package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfSortedArrays {
    public static ArrayList<Integer> intersect(final List<Integer> a, final List<Integer> b) {
        ArrayList<Integer> result = new ArrayList<>();
        
        int aLength = a.size();
        int bLength = b.size();
        
        //int length = aLength < bLength ? aLength : bLength;
        
        int pointerA = 0;
        int pointerB = 0;
        
        while(pointerA < aLength && pointerB < bLength){
            int aNum = a.get(pointerA);
            int bNum = b.get(pointerB);
            if(aNum == bNum){
                result.add(aNum);
                pointerA++;
                pointerB++;
            }
            else if(aNum > bNum){
                pointerB++;
            }
            else{
                pointerA++;
            }
                
            
        }
        return result;
    }
    
    public static void main(String args[]){
        List<Integer> a = Arrays.asList(1,2,3,3,4,5,6);
        List<Integer> b = Arrays.asList(3,3,5);
        System.out.println(intersect(a,b).toString());
    }
}
