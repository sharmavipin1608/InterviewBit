//Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).
//
//You may assume that the intervals were initially sorted according to their start times.
//
//Example 1:
//
//Given intervals [1,3],[6,9] insert and merge [2,5] would result in [1,5],[6,9].
//
//Example 2:
//
//Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] would result in [1,2],[3,10],[12,16].
//
//This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].
//
//Make sure the returned intervals are also sorted.

package ArrayProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author vipinsharma
 */
public class MergeIntervals {
    public static class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }
    
    public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> temp = new ArrayList<Interval>();
        Interval merge = new Interval();
        intervals.add(newInterval);
        
        Comparator<Interval> intervalComparator = new Comparator<Interval>(){
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        };
        
        Collections.sort(intervals, intervalComparator);
        
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        
        for(int i=1; i<intervals.size();i++){
            Interval current = intervals.get(i);
            if(current.start <= end){
                end = Math.max(end, current.end);
            }
            else{
                temp.add(new Interval(start,end));
                start = current.start;
                end = current.end;
            }
        }
        
        temp.add(new Interval(start,end));
        
//        for(Interval inter : temp){
//            System.out.println("[" + inter.start + "," + inter.end + "]");
//        }
        //System.out.println(merge.start + "" + merge.end);
        return temp;
    }
    
    public static void main(String args[]){
        ArrayList<Interval> a = new ArrayList<Interval>();
        a.add(new Interval(1,3));
        a.add(new Interval(6,9));
        
        Interval interval = new Interval(4,10);
        
        insert(a,interval);
    }
}
