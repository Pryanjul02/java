import java.util.Arrays;
import java.util.List;

public class ArraySwap {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(list);
        swap(list,2,7);
        System.out.println(list);


    }


    public static void swap(List<Integer> list , int x,int y){
        int swap = list.get(x);//store the value of xth index in swap
        list.set(x,list.get(y));//store the value of yth index on the place of xth index
        list.set(y,swap);//now,yth index gets empty so fill it by value stored in swap

    }
}
