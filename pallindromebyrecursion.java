import java.util.Scanner;
public class pallindromebyrecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your string to be checked: ");
        String str=input.next();

        System.out.println("Your given string is " +
                (ispallindrome(str)
                        ?"pallindrome"
                        :"not pallindrome"));



    }



    public static boolean ispallindrome(String str){
        if(str.length()<=1){
            return true;

        }
        int lastposition=str.length()-1;
        if(str.charAt(0)!=str.charAt(lastposition)){
            return false;
        }

        String newstr=str.substring(1, lastposition);//beginindex(1) is included and lastposition is excluded.

        return ispallindrome(newstr);

    }

}
