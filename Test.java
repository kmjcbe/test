class Test {
	
	private void Test () {
		Test a1 = new Test();
		a1.display();
	}
	
	private void display() {
		System.out.println("hey im here");
	}
	
	
	public static void main (String args[]) {
		
		Test a = new Test();
		a.display();
		
		System.out.println("testee1");
	}
}
