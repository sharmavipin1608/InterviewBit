/*
 * Implement the next permutation, which rearranges numbers into the numerically next greater permutation of numbers.

    If such arrangement is not possible, it must be rearranged as the lowest possible order ie, sorted in an ascending order.

    The replacement must be in-place, do not allocate extra memory.

    Examples:

    1,2,3 → 1,3,2

    3,2,1 → 1,2,3

    1,1,5 → 1,5,1

    20, 50, 113 → 20, 113, 50                                           
    
 */
package ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author vipinsharma
 */
public class NextPermutation {
    public static void nextPermutation(ArrayList<Integer> a) {
        int length = a.size()-1;
        
        if(length == 0)
            return;
        
        while(length > 0 && a.get(length-1) > a.get(length)){
            length--;
        }
        
        //first - result obtained by swapping last 2
        if(length == a.size()-1){
            swap(a,length,length-1);
        }
        //second - if the number is the largest next permutation is simply the 
        //smallest number
        else if(length == 0){
            Collections.sort(a.subList(length, a.size()));
        }
        //third - replace the element before the array in descending order with 
        //the element which is closest and then sort 
        else{
            int temp = a.get(length-1);
            int closest = Integer.MAX_VALUE;
            int closestIndex = -1;
            for(int i=length;i<a.size();i++){
                if(a.get(i) > temp && a.get(i) < closest){
                    closest = a.get(i);
                    closestIndex = i;
                }
            }
            swap(a,length-1,closestIndex);
            Collections.sort(a.subList(length, a.size()));
            System.out.println("testing : " + a.subList(length, a.size()));
        }
            
    }
    
    public static void swap(ArrayList<Integer> a,int index1, int index2){
        int temp = a.get(index1);
        a.set(index1,a.get(index2));
        a.set(index2,temp);
    }
    
    public static void main(String args[]){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(20);
        a.add(50);
        a.add(113);
        System.out.println(a.toString());
        nextPermutation(a);
        System.out.println(a.toString());
        
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(319);
        a1.add(695);
        a1.add(52);
        System.out.println(a1.toString());
        nextPermutation(a1);
        System.out.println(a1.toString());
        
        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(1);
        a2.add(3);
        a2.add(2);
        System.out.println(a2.toString());
        nextPermutation(a2);
        System.out.println(a2.toString());
        
        ArrayList<Integer> a3 = new ArrayList<>();
        a3.add(2);
        a3.add(3);
        a3.add(1);
        System.out.println(a3.toString());
        nextPermutation(a3);
        System.out.println(a3.toString());
        
        ArrayList<Integer> a4 = new ArrayList<>();
        a4.add(3);
        a4.add(5);
        a4.add(4);
        a4.add(2);
        a4.add(1);
        System.out.println(a4.toString());
        nextPermutation(a4);
        System.out.println(a4.toString());
    }
}
