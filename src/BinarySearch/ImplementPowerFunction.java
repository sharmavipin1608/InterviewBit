/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearch;

/**
 *
 * @author vipinsharma
 */
public class ImplementPowerFunction {
    public static int pow(int x, int n, int d) {
	    long a = x;
	    long res = 1L;
	    
	    while (n > 0) {
	        
	        if (n % 2 == 1) {
	            res *= a;
	            res %= d;
	        }
	        
	        a *= a;
	        a %= d;
	        n = n >> 1;
	        
	    }
	    
	    res = (res + d) % d;
	    
	    return (int) res;
	}
    
    public static void main(String args[]){
        System.out.println(pow(-2,5,20));
        System.out.println(pow(71045970,41535484,64735492));
        
    }
}
