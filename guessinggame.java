import java.util.Scanner;
class guessinggame{

    int random;

    guessinggame(){
        random=(int) Math.ceil(Math.random()*100);
    }

    int guess(int guessnumber){
        return guessnumber-random;
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        guessinggame game = new guessinggame();
        int guess;
        int result;
        do{
            System.out.println("Enter your no. ");
            guess = input.nextInt();
            result = game.guess(guess);
            if(result==0){
                System.out.println("congrats!!!! you sucessfully guess the number. ");
            }
            else if(result<0){
                System.out.println("please guess some higher values:");
            }

            else{
                System.out.println("please guess some lower value: ");
            }
        }while(result!=0);

    }

}