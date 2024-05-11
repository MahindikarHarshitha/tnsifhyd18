package com.si.overload;

// Method overloading also known as compile time polymorphism is one of the type in polymorphism(one in many forms)type

public class Methodoverload {
	static int add(int a , int b) //same method name with 2 parameters
	{
		return a+b;
	}
	void add(int a , int b ,int c)//same method name with 3 parameters
	{
	    System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Methodoverload m1 = new Methodoverload();
System.out.println(add(1,2));
m1.add(1, 2, 3);
	}

}
