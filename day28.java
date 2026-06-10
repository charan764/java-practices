
public class day28 {

    public static void main(String[] args) {
        Address A1=new Address("banglore");
        day28_EMP E1 = new day28_EMP(10, "Crunchy",A1);
        System.out.println(E1);
        A1.city = "chithradurga";
        System.out.println(E1);
        System.out.println();
        day28b D1 = new day28b();
        D1.m1();
    }
}
class day28b{
    int a = 30;
    int b = 40;

    Integer B1 = Integer.valueOf(a);
    Integer B2 = Integer.valueOf(b);

    Integer B3 = a;
    Integer B4 = b;

    int c = B1.intValue();

    int d = B3;
    public void m1(){
        System.out.println(b==B2);
        System.out.println(B2.equals(a));
    }
}
final class day28_EMP
{
    private final int id;
    private final String name;
    private final Address address;

    day28_EMP(int id,String name,Address address) {
        this.id = id;
        this.name = name;
        //deep clone
        Address cloned_address = new Address(address.city);
        this.address = cloned_address;
    }

    @Override
    public String toString() {
        return "day28_EMP{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}

class Address {
    String city;
    public Address(String city){
        this.city=city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }
}
