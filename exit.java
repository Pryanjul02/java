import java.util.Scanner;
public class exit {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);



        while(true){
            System.out.println("enter your command: ");
            String command = input.next();
            if(command.equalsIgnoreCase("exit")){
                break;
            }
        }

        System.out.println("sucessfully you exited ");

    }
}


