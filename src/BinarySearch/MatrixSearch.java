/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearch;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vipinsharma
 */
public class MatrixSearch {
    public static int searchMatrix(int[][] a, int b) {
        int start = 0;
        int end = a.length-1;
        int mid = 0;
        
        while(start <= end){
            mid = start + (end - start)/2;
            if(a[mid][0] == b)
                return 1;
            else if(a[mid][0] < b){
                start = mid+1;
                if(a[mid][a[0].length-1] >= b){
                    break;
                }
            }
            else if(a[mid][0] > b){
                end = mid - 1;
            }
        }
        
        start = 0;
        end = a[0].length-1;
        int rowSelected = mid;
        
        while(start <= end){
            mid = start + (end - start)/2;
            if(a[rowSelected][mid] == b)
                return 1;
            else if(a[rowSelected][mid] < b)
                start = mid+1;
            else 
                end = mid - 1;
                
        }
        return 0;
    }
    
    public static int searchMatrix(ArrayList<ArrayList<Integer>> a, int b){
        int start = 0;
        int end = a.size()-1;
        int mid = 0;
        
        while(start <= end){
            mid = start + (end - start)/2;
            if(a.get(mid).get(0) == b)
                return 1;
            else if(a.get(mid).get(0) < b){
                start = mid+1;
                if(a.get(mid).get(a.get(0).size()-1) >= b){
                    break;
                }
            }
            else if(a.get(mid).get(0) > b){
                end = mid - 1;
            }
        }
        
        start = 0;
        end = a.get(0).size()-1;
        int rowSelected = mid;
        
        while(start <= end){
            mid = start + (end - start)/2;
            if(a.get(rowSelected).get(mid) == b)
                return 1;
            else if(a.get(rowSelected).get(mid) < b)
                start = mid+1;
            else 
                end = mid - 1;
                
        }
        return 0;
    }
    public static void main(String args[]){
        
        int[][] table = {{1,3,5,7}, {10,11,16,20}, {23,30,34,50}};
//        System.out.println(searchMatrix(table,3));
//        System.out.println(searchMatrix(table,17));
        System.out.println(searchMatrix(table,50));
        System.out.println(searchMatrix(table,20));
    }
}
