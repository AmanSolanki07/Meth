public class Constructor
{
	String name;
	int empid;
	String add;
	static String Companyname = "SDAC infotech";
	public Constructor(String name, int empid, String add) {
		super();
		this.name = name;
		this.empid = empid;
		this.add = add;
	}
	@Override
	public String toString() {
		return "Constructor [name=" + name + ", empid=" + empid + ", add=" + add + "]";
	}
	public static void main(String[] args)
	{
		Constructor c = new Constructor("Aman",1201,"Mira Road(E)");
		System.out.println("Program on working of Constructors");
		System.out.println(c+" "+"Comnany name is "+Constructor.Companyname);
	}
	
	
}