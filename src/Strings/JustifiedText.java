/**
 *
 * @author vipinsharma
 * @date May 5, 2016
 * @time 9:39:53 AM
 */

//Given an array of words and a length L, format the text such that each line has exactly L characters and is fully (left and right) justified.
//You should pack your words in a greedy approach; that is, pack as many words as you can in each line.
//
//Pad extra spaces ‘ ‘ when necessary so that each line has exactly L characters.
//Extra spaces between words should be distributed as evenly as possible.
//If the number of spaces on a line do not divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right.
//For the last line of text, it should be left justified and no extra space is inserted between words.
//
//Your program should return a list of strings, where each string represents a single line.
//
//Example:
//
//words: ["This", "is", "an", "example", "of", "text", "justification."]
//
//L: 16.
//
//Return the formatted lines as:
//
//[
//   "This    is    an",
//   "example  of text",
//   "justification.  "
//]
// Note: Each word is guaranteed not to exceed L in length. 
//See Expected Output

package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JustifiedText {
    public static ArrayList<String> fullJustify(List<String> a, int b) {
        System.out.println("A : " + a.size());
        int index = 0;
        int currentLength = 0;
        int wordLength = 0;
//        int numOfWords = a.size();
        ArrayList<String> temp = new ArrayList<>();
        ArrayList<String> returnList = new ArrayList<>();
        boolean lastLine = false;
        while (index < a.size()) {
            String currentWord = a.get(index);
            if (currentWord.length() > b) {
                return null;
            }
            if (currentLength + currentWord.length() <= b) {
                temp.add(currentWord);
//                numOfWords--;
                currentLength += currentWord.length() + 1;
                wordLength += currentWord.length();
                index++;
            } else {
//                System.out.println();
//                System.out.print(justifyText(temp,wordLength,b));
//                if (a.size() - index == 1) {
//                    lastLine = true;
//                }
                returnList.add(justifyText(temp, wordLength, b, lastLine));
                temp.removeAll(a);
                currentLength = 0;
                wordLength = 0;
            }
        }
//        System.out.println();
//        System.out.print(justifyText(temp,wordLength,b));
        if (!temp.isEmpty()) {
            returnList.add(justifyText(temp, wordLength, b, true));
        }
        return returnList;
    }

    public static String justifyText(ArrayList<String> temp, int wordLength, int b, boolean lastLine) {
        System.out.println("temp : " + temp.size());
        StringBuilder returnString = new StringBuilder();
        double numOfWords = temp.size() - 1;
        double totalSpaces = b - wordLength;
        int numOfSpaces = 0;
        if (lastLine || numOfWords == 0) {
//            returnString.append(temp.get(0));
//            while(totalSpaces > 0){
//                returnString.append(" ");
//                totalSpaces--;
//            }
            returnString.append(temp.get(0));
            for (int i = 1; i < temp.size(); i++) {
                returnString.append(" ");
                returnString.append(temp.get(i));
                totalSpaces--;
            }
            appendSpaces(returnString, (int) totalSpaces);
            return returnString.toString();
        }
        for (String str : temp) {
            if (numOfWords > 0) {
                numOfSpaces = (int) Math.ceil((totalSpaces) / (numOfWords));
            }
            else{
                numOfSpaces = 0;
            }
            if(numOfWords == 2){
                System.out.println();
            }
            numOfWords--;
            totalSpaces -= numOfSpaces;
            returnString.append(str);
//            temp.remove(str);
//            while(numOfSpaces > 0){
//                returnString.append(" ");
//                numOfSpaces--;
//            }
            if(numOfSpaces > 0)
                appendSpaces(returnString, numOfSpaces);
            
        }
        return returnString.toString();
    }

    public static void appendSpaces(StringBuilder ret, int numOfSpaces) {
        while (numOfSpaces > 0) {
            ret.append(" ");
            numOfSpaces--;
        }
    }
    
    public static void main(String args[]){
//        List<String> a = Arrays.asList("This", "is", "an", "example", "of", "text", "justification.");
//        for(String str : fullJustify(a,16))
//            System.out.println(str + "   " + str.length());
        List<String> a = Arrays.asList("tv", "izln", "dkq", "ypbbix", "k", "xoojn", "xju", "xfe", "aysz", "agkfhvtqkt", "rsklvgn", "kedzohp", "lqzz", "hivu", "gtxrjj", "nz", "ysoatq", "n", "ote", "xuctw", "vlvgmfzm", "zlpmp", "oe", "kayhyihc", "yvsllceili", "osqkjjvydc", "p", "zxqrgyvnic", "ebxhww", "pyjdlt", "ruwl", "lnlt", "ddzf", "jicwez", "mcrj", "unbej", "on", "thivo", "sbzxsxvm", "jj", "lacb", "qfsopsmeq", "ial", "tifiuf", "uybh", "pcbufc", "nccdldzs", "pbsofijlmp", "ehdcxkgbi", "wu", "gvnzmw", "czonuzrls", "blg", "y", "qbdgiwboi", "wpeupcwz", "fxnbh", "sybikok", "ukuztzdqk", "oowhjnhol", "s", "kvmtoutvf", "ilh", "q", "tclbqcdbz", "oglfrq", "cwtucyecf", "am", "kflhesgk", "xnxpogj", "nx", "hwfb", "htmf", "xawcimlx", "hhivdgf", "uk", "evtsczh");
        for(String str : fullJustify(a,483))
            System.out.println(str + "    " + str.length());
    }
}
