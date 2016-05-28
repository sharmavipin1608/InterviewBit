
package BinarySearch;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author vipinsharma
 */
public class RotatedSortedSearch {
    public static int search(final List<Integer> a, int b) {
        int numOfLoop = (int)Math.ceil(Math.log(a.size()));
        int size = a.size();
        int start = 0;
        int end = size-1;
        int pivot = findMin(a);
        //Find index of min element
        
        int result = binarySearch(a,b,0,pivot-1);
        if(result == -1){
            result = binarySearch(a,b,pivot,a.size()-1);
        }
        return result;
    }
    
    public static int findMin(List<Integer> a){
        int start = 0;
        int end = a.size()-1;
        int n = a.size();
        int mid=0;
        while(start <= end){
            mid = (start + end)/2;
            
            int num = a.get(mid);
            int next = a.get((mid + 1) % n);
	    int prev = a.get((mid - 1 + n) % n);
	        
	    if (num < prev && num < next) {
                System.out.println("Mid : " + mid);
	        return mid;
	    }
            
            if(a.get(mid) > a.get(end)){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        System.out.println("Mid : " + mid);
        return mid;
    }
    
    public static int binarySearch(List<Integer> a, int b, int start, int end){
        int count = end - start + 1;
        while(count > 0)
        {
            int mid = (start + end)/2;
            if(b == a.get(mid)){
                return mid;
            }
            else if(a.get(mid) > b){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
            count /= 2;
        }
        return -1;
    }
    
    public static void main(String args[]){
        List<Integer> a = Arrays.asList(4,5,6,7,0,1,2);
//        System.out.println(search(a,23));
//        a = Arrays.asList(4,5,6,7,0,1,2);
//        System.out.println(search(a,2));
//        a = Arrays.asList(0,1,2);
//        System.out.println(search(a,2));
        a = Arrays.asList(4,5,6,7,9,10,11,12,14,0,1,2,3);
        System.out.println(search(a,7));
    }
}
