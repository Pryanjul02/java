package Arrays.java;

import java.util.Scanner;


public class maxandmin {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[] numarray = Arrays.java.ArrayUtility.inputArray();
        int max = max(numarray);
        int min = min(numarray);
        System.out.println( "your minimum value is " + min);
        System.out.println("maximum no." + max);




    }
    public static int min(int[] numarray){
        int min= Integer.MAX_VALUE;
        int i=0;
        while(i<numarray.length){
            if(min > numarray[i]){
                min=numarray[i];

            }
            i++;
        }
        return min;
    }
    public static int max ( int[] numarray){
        int max = Integer.MIN_VALUE;
        int i=0;
        while(i<numarray.length){
            if(max<numarray[i]){
                max=numarray[i];
            }
            i++;
        }
        return max;
    }
}
