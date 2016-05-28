//Implement int sqrt(int x).
//
//Compute and return the square root of x.
//
//If x is not a perfect square, return floor(sqrt(x))
//
//Example :
//
//Input : 11
//Output : 3
package BinarySearch;

/**
 *
 * @author vipinsharma
 */
public class SQRT {
    public static int sqrt(int a) {
        int start=0;
        int end=a;
        int count = 0;
        int mid = 0;
        
        if(a==0 || a==1 || a==2) 
            return a;
        
        while(start<=end){
            mid = start + (end-start)/2;
            
            if(mid == a/mid && (a%mid == 0)){
                return mid;
            }
            else if(mid > a/mid){
                end = mid - 1;
            }
            else{
                if((mid+1) > a/(mid+1)){
                    return mid;
                }
                start = mid + 1;
            }
        }
        
        return mid;
    }
    
    public static void main(String args[]){
        System.out.println(sqrt(930675566));
    }
    
}
