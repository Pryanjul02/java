package Arrays.java;
import java.util.Scanner;
public class arraysum {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[] numarray;
        numarray = Arrays.java.ArrayUtility.inputArray();
        long sum = sum(numarray);
        double average = average(numarray);
        System.out.println(" sum of an array is " + sum);
        System.out.println(" Average of an array is "  + average );

    }

    public static long sum(int[] numarray){
        int i=0;
        long  sum=0;
        while (i<numarray.length){
            sum+=numarray[i];
            i++;

        }
        return sum;
    }
    public static double average (int[] numarray){
        double  Average;
        Average = (int) sum(numarray)/numarray.length;
        return Average ;
    }

}

