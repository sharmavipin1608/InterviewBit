//Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to given number.
//
//NOTE A solution will always exist. read Goldbach’s conjecture
//
//Example:
//
//
//Input : 4
//Output: 2 + 2 = 4
//
//If there are more than one solutions possible, return the lexicographically smaller solution.
//
//If [a, b] is one solution with a <= b,
//and [c,d] is another solution with c <= d, then
//
//[a, b] < [c, d] 
//
//If a < c OR a==c AND b < d. 
package Maths;

import java.util.ArrayList;

/**
 *
 * @author vipinsharma
 */
public class PrimeSum {

    public static ArrayList<Integer> primesum(int a) {
        ArrayList<Integer> A = new ArrayList<>();
        if(a%2 != 0)
            return A;
        for (int i = 1; i <= a/2; i++) {
            if(isPrime(i) == 1 && isPrime(a-i)==1){
                A.add(i);
                A.add(a-i);
                break;
            }
        }
        return A;
    }

    public static int isPrime(int n) {
        int count = 0;
        if (n < 2) {
            return 0;
        }
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
                if (i != Math.sqrt(n)) {
                    count++;
                }
            }
        }
        return count > 2 ? 0 : 1;
    }

    public static void main(String args[]) {
        System.out.println(primesum(18).toString());
        System.out.println(primesum(28).toString());
        System.out.println(primesum(38).toString());
        System.out.println(primesum(48).toString());
    }
}
