public class Ex702 {
	
	static void staticMethod() {
		System.out.println("call static method");
	}
	
	public void instanceMethod() {
		System.out.println("call instance method");
	}
	
	public static void main(String[] args) {
		int y;
		
		staticMethod();
		//instanceMethod();
		
		Ex702 x = new Ex702();
		x.instanceMethod();
	}

}
