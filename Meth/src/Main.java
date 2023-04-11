class MethodOverloading
{
	public int add(int a, int b)
	{
		return a+b;
	}
	public int add(int a, int b, int c)
	{
		return a+b+c;
	}
}
class MethodOverriding extends MethodOverloading{
	@Override 
	public int add(int a,int b, int c)
	{
		return (a+b)*c;
	}
}

public class Main {
	public static void main(String args[])
	{
		MethodOverloading m1 = new MethodOverloading();
		MethodOverriding m2 = new MethodOverriding();
		System.out.println(m1.add(10, 14));
		System.out.println(m1.add(5, 4, 9));
		System.out.println(m2.add(10, 2, 5));
	}

}
