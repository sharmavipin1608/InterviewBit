/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maths;

import java.util.ArrayList;

/**
 *
 * @author vipinsharma
 */
public class PallindromeInteger {
    public static boolean isPalindrome(int a) {
        ArrayList<Integer> A = new ArrayList<>();
        
        if(a < 0)
            return false;
        else if(a < 10)
            return true;
        
        
        while(a>0){
            A.add(a%10);
            a=a/10;
        }
        
//        System.out.println(A.toString());
        
        int left = 0, right = A.size()-1;
        while(left < right){
//            System.out.println("left : " + left + " right : " + right);
//            System.out.println("a left : " + A.get(left) + " a right : " + A.get(right));
            if(A.get(left) == A.get(right)){
                left++;
                right--;
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[]){
        System.out.println(isPalindrome(1));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1212));
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(12212));
        System.out.println(isPalindrome(123321));
    }
    
}
