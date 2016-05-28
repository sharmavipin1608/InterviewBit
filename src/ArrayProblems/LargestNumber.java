/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author vipinsharma
 */
public class LargestNumber {
    public static String largestNumber(final List<Integer> a) {
        List<String> b = new ArrayList<>();
        boolean allZero = true;
        for(Integer num : a){
            b.add(String.valueOf(num));
            if(num > 0)
                allZero = false;
        }
        
        if(allZero)
            return String.valueOf(0);
        
        Comparator<String> stringComparator = new Comparator<String>() {
            public int compare(String Y, String X) {
                String XY = X.concat(Y);
                String YX = Y.concat(X);
                int returnVal = XY.compareTo(YX);
                
                return  returnVal ;
            }
        };
        
        b.sort(stringComparator);
        String largestNum = "";
        for(int i=0; i<b.size(); i++){
            largestNum+=b.get(i);
            //System.out.println(largestNum);
        }
        
        return largestNum;
    }
    
//    public static String largestNumber(final List<Integer> A) {
//	    StringBuffer strBuf = new StringBuffer();
//	    Node num[];
//	    int i = 0;
//	    
//	    num = new Node[A.size()];
//	    
//	    for (int n : A) {
//	        num[i] = new Node(n);
//	        i++;
//	    }
//	    
//	    Arrays.sort(num);
//	    
//	    for (Node n : num) {
//	        if (n.number == 0 && strBuf.length() != 0)
//	            continue;
//	        strBuf.append(n.number);
//	    }
//
//	    
//	    return strBuf.toString();
//	}
//	
//	static class Node implements Comparable<Node> {
//	    
//	    int number;
//	    
//	    public Node(int number) {
//	        this.number = number;
//	    }
//	    
//	    @Override
//	    public int compareTo(Node o) {
//	        String first = String.valueOf(this.number) + String.valueOf(o.number);
//	        String second = String.valueOf(o.number) + String.valueOf(this.number);
//	        
//	        return second.compareTo(first);
//	    }
//	    
//	}
    
    public static void main(String args[]){
        List<Integer> a = Arrays.asList(0,0,0,89,0,0,0,0);
        System.out.println(largestNumber(a));
    }
}
