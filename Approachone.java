package com.si.approachone;

public class Approachone {
	int a =10;
	static int b=20;
	void display()
	{
		System.out.println("hello");
	}
	static String show()
	{
		return "how are u?";	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=30;
		Approachone a1 = new Approachone();
		System.out.println(a1.a);
		System.out.println(Approachone.b);
		Approachone.show();
		System.out.println(c);
		a1.display();
	}

}
