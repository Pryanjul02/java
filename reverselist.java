import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverselist {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
        System.out.println(list);
        Collections.reverse( list);
        System.out.println(list);
        for(int i =0 ; i<list.size()/2;i++){
            ArraySwap.swap(list,i,list.size()-i-1);
        }
        System.out.println(list);
    }


}
