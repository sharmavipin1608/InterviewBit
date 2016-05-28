/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author vipinsharma
 */
public class MedianOfArray {
    public static double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
	    int m = 0;
	    int n = 0;
            boolean even = false;
	    List<Integer> c = new ArrayList<Integer>();
	    if((a.size() + b.size())%2 == 0)
            {
                even = true;
            }
            int length = (a.size() + b.size())/2;
            int count = 0;
	    while(m<a.size() && n<b.size() && count < length+1){
                count++;
	        if(a.get(m) < b.get(n)){
	            c.add(a.get(m));
	            m++;
	        }
	        else{
	            c.add(b.get(n));
	            n++;
	        }
	    }
	    
	    while(m<a.size() && count < length+1){
	        c.add(a.get(m));
	        m++;
                count++;
	    }
	    while(n<b.size() && count < length+1){
	        c.add(b.get(n));
	        n++;
                count++;
	    }
	    System.out.println(c.toString());
	    if(even){
	        return (double)(c.get(c.size()-1) + c.get((c.size()-2)))/2;
	    }
	    else{
	        return (double)c.get(c.size()-1);
	    }
	}
    
    public static void main(String args[]){
        List<Integer> a = Arrays.asList(-50, -41, -40, -18, 5, 21, 28);
        List<Integer> b = Arrays.asList(-50, -21, -10);
        System.out.println(findMedianSortedArrays(a,b));
    }
}
