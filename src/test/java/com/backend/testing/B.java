package com.backend.testing;

public class B {
	
	
	public static B a() {
		System.out.println("Execute mtd a");
		
		return new B();
	}
	
	
	public static B b() {
		System.out.println("Execute mtd b");
		
		return new B();
	}
	
	
	public static  C c() {
		System.out.println("Execute mtd c");
		
		return new C();
	}

	
//	public B b() {
//		System.out.println("Execute mtd b");
//		
//		return this;
//	}

}
