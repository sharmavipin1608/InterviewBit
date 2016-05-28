//Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
//
//Example:
//
//"A man, a plan, a canal: Panama" is a palindrome.
//
//"race a car" is not a palindrome.
//
//Return 0 / 1 ( 0 for false, 1 for true ) for this problem
package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pallindrome {
    public static int isPalindromeWithRegEx(String a) {
        //0-9 : 48-57
        //A-Z : 65-90
        Pattern alphanumeric = Pattern.compile("[^a-zA-Z0-9]");
        Matcher match = alphanumeric.matcher(a);
        String b = match.replaceAll("").toLowerCase();
        //System.out.println(b);
        int start = 0;
        int end = b.length()-1;
        while(start <= end){
            //System.out.println("Start : " + b.charAt(start) + " end : " + b.charAt(end));
            if(b.charAt(start) == b.charAt(end)){
                start++;
                end--;
                continue;
            }
            else{
                return 0;
            }
        }
        return 1;
    }
    
    public static int isPalindrome(String a) {
        String b = a.toUpperCase();
        int start = 0;
        int end = b.length()-1;
        while(start <= end){
            int startAscii = (int)b.charAt(start);
            int endAscii = (int)b.charAt(end);
            System.out.println("Start : " + b.charAt(start) + " ascii : " + startAscii);
            System.out.println("End : " + b.charAt(end) + " ascii : " + endAscii);
            if(!((startAscii >= 48 && startAscii <= 57) || 
                    (startAscii >= 65 && startAscii <= 90))){
                start++;
                continue;
            }
            if(!((endAscii >= 48 && endAscii <= 57) || 
                    (endAscii >= 65 && endAscii <= 90))){
                end--;
                continue;
            }
            if(startAscii == endAscii){
                start++;
                end--;
                continue;
            }
            else{
                return 0;
            }
        }
        return 1;
    }
    
    public static void main(String args[]){
        String str = "str43434%$@@#$@#$ stratrakjh&^*&^*&^ uuaduyausd";
        System.out.println(isPalindrome(str));
        str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
        str = "454";
        System.out.println(isPalindrome(str));
        str = "#$%#$%#$%";
        System.out.println(isPalindrome(str));
        //System.out.println(str);
    }
}
