
public class overloading {
	
		void sum(int a,int b)
		{
			System.out.println(a+b);
		}
		void sum(int a, int b, int c)
		{
			System.out.println(a+b+c);
		}
		
		public static void main (String args[])
		{
			overloading obj= new overloading();
			obj.sum(10, 20);
			obj.sum(10, 50, 10);
		}
	}
