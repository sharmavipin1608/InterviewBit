/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maths;

/**
 *
 * @author vipinsharma
 */
public class CheckPrime {
    public static int isPrime(int n) {
	    int count = 0;
	    if(n < 2)
	        return 0;
	    for(int i=1;i<=Math.sqrt(n);i++){
	        if(n%i == 0){
	            count++;
	            if(i != Math.sqrt(n))
	                count++;
	        }
	    }
	    return count > 2 ? 0:1;
	}
    
    public static void main(String args[]){
        System.out.println(isPrime(1));
    }
}
