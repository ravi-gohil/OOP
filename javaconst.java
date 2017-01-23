
public class javaconst {
	int id;
	String name;
	
	javaconst(int i, String n)
	{
		id = i;
		name = n;
	}
	
	void display()
	{
		System.out.println("ID is "+id+"and name is "+name);
	}
	
	public static void main (String args[])
	{
		javaconst j1 = new javaconst(1,"aaa"), j2 =new javaconst(2,"bbb");
		j1.display();
		j2.display();
	}

}
