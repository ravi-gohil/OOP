
public class copyconst {

	int id;
	String name;
	
	copyconst(int i, String n)
	{
		id = i;
		name = n;
	}
	copyconst(copyconst c)
	{
		id = c.id;
		name = c.name;
	}
	void display()
	{
		System.out.println("Id is "+id+"and name is"+name);
	}
	
	public static void main (String args[])
	{
		copyconst s1=new copyconst(23,"abc"), s2= new copyconst(s1);		
		s1.display();
		s2.display();
	}
	
}
