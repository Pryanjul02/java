package Arrays.java;
import java.util.Scanner;
public class sum2D {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[][] array = Arrays.java.ArrayUtility.input2DArray();
        long sum = sum2Darray(array);
        double average = average2Darray(array);
        System.out.println(" required sum is " + sum);
        System.out.println("Required average is " + average);


    }


    public static  long sum2Darray(int[][] array){
        int i=0;
        long sum=0;
        while(i<array.length){
            int j=0;
            while(j<array[i].length){
                sum+=array[i][j];
                j++;
            }
            i++;

        }
        return sum;
    }

    public static double average2Darray(int[][] array){
        if( array.length == 0){
            return 0;
        }
        int rows = array.length;
        int columns = array[0].length;
        double size = rows*columns;
        double  average = (int) (sum2Darray(array)/size);
        return average;
    }
}
