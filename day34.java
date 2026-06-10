import java.util.*;


public class day34 {
    public static void main(String[] args) {
        int[] arr = {20, 40, 70, 10, 50, 30, 60};
        int[] arr1 = Arrays.stream(arr).toArray();
        System.out.println("Array:");
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = Arrays.stream(arr).sorted().toArray();

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr2));

        Map<day34_Emp, String> map = new HashMap<>();
        map.put(new day34_Emp(30, "Crunchy", 20000), "Cricket player");
        map.put(new day34_Emp(20, "Charan", 40000), "volleyball player");
        map.put(new day34_Emp(50, "Teja", 30000), "Kabbadi player");
        map.put(new day34_Emp(40, "Ganesh", 55000), "Football");

        System.out.println("Sorted By salary:");

        //sorting m2 based on salary
        map.entrySet().stream().sorted(Map.Entry.comparingByKey((e1, e2) -> e1.salary - e2.salary)).forEach(System.out::println);
    }
}
class day34_Emp{

    int id;
    String name;
    int salary;

    public day34_Emp(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "day_34EMP{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
