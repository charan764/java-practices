import java.util.HashMap;
import java.util.Map;
public class day32 {
    public static void main(String[]args){
        Map<Integer,String> map = new HashMap<>();
        map.put(18,"Virat");
        map.put(46,"Rohith");
        map.put(07,"Dhoni");
        map.put(01,"Rahul");

        System.out.println(map);

        System.out.println(map.put(18,"king kohli"));

        for(Map.Entry<Integer,String> e : map.entrySet()){
            System.out.println(e.getKey()+"  "+ e.getValue());
        }
    }
}
