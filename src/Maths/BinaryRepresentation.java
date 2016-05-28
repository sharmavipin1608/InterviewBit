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
public class BinaryRepresentation {
    public static String findDigitsInBinary(int a) {
        StringBuilder str = new StringBuilder();
        while(a>0){
            str.append(a%2);
            a=a/2;
        }
        //str.append(a);
        return str.reverse().toString();
    }
    
    public static void main(String args[]){
        System.out.println(findDigitsInBinary(5));
        System.out.println(findDigitsInBinary(15));
        System.out.println(findDigitsInBinary(25));
        System.out.println(findDigitsInBinary(35));
    }
}
