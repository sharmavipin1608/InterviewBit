//A robot is located at the top-left corner of an A x B grid (marked ‘Start’ in the diagram below).
//
//
//
//The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked ‘Finish’ in the diagram below).
//
//How many possible unique paths are there?
//
//Note: A and B will be such that the resulting answer fits in a 32 bit signed integer.
//
//Example :
//
//Input : A = 2, B = 2
//Output : 2
//
//2 possible routes : (0, 0) -> (0, 1) -> (1, 1) 
//              OR  : (0, 0) -> (1, 0) -> (1, 1)
package Maths;

/**
 *
 * @author vipinsharma
 */
public class UniquePaths {
    public static int uniquePaths(int a, int b) {
        if(a==1)
            return 1;
        if(b==1)
            return 1;
        return uniquePaths(a-1,b) + uniquePaths(a,b-1);
    }
    
    public static void main(String args[]){
        System.out.println(uniquePaths(1,1));
    }
}
