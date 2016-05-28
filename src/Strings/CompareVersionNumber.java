/**
 *
 * @author vipinsharma
 * @date May 3, 2016
 * @time 1:44:19 PM
 */

package Strings;

public class CompareVersionNumber {
    public static int compareVersion(String a, String b) {
        String[] A = a.split("\\.");
        String[] B = b.split("\\.");
        int loopIndex = A.length > B.length ? B.length:A.length;
        double aInt = Double.parseDouble(A[0]);
        double bInt = Double.parseDouble(B[0]);
        if(aInt != bInt){
            return aInt > bInt ? 1 : -1;
        }
        
        //boolean resultFound = false;
        for(int i=1;i<loopIndex;i++){
            if(A[i].compareTo(B[i]) > 0){
                return 1;
            }
            else if(A[i].compareTo(B[i]) < 0){
                return -1;
            }
            else{
                continue;
            }
        }
        if(A.length > B.length){
            while(loopIndex < A.length){
                 if(A[loopIndex].replaceFirst("^0+(?!$)", "").compareTo("0") == 0){
                     loopIndex ++;
                     continue;
                 }
                 else{
                     return 1;
                 }
             }            
        }
        else if(A.length < B.length){
            while(loopIndex < B.length){
                 if(B[loopIndex].replaceFirst("^0+(?!$)", "").compareTo("0") == 0){
                     loopIndex ++;
                     continue;
                 }
                 else{
                     return -1;
                 }
             }  
        }
        return 0;
    }
    public static void main(String args[]){
        System.out.println(compareVersion("13.4","13.4.0"));
        System.out.println(compareVersion("13.4.0","13.4.0.2.0"));
        System.out.println(compareVersion("2.6","2.06"));
        System.out.println(compareVersion("4444371174137455","5.6"));
        System.out.println(compareVersion("13.4.0","13.4.0.2.0"));
        String a = "13.4";
        System.out.println(a.split("\\.").length);
        
    }
}
