/**
 *
 * @author vipinsharma
 * @date May 29, 2016
 * @time 9:22:57 PM
 */

package BitManipulation;

public class ReverseBits {
    public static long reverse(long a) {
        StringBuilder binary = new StringBuilder();
        while(a>0){
            binary.append(a%2);
            a=a/2;
        }
        
        long number=0;
        int length = binary.length();
        int count = length-1;
        for(int i=0;i<length;i++){
            number = number + (long)(Integer.parseInt(binary.charAt(i)+"")*Math.pow(2, count));
            count--;
        }
        
        for(int i=0;i<(32-binary.length());i++)
            number = number << 1;
        return number;
    }
    
    public static void main(String args[]){
        System.out.println(reverse(3));
        System.out.println(reverse(0));
    }
}
