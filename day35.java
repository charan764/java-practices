import java.util.*;
import java.util.stream.Collectors;

public class day35 {
    public static void main(String[] args){
        List<day35_Emp> empList = Arrays.asList(
                new day35_Emp(50,"Crunchy",30000),
                new day35_Emp(40,"Spike",20000),
                new day35_Emp(70,"Bokuto",30000),
                new day35_Emp(60,"Voleyball",20000));

        empList.stream().collect(Collectors.groupingBy(emp->emp.getSalary())).entrySet().stream().forEach(System.out::println);
    }
}
    class day35_Emp{
        int id;
        String name;
        int salary;
        public day35_Emp(int id,String name,int salary){
            this.id=id;
            this.name=name;
            this.salary=salary;
        }
        public int getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "day35_Emp{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }


