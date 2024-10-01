 import java.util.Scanner;
class temperatures {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your temperature in farehenite ");
        float f= input.nextFloat();
        double celsius = (f-32)*5/9;
        System.out.println("your temperature in celsius " + celsius);
    }
}
