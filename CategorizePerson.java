import java.util.Scanner;
public class CategorizePerson{


        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter your Age ");
            int age= input.nextInt();
            if(age<13){
                System.out.println("you are a children.");
            }
            else if(age<20){
                System.out.println("you are a teenager.");

            }
            else if(age<60){
                System.out.println("your a adult");

            }
            else{
                System.out.println("you are a senior citizen");
            }
        }



}
