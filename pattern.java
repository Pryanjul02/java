import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number of rows ");
        int rows=input.nextInt();
        lefthalfpyramid(rows);
        reversepyramid(rows);
        righthalfpyramid(rows);


    }
    public static void lefthalfpyramid(int maxRows)//revisit ...
    {
        int rows=maxRows;
        while(rows>0){
            //spaces
            int j=0;
            while(j<rows-1){
                System.out.print(" ");
                j++;

            }
            //stars
            int i=0;
            while(i<= (maxRows-rows)){
                System.out.print("* ");
                i++;

            }
            System.out.println();
            rows--;}
    }
    public static void reversepyramid(int maxrows){
        System.out.println("reverse half pyramid");
        int rows=maxrows;
        while(rows>0){
            int i=0;
            while(i<rows){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }

    }
    public static void righthalfpyramid(int maxrows){
        System.out.println("right half pyramid ");
        int rows=0;
        while(rows < maxrows){
            System.out.print("*");
            int i=0;
            while(i<rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;

        }
    }



}

