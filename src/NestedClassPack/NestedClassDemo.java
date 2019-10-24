package NestedClassPack;

public class NestedClassDemo {
	
	public static void main(String[] args) {
		
		outer obj1 = new outer();
		obj1.m1();
		
		outer.inner obj2 = obj1. new inner();
		obj2.m2();
		
		outer.inner obj3 = new outer(). new inner();
		obj3.m2();		
		
		
	}
	

}
