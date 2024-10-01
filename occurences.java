import java.util.Scanner;

public class occurences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array;
        array = Arrays.java.ArrayUtility.inputArray();
        System.out.println("Enter a no.");
        int a = input.nextInt();
        int occ=0;
        for(int num : array){

            if(num==a){

                occ++;
            }


        }

        System.out.println("no. of occurences is/are:" + occ);
    }

}
