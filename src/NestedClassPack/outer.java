package NestedClassPack;

public class outer {	
	
	void m1(){
		System.out.println("outer class - m1 method executed");		
	}
	
	class inner {
				
		void m2(){
			System.out.println("inner class - m2 method executed");		
		}
	}
	
	
	public static void main(String[] args) {
		
		outer obj1 = new outer();
		obj1.m1();
		
		outer.inner obj2 = obj1. new inner();
		obj2.m2();
		
		outer.inner obj3 = new outer(). new inner();
		obj3.m2();		
	}
}
