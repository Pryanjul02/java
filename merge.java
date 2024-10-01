package Arrays.java;

import java.util.Scanner;

public class merge {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("your first array is ");
        int[] array1= Arrays.java.ArrayUtility.inputArray();
        System.out.println("your second array is ");
        int[] array2= Arrays.java.ArrayUtility.inputArray();
        int[] newarray  = Merge(array1,array2);
        System.out.print("your new array is \n");
        Arrays.java.ArrayUtility.displayarray(newarray);
    }

    public static int[] Merge( int[] array1,int[] array2){
        int i=0,j=0,k=0;
        int newsize=array1.length+array2.length;
        int[] newarray = new int[newsize];
        while(i<array1.length || j<array2.length){
            if( j==array2.length ||
                    ( i<array1.length && array1[i] < array2[j])){
                newarray[k]=array1[i];
                i++;
                k++;

            }
            else{
                newarray[k]=array2[j];
                j++;
                k++;
            }
        }
        return newarray;
    }
}
