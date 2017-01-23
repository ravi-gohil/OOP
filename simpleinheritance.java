class emp {
	float salary = 50000;
}

public class simpleinheritance extends emp {
	int bonus = 10000;
	
	public static void main (String args[]){
		simpleinheritance e1 = new simpleinheritance();
		System.out.println("salary"+e1.salary);
		System.out.println("bonus"+e1.bonus);
	}
}