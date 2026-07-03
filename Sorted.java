import java.util.Arrays;

class Sorted{
	public static void main(String args[]){
		methods m =new methods();
		int a[]={90,80,70,60,50,40,20,30,10};
		m.C1(a);
		m.C2(a);

		}
}
class methods{
	public void C1(int a[]){
	Arrays.sort(a);
	}
	
	public void C2(int a[]){

	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+" ");
	}
	}
}	
