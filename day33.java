import java.util.*;
import java.util.stream.Collectors;

public class day33 {
    public static void main (String[] args){
        List<Integer> l = Arrays.asList(10,20,30,40,50,60,70,80,90);

        List<Integer> l1 = l.stream().filter(x->x>40).collect(Collectors.toList());
        System.out.println(l1);
    }
}
