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
public class ExcelColumnNumber {
    public enum alphabet { A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z }
    
    public static int titleToNumber(String a) {
        int length = a.length();
        int num = 0;
        int count=0;
        
        for(int i = length-1;i >= 0; i--){
            num = num + ((alphabet.valueOf(a.charAt(i)+"").ordinal()+1) * (int)Math.pow(26, count));
            count++;
        }
        return num;
    }
    
    
    public static void main(String args[]){
        System.out.println(titleToNumber("A"));
        System.out.println(titleToNumber("B"));
        System.out.println(titleToNumber("AB"));
        System.out.println(titleToNumber("BAQTZ"));
        System.out.println(titleToNumber("BAQUZ"));
    }
}
