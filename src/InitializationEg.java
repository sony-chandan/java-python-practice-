public class InitializationEg {
	
	static int count;
	
	int i;
	
	static {
		System.out.println("Static block initialization");
		System.out.println("Count when Static Initializer is run is " + count);
		
	}
	
	{
		System.out.println("Instance Initialization");
		i = 2;
		count +=1;
		System.out.println("count with Instance Initialization is run " + count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InitializationEg eg = new InitializationEg();
		InitializationEg eg1 = new InitializationEg();
	}
	
}
