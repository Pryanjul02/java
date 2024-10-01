import java.util.Scanner;
public class varargs{
    public static void main(String[] args) {
        System.out.println(concatenate("Pryanjul","Kulshrestha","!!!"," is","happy"," !!!"));
    }

    public static String concatenate(String...  str){
        StringBuilder sb = new StringBuilder();

        for(String strs : str) {
            sb.append(strs).append(" ");



        }
        return sb.toString();
    }
}
