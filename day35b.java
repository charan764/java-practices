import java.util.*;
import java.util.stream.Collectors;


public class day35b {
    public static void main(String[] args){
        String S1 = "CrunchyCharan";
        //Convert a string into individual characters and print each character separately.
        S1.chars().mapToObj(c->(char)c).forEach(System.out::println);

        // finding the duplicate characters and countes the String(Count how many times each character appears in the string)
        Map<Character, Long> map = S1.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c,Collectors.counting()));

        System.out.println(map);



    }
}
