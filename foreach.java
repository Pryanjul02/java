import java.util.Scanner;
public class foreach {
    public static void main(String[] args) {
        int[] array =Arrays.java.ArrayUtility.inputArray();
        int max=Integer.MIN_VALUE;
        for(int num: array){
            if(max<num){
                max=num;
            }
        }

        System.out.println("maximum number ="+ max);




    }
}

