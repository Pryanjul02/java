import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class frequency {
    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(1,2,3,4,5,1,1,1,3,2,4,4,4,4);
        int a =Collections.frequency(list , 1);
        System.out.println(a);
        System.out.println(Collections.frequency(list,4));

    }
}
