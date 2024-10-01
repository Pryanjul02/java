package Arrays.java;
import java.util.Scanner;
public class search2darray {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println(" your 2D array is ");
        int[][] array = Arrays.java.ArrayUtility.input2DArray();
        System.out.println(" enter the no. u want to search ");
        int num= input.nextInt();
        boolean Search = search(array,num);
        if(Search==true){
            System.out.println(" your element is present ");
        }
        else{
            System.out.println(" your element is not present ");

        }


    }

    public static boolean  search(int[][] array ,  int num ){

        int i=0 ;
        while (i<array.length){
            int j= 0;
            while(j<array[i].length){
                if(array[i][j]==num){

                    return true;

                }
                j++;
            }
            i++;
        }
        return false;
    }
}

