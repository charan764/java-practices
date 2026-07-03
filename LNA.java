import java.util.Scanner;
class Largest{
	public static void main(String[]args){
		Method m = new Method();
		int a[]={10,20,40,30,50};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int max= m.C1(a);
		m.C2(max);		
		}
}
class Method{
	public int C1(int a[]){
	int max = a[0];
	for(int i=1;i<a.length;i++){
	
	if(a[i]<max){
	
	max=a[i];
	}
	}
	return max;
	}
	
	public void C2(int max)
	{
	System.out.println("largest number=" +max);
	}
}