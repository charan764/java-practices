import java.util.Scanner;

class Prime

{

public static void main(String args[])

{

methods m = new methods();

Scanner sc = new Scanner(System.in);

System.out.println("Enter a number");

int n = sc.nextInt();

boolean res = m.C1(n);

m.C2(res);

}

}

class methods

{

public boolean C1(int n)

{

if(n<=1)

return false;

for(int i=2;i<n;i++)

{

if(n%i==0)

return false;

}

return true;

}

public void C2(boolean res)

{

if(res){

System.out.println("Prime Number");
}
else
{
System.out.println("Not a Prime Number");
}
}

}