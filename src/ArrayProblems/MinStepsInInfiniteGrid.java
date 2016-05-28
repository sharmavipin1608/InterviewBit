//You are in an infinite 2D grid where you can move in any of the 8 directions :
//
//    (x,y) to 
//    (x+1, y), 
//    (x - 1, y), 
//    (x, y+1), 
//    (x, y-1), 
//    (x-1, y-1), 
//    (x+1,y+1), 
//    (x-1,y+1), 
//    (x+1,y-1) 
//You are given a sequence of points and the order in which you need to cover the points. Give the minimum number of steps in which you can achieve it. You start from the first point.
//
//Example :
//
//Input : [(0, 0), (1, 1), (1, 2)]
//Output : 2

package ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinStepsInInfiniteGrid {
    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    public static int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int numOfCoordinates = X.size();
        int steps = 0;
        int totalSteps = 0;
        for(int i=1; i<numOfCoordinates; i++){
            steps = Math.max(Math.abs(X.get(i) - X.get(i-1)), Math.abs(Y.get(i) - Y.get(i-1)));
            totalSteps += steps;
        }
        return totalSteps;
    }
    
    public static void main(String args[]){
        ArrayList<Integer> X = new ArrayList<>();
        ArrayList<Integer> Y = new ArrayList<>();
        X.add(0);X.add(1);X.add(1);
        Y.add(0);Y.add(1);Y.add(2);
        
        System.out.println(coverPoints(X,Y));
    }
}
