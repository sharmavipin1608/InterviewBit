/**
 *
 * @author vipinsharma
 * @date May 30, 2016
 * @time 3:58:13 PM
 */

package BitManipulation;

import static BitManipulation.SingleNumber.singleNumber;
import java.util.Arrays;
import java.util.List;

public class SingleNumber2 {
    public static int singleNumber(final List<Integer> a) {
        int result = 0;
        int x = 1;
        for(int i=0;i<Integer.SIZE;i++){
            
            int sum = 0;
            for(Integer num : a){
                if((num & x) > 0){
                    sum++;
                }
            }
            if(sum%3 > 0){
                result |= x;
            }
            
            x = x << 1;
        }
        //System.out.println(result);
        return result;
    }
    
    public static void main(String args[]){
        //int a = 2;
        List<Integer> a = Arrays.asList(1,2,3,3,1,1,3);
        long start = System.currentTimeMillis();
        singleNumber(a);
        System.out.println(System.currentTimeMillis() - start);
        System.out.println();
    }
}
