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
public class GreatestCommonDivisor {
    public static int gcd(int a, int b) {
        if(a < 0 || b < 0)
            return 0;
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        for(int i=1;i<=Math.sqrt(min);i++){
            if(min%i==0){
                A.add(i);
                if(i != Math.sqrt(min))
                    B.add(min/i);
            }
        }
        System.out.println("A : " + A.toString() + " B : " + B.toString());
        for(int i=0;i<B.size();i++){
            if((max)%B.get(i) == 0){
                return i;
            }
        }
        for(int i=(A.size()-1);i>=0;i--){
            if((max)%A.get(i) == 0){
                return A.get(i);
            }
        }
        return 0;
    }
    
    public static void main(String args[]){
        System.out.println(gcd(350,136));
    }
}
