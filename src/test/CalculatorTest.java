package test;

import main.Calculator;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.Assert;

public class CalculatorTest {
	
	private Calculator classUnderTest;
	
	@BeforeClass
	public static void beforeClassExample() {
		System.out.println("Wykona sie raz przez wszystkimi testami");
	}
	
	@AfterClass
	public static void afterClassExample() {
		System.out.println("Wykona sie raz przez wszystkimi testami");
	}
	
	@Before
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new Calculator();
	}
		
	@After
	public void tearDown() {
		System.out.println("Metoda zostanie wykonana po kazdym tescie");
	}
	
	@Test
	public void test1() throws Exception {
		System.out.println("Metoda testowa");
	}
	
	@Test
	public void test2() throws Exception {
		System.out.println("Metoda testowa");
	}
	
	@Test
	public void testSum() throws Exception {
		double z1 = 1.9;
		double z2 = 1.5;
		
		double wynik = classUnderTest.sum(z1, z2);
		
		Assert.assertEquals(3.4, wynik, 0.1);
	}
	
	@Test
	public void testSubtract() throws Exception {
		double z1 = 1.9;
		double z2 = 1.5;
		
		double wynik = classUnderTest.subtract(z1, z2);
		
		Assert.assertEquals(0.4, wynik, 0.1);
	}
	
	@Test
	public void testMultiply() throws Exception {
		double z1 = 2.0;
		double z2 = 1.5;
		
		double wynik = classUnderTest.multiply(z1, z2);
		
		Assert.assertEquals(3.0, wynik, 0.1);
	}
	
	@Test
	public void testDivide() throws Exception {
		double z1 = 10.0;
		double z2 = 2.0;
		
		double wynik = classUnderTest.divide(z1, z2);
		
		Assert.assertEquals(5.0, wynik, 0.1);
		
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testDivideZero() throws Exception {
		double z1 = 10.0;
		double z2 = 0;
		
		double wynik = classUnderTest.divide(z1, z2);
		
		//Assert.assertEquals(0, wynik, 0.1);
	}
}
