import java.util.Scanner;
public class password {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String password;

        do{
            System.out.print(" please enter a valid pasword: ");
            password = input.next();
        }while(!passwordchecker(password));

    }


    public static boolean passwordchecker(String password){

        return password.length() > 6;
    }


}
