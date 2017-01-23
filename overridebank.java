class bank {
	int getRateOfInterest(){ return 0;}
}
class SBI extends bank {
	int getRateOfInterst(){ return 8;}
}
class HDFC extends bank {
	int getRateOfInterst(){ return 9;}
}
class AXIS extends bank {
	int getRateOfInterst(){ return 10;}
}
class overridebank {
	public static void main (String args[]){
		SBI s = new SBI();
		HDFC h = new HDFC();
		AXIS a = new AXIS();
		System.out.println("Interest Rate of SBI is :"+ s.getRateOfInterst());
		System.out.println("Interest Rate of HDFC is :"+ h.getRateOfInterst());
		System.out.println("Interest Rate of AXIS is :"+ a.getRateOfInterst());
	}
}
