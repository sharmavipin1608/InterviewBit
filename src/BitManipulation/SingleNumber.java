/**
 *
 * @author vipinsharma
 * @date May 30, 2016
 * @time 3:21:04 PM
 */

package BitManipulation;

import java.util.Arrays;
import java.util.List;

public class SingleNumber {
    public static int singleNumber(final List<Integer> a) {
        int result = 0;
        for(Integer num : a){
            result = result^num;
        }
        System.out.println(result);
        return 0;
    }
    
    public static void main(String args[]){
        List<Integer> a = Arrays.asList(1,2,3,3,1);
        singleNumber(a);
    }
}
