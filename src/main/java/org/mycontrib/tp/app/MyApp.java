package org.mycontrib.tp.app;

public class MyApp {
	
	public int add(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		MyApp myApp = new MyApp();
		int resAdd=myApp.add(5,6);
		System.out.println("ok , 5+6="+resAdd);
	}

}
