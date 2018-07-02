/**
 *
 * @author vipinsharma
 * @date May 29, 2016
 * @time 9:03:39 PM
 */

package BitManipulation;

public class NumberOf1Bits {
    public static int numSetBits(long a) {
        int count=0;
        while(a>0){
            if(a%2 == 1)
                count++;
            a=a>>1;
        }
        //str.append(a);
        return count;
    }
        
    public static void main(String args[]){
        System.out.println(numSetBits(11));
        System.out.println(numSetBits(32));
        System.out.println(numSetBits(333));
    }
}
