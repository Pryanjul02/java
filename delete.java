package Arrays.java;
import java.util.Scanner;
public class delete {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[] numarray = Arrays.java.ArrayUtility.inputArray();
        System.out.println("Enter the no. u want to delete ");
        int numtodelete= input.nextInt();
        int[] newarray=deletenum( numarray , numtodelete);
        System.out.println( newarray) ;


    }
    public static int[] deletenum(int[] numrray , int numtodelete){
        int i=0;
        int newsize=numrray.length - (noofOccurences(  numrray , numtodelete));
        int [] newarray=new int [ newsize ];
        System.out.println("your array is ");
        while(i<numrray.length){
            if(numrray[i]!=numtodelete){

                System.out.print( numrray[i]+" ");
            }
            i++;
        }
        return newarray;
    }
    public static  int noofOccurences(int[] numarray , int num){
        int i=0;
        int occ=0;
        while(i<numarray.length){
            if(numarray[i]==num){
                occ++;
            }
            i++;

        }
        return occ;
    }

}
