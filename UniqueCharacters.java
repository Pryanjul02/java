import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacters {
    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your string : ");
        String uniquestr=input.next();

        for( char ch:uniquestr.toCharArray()){
            unique.add(ch);
        }
        System.out.printf("unique characters = %d" , unique.size());

    }
}
