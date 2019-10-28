import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
    Difference(int []a){
       elements= a;
      this.maximumDifference=maximumDifference;
     computeDifference();
    }
	 public void computeDifference()
     {
          maximumDifference=0;
                int different;
         for (int i =0; i< elements.length-1 ; i++){
            for (int j=i+1; j<elements.length; j++){
                   different=elements[i]-elements[j];
             if (different<0){
               different *=-1;
             if(different>= maximumDifference)
                 maximumDifference=different;
             
             }
            else {
                  different *=1;
                   if(different>= maximumDifference)
                 maximumDifference=different;  }
 }
} 
           //return maximumDifference;
 }
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}