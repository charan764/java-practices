import java.util.Scanner;
class Fibonacci{
public static void main(String args[])
	{

	methods m = new methods();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter limit");
	int n = sc.nextInt();
	m.C1(n);

	}

}
class methods{

	public void C1(int n){
	int a = 0, b = 1, c;
	System.out.print(a + " " + b + " ");
	for(int i = 3; i <= n; i++)

	{
	c = a + b;
	System.out.print(c + " ");
	a = b;
	b = c;

	}
}

}