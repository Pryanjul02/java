import java.util.Scanner;
public class sumpositive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = Arrays.java.ArrayUtility.inputArray();
        int sum=0;

        for (int num : array){
            if(num>0){
                sum+=num;
                continue;
            }

        }

        System.out.println("Your sum of positive numbers " + sum);

    }

}
