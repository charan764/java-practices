import java.io.*;

public class day36 {
    public static void main(String[]args)throws IOException,ClassNotFoundException {
        day36_Emp e1 = new day36_Emp(30,"Charan",30000);
        File f = new File("Crunchy");
        FileOutputStream f1 = new FileOutputStream(f);
        ObjectOutputStream f2 = new ObjectOutputStream(f1);
        f2.writeObject(e1);

        FileInputStream f3 = new FileInputStream(f);
        ObjectInputStream f4 = new ObjectInputStream(f3);

        day36_Emp e2 =(day36_Emp)f4.readObject();

        System.out.println(e2);
        System.out.println(e1==e2);
    }
}
class day36_Emp implements Serializable{
    int id;
    transient String name;
    int salary;

    public day36_Emp(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "day36_Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
