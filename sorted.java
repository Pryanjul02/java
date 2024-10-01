package Arrays.java;

import java.util.Scanner;
public class sorted {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int [] numarray = Arrays.java.ArrayUtility.inputArray();
        boolean inc = increasing(numarray);
        boolean dec =decreasing(numarray);
        if( inc || dec){
            System.out.println( "your array is a sorted array.");

        }
        else{
            System.out.println("your array is not a sorted array.");
        }

    }

    public static boolean increasing(int[] numarray){
        int i= 1;
        while(i<numarray.length){
            if(numarray[i]<numarray[i-1]){

                System.out.println(" not incraesing");
                return false;

            }
            i++;
        }
        System.out.println(" increasing");
        return true;

    }

    public static boolean decreasing(int[] numarray){
        int i=1;
        while(i<numarray.length){
            if(numarray[i]>numarray[i-1]){
                System.out.println("  not decreasing");
                return false;
            }
            i++;
        }
        System.out.println("   decreasing ");
        return true;
    }

}
