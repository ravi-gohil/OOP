class bike {
	void run()
	{
		System.out.println("bike is running");
	}
}
public class runtimepolymorphism extends bike{

	void run()
	{
		System.out.println("My bike is running");
	}
	public static void main (String args[]){
		bike b = new runtimepolymorphism();
		b.run();
	}
}
