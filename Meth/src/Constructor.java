
public class Constructor {
	String name; 
	int roll_no;
	float percentage;
	String div;
	
	
public Constructor(String name, int roll_no, float percentage, String div) {
		super();
		this.name = name;
		this.roll_no = roll_no;
		this.percentage = percentage;
		this.div = div;
	}

@Override
	public String toString() {
		return "Constructor [name=" + name + ", roll_no=" + roll_no + ", percentage=" + percentage + "]";
	}

public void display(String name, int roll_no, float percentage,String div)	
{
	System.out.println("Name = "+name);
	System.out.println("Roll Number = "+roll_no);
	System.out.println("Percentage = "+percentage);
	System.out.println("Division = "+div);
}
public static void main(String args[])
{
	Constructor c = new Constructor("Aman",1201,80,"B");
	c.display();
	System.out.println(c);
}

}
