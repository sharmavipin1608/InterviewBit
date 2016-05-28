/**
 *
 * @author vipinsharma
 * @date May 4, 2016
 * @time 6:43:18 PM
 */

package Strings;

import java.util.HashMap;

public class IntegerToRoman {
    public static String intToRoman(int a) {
        if(a>3999){
            return "";
        }
        HashMap<Integer,String> romanNumerals = new HashMap<Integer,String>();
        String result = new String();
        romanNumerals.put(0, "");
        romanNumerals.put(1, "I");
        romanNumerals.put(2, "II");
        romanNumerals.put(3, "III");
        romanNumerals.put(4, "IV");
        romanNumerals.put(5, "V");
        romanNumerals.put(6, "VI");
        romanNumerals.put(7, "VII");
        romanNumerals.put(8, "VIII");
        romanNumerals.put(9, "IX");
        romanNumerals.put(10, "X");
        romanNumerals.put(20, "XX");
        romanNumerals.put(30, "XXX");
        romanNumerals.put(40, "XL");
        romanNumerals.put(50, "L");
        romanNumerals.put(60, "LX");
        romanNumerals.put(70, "LXX");
        romanNumerals.put(80, "LXXX");
        romanNumerals.put(90, "XC");
        romanNumerals.put(100, "C");
        romanNumerals.put(200, "CC");
        romanNumerals.put(300, "CCC");
        romanNumerals.put(400, "CD");
        romanNumerals.put(500, "D");
        romanNumerals.put(600, "DC");
        romanNumerals.put(700, "DCC");
        romanNumerals.put(800, "DCCC");
        romanNumerals.put(900, "CM");
        romanNumerals.put(1000, "M");
        romanNumerals.put(2000, "MM");
        romanNumerals.put(3000, "MMM");
        
        int count=0;
        while(a>0){
            result = romanNumerals.get((a%10)*((int)Math.pow(10, count))) + result;
            a=a/10;
            count++;
        }
        return result;
    }
    
    public static void main(String args[]){
        System.out.println(intToRoman(1954));
        System.out.println(intToRoman(1990));
        System.out.println(intToRoman(2014));
    }
}
