/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maths;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author vipinsharma
 */
public class ExcelColumnTitle {
    static HashMap<Integer,String> alphabet = new HashMap<Integer, String>();
    
    public static void initialise(){
        alphabet.put(1, "A");
        alphabet.put(2, "B");
        alphabet.put(3, "C");
        alphabet.put(4, "D");
        alphabet.put(5, "E");
        alphabet.put(6, "F");
        alphabet.put(7, "G");
        alphabet.put(8, "H");
        alphabet.put(9, "I");
        alphabet.put(10, "J");
        alphabet.put(11, "K");
        alphabet.put(12, "L");
        alphabet.put(13, "M");
        alphabet.put(14, "N");
        alphabet.put(15, "O");
        alphabet.put(16, "P");
        alphabet.put(17, "Q");
        alphabet.put(18, "R");
        alphabet.put(19, "S");
        alphabet.put(20, "T");
        alphabet.put(21, "U");
        alphabet.put(22, "V");
        alphabet.put(23, "W");
        alphabet.put(24, "X");
        alphabet.put(25, "Y");
        alphabet.put(0, "Z");
    }
    
    public static String convertToTitle(int a) {
        ArrayList<String> A = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        initialise();
        while(a>0){
            A.add(alphabet.get(a%26));
            a=(a-1)/26;
        }
        for(int i=A.size()-1; i>=0; i--){
            result.append(A.get(i));
        }
        return result.toString();
    }
    
    public static void main(String args[]){
        System.out.println(convertToTitle(943566));
        System.out.println(convertToTitle(54));
        System.out.println(convertToTitle(26));
        
        
    }
}
