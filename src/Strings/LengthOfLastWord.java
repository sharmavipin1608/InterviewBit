/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author vipinsharma
 */
public class LengthOfLastWord {
    public static int lengthOfLastWord(final String a) {
        int currentLength = 0;
        int previousLength = 0;
        int start = 0;
        boolean space = false;
        StringBuilder str = new StringBuilder();
        while(start < a.length()){
            int ascii = (int)a.charAt(start);
            if(space){
                if(ascii == 32){
                    start++;
                    continue;
                } 
                else{
                    str.delete(0, str.length());
                    space = false;
                }                    
            }
            if(ascii == 32){
                space = true;
            }
            else{
                str.append(a.charAt(start));
            }
            start++;
        }
        return str.length();
    }
    
    public static void main(String args[]){
        System.out.println(lengthOfLastWord(""));
        System.out.println(lengthOfLastWord("  "));
        System.out.println(lengthOfLastWord(" ca ca car  "));
        System.out.println(lengthOfLastWord(" ca "));
    }
}
