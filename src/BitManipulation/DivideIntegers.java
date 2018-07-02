/**
 *
 * @author vipinsharma
 * @date May 30, 2016
 * @time 4:18:19 PM
 */

package BitManipulation;

public class DivideIntegers {
    public static int divide(int dividend, int divisor) {
	    
	    if (divisor == 0)
	        return Integer.MAX_VALUE;
	    
	    if (dividend == Integer.MIN_VALUE && divisor == -1)
	        return Integer.MAX_VALUE;
	        
	    if (dividend == divisor)
	        return 1;
	        
	    if (divisor == 1)
	        return dividend;
	        
	    if (divisor == -1)
	        return -dividend;
	        
	    if (divisor == 2)
	        return (dividend >> 1);
	        
	    int res = (int) res(dividend, divisor);
	    
	    return res;
	}
	
	private static long res(long dividend, long divisor) {
	     boolean sign = false;
	    
	    if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0))
	        sign = true;
	    
	    
    	 dividend = Math.abs(dividend);
    	    
    	 divisor = Math.abs(divisor);
	    
	    int result = (int) Math.floor(Math.exp(Math.log(dividend) - Math.log(divisor)));
	    
	    return sign ? -result : result;
	}
    
    public static void main(String args[]){
        System.out.println(divide(36,8));
        System.out.println(divide(36,9));
        System.out.println(divide(36,10));
        System.out.println(divide(336,8));
        System.out.println(divide(-2147483648,-10000000));
        System.out.println(Math.abs(Integer.MIN_VALUE));
//        long start = System.currentTimeMillis();
//        System.out.println(divide(-2056269396,-7906947));
//        System.out.println(System.currentTimeMillis() - start);
    }
}
