import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class comparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Lion", "Ant", "Elephant", "Rabbit", "Bear");
        System.out.println(list);
        decreasing(list);
        System.out.println(list);
    }
    public static void decreasing(List<String> list){
        Collections.sort(list , new java.util.Comparator<String>(){

            @Override
            public int compare(String s, String t) {
                if(s.equals(t)){
                    return 0 ;
                }
                else if (s.charAt(0)<t.charAt(0)){
                    return 1;
                }
                else{
                    return -1;
                }
            }

        });
    }
    }