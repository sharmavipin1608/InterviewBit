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
public class StrStrImplementation {
    public static int strStr(final String haystack, final String needle) {
        int start = 0;
        int needleStart = 0;
        int result = -1;
        while(start < haystack.length()){
            if(haystack.charAt(start) == needle.charAt(needleStart)){
                result = start;
                int innerStart = start+1;
                needleStart++;
                while(needleStart < needle.length() && innerStart < haystack.length()){
                    if(haystack.charAt(innerStart) == needle.charAt(needleStart)){
                        innerStart++;
                        needleStart++;
                        continue;
                    }
                    else{
                        break;
                    }
                }
                if(needleStart == needle.length()){
                    break;
                }
                else{
                    result = -1;
                    needleStart = 0;
                }
            }
            start++;
        }
        return result;
    }
    
    public static void main(String args[]){
        System.out.println(strStr("asdasdasdasdsesesea","seseaaas"));
    }
}
