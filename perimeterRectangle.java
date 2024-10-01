import java.util.Scanner;
public class perimeterRectangle {

        public static void main(String[] args) {
            Scanner input = new Scanner (System.in);
            System.out.println("enter the length of a rectangle:");
            int length = input.nextInt();
            System.out.println("enter the breadth of a rectangle");
            int breadth = input.nextInt();
            int perimeter= 2*(length+breadth);
            System.out.println("perimeter of a rectangle= " + perimeter );


        }
}
