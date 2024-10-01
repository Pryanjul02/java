package Arrays.java;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[] numarray =Arrays.java.ArrayUtility.inputArray();
        reverse(numarray);
        System.out.println("your reversed array is ");
        Arrays.java.ArrayUtility.displayarray(numarray);



    }

    public static void reverse(int[] numarray){
        int i=0;


        while(i<(numarray.length/2)){
            int swap = numarray[i];
            numarray[i]=numarray[(numarray.length - i )- 1];
            numarray[(numarray.length-i)-1]=swap;

            i++;
        }
    }



}

