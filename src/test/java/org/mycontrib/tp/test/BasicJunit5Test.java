package org.mycontrib.tp.test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mycontrib.tp.app.MyApp;

public class BasicJunit5Test {
	
	private MyApp myApp;
	
	@BeforeEach
	public void init() {
		myApp=new MyApp();
	}
	
	@Test
	public void testAdd() {
		int resAdd=myApp.add(5,6);
		Assertions.assertTrue(resAdd==11);
		System.out.println("test ok , 5+6="+resAdd);//logger.trace() is better
	}

}
