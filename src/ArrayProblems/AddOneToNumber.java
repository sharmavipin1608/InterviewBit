//Given a non-negative number represented as an array of digits,
//
//add 1 to the number ( increment the number represented by the digits ).
//
//The digits are stored such that the most significant digit is at the head of the list.
//
//Example:
//
//If the vector has [1, 2, 3]
//
//the returned vector should be [1, 2, 4]
//
//as 123 + 1 = 124.

package ArrayProblems;

import java.util.ArrayList;

/**
 *
 * @author vipinsharma
 */
public class AddOneToNumber {
    public static ArrayList<Integer> plusRandomNum(ArrayList<Integer> a,int num) {
        int length = a.size();
        boolean carry = false;
        for(int i=length-1;i>=0;i--){
            carry = false;
            
            if(a.get(i) + num > 9){
                a.set(i, (a.get(i)+num)%10);
                num = 1;
                carry = true;
            }
            else
            {
                a.set(i, (a.get(i)+num));
                break;
            }
            
            if(i==0 && carry == true)
                a.add(i, 1);
        }
        return a;
    }
    
    public static void main(String args[]){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(9);
        a.add(9);
        
        System.out.println("original : " + a.toString());
        
        plusRandomNum(a,1);
        
        System.out.println(a.toString());
    }
}
