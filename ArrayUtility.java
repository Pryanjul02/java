package Arrays.java;


import java.util.Scanner;
public class ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner (System.in);
        System.out.print( " enter the size of an array ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i=0;
        while (i<size){
            System.out.println("enter the first no. " + (i+1) + " ;");
            nums[i]= input.nextInt();
            i++;


        }
        return nums;
    }

    public static int[][] input2DArray(){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the no. of rows ");
        int rows = input.nextInt();
        System.out.println("Enter the no. of columns ");
        int columns = input.nextInt();
        int[][] Array = new int[rows][columns];
        int i=0 ;
        while(i<rows){
            int j= 0;
            while(j<columns){
                System.out.print("Enter the element " + (i+1) + "column "+(j+1) + " ");
                Array[i][j] =input.nextInt();
                j++;
            }
            i++;

        }
        return Array;
    }





    public static void displayarray( int[] numarray){
        int i=0;
        while(i<numarray.length){
            System.out.print( numarray[i] + " ");
            i++;
        }
    }
}

