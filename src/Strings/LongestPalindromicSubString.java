/**
 *
 * @author vipinsharma
 * @date May 5, 2016
 * @time 12:51:38 PM
 */

package Strings;

import java.util.ArrayList;

public class LongestPalindromicSubString {
    public static String longestPalindrome(String b){
        String a=b.toLowerCase();
        String longestPallindrome = b.charAt(0)+"";
        
        if(b.length() < 2){
            return b;
        }
        
        for(int i=0;i<a.length();i++){
            ArrayList<Integer> indexFound = new ArrayList<>();
            char currChar = a.charAt(i);
            int index = i;
            while(a.indexOf(currChar,index+1) != -1){
                index = a.indexOf(currChar,index+1);
                indexFound.add(index);
            }
            for(int j=indexFound.size()-1;j>=0;j--){
                int currIndex = indexFound.get(j);
                String sub = a.substring(i,currIndex+1);
//                System.out.println(sub);
                if(isPalindrome(sub)){
                    longestPallindrome = sub.length() > longestPallindrome.length() ? sub:longestPallindrome;
                    break;
                }
                
            }
        }
//        System.out.println("longestPallindrome" + longestPallindrome);
        return longestPallindrome;        
    }
    
    public static boolean isPalindrome(String b) {
        StringBuilder str = new StringBuilder(b);
        str.reverse();
        if(b.equals(str.toString())){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args){
        String str = "vipivini";//Vipiniinvipiin
//        for(int i=0;i<str.length();i++){
//            String cha = str.charAt(i)+"";
//            System.out.println(cha + "  " + str.indexOf(cha, i+1));
//            
//        }
        
        System.out.println(longestPalindrome(str));
    }
}
