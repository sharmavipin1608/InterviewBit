/**
 *
 * @author vipinsharma
 * @date May 4, 2016
 * @time 6:58:22 PM
 */

package Strings;

import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String a){
        HashMap<String, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put("I",1);
        romanNumerals.put("V",5);
        romanNumerals.put("X",10);
        romanNumerals.put("L",50);
        romanNumerals.put("C",100);
        romanNumerals.put("D",500);
        romanNumerals.put("M",1000);
        int result = 0;
        int f=0;
        int s=0;
        for(int i=0;i<a.length();i++){
            f = romanNumerals.get(a.charAt(i)+"");
            if(i < a.length()-1)
                s = romanNumerals.get(a.charAt(i+1)+"");
            
            if(f<s){
                result = result + (s-f);
                i++;
                f=0;
                s=0;
            }
            else{
                
                result += f;
                f=0;
            
            }
        }
        return result;
    }
    
    public static void main(String args[]){
        System.out.println(romanToInt("XXX"));
        System.out.println(romanToInt("MCMLIV"));
        System.out.println(romanToInt("MCMXC"));
        System.out.println(romanToInt("MMMCCLXXXVII"));
        System.out.println(romanToInt("MMDCCCXLV"));
        
    }
}
