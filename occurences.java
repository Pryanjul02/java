package Arrays.java;

import java.util.Scanner;
public class occurences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numarray=Arrays.java.ArrayUtility.inputArray();
        System.out.println("Enter the no. u want to make search ");
        int a = input.nextInt();
        int occ=ocurrences( numarray , a);

        System.out.println(" your no. occurs " +occ+ " times");

    }

    public static int ocurrences(int[] numarray , int num){
        int i=0;
        int occ=0;
        while(i<numarray.length){
            if (numarray[i]== num){
                occ++;

            }
            i++;
        }


        return occ;
    }
}
