package NestedClassPack;

public class outer1 {
	
	void m1(){
		System.out.println("outer1 class - m1 method executed");		
	}
	
	public static class inner1 {
				
		void m2(){
			System.out.println("inner1 class - m2 method executed");		
		}
	}
	
	public static void main(String[] args) {
		
		outer1 obj1 = new outer1();
		obj1.m1();
		
		outer1.inner1 obj2 = new outer1.inner1();
		obj2.m2();		
		
		new outer1.inner1().m2();	
	}

}
