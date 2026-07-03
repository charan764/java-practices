import java.util.Scanner;
class Factorial{
	public static void main(String[] args){

		Methods m = new Methods();
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = Sc.nextInt();
		int fact = m.C1(n);
		m.C2(fact);
		}
}
class Methods{
	public int C1(int n){
	int fact =1;
	for(int i=1;i<=n;i++){

	fact = fact*i;
	}
	return fact;
	}
	public void C2(int fact)
	{
	System.out.println("Factorial ="+ fact);
	}
}

 

