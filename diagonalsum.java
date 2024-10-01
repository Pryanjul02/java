package Arrays.java;


import java.util.Scanner;

public class diagonalsum {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[][] array = Arrays.java.ArrayUtility.input2DArray();
        int sum = sumofdiagonals(array);
        System.out.println(" your required sum is " + sum);

    }

    public static int sumofdiagonals( int [][] array){
        int leftsum=sumofleftdiagonal(array);
        int rightsum=sumofrightdiagonal(array);
        int sum = leftsum + rightsum;
        if(array.length%2 != 0){
            int index = array.length/2;
            sum -= array[index][index];
        }
        return sum;
    }

    public static int sumofleftdiagonal(int [][] array){
        int i = 0;
        int sum=0;
        while(i<array.length){
            sum+=array[i][i];
            i++;
        }
        return sum;
    }

    public static int sumofrightdiagonal(int[][] array){
        int i=0;
        int sum =0;
        while(i<array.length){
            int column = array.length-1-i;
            sum += array[i][column];

            i++;
        }
        return sum;
    }
}
