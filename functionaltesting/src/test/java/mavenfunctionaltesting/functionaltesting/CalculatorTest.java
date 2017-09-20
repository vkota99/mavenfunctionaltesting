package mavenfunctionaltesting.functionaltesting;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import mavenfunctionaltesting.functionaltesting.Calculator;
import mavenfunctionaltesting.functionaltesting.ICalculator;


public class CalculatorTest {
	@SuppressWarnings("unused")
	private static ICalculator calculator;
  
  @BeforeMethod
  public void beforeMethod() {
	 
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	  
	  calculator = new Calculator();
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is executed before each Test");
  }
  @Test
	public void Sum() {
		int result = calculator.sum(3, 4);

		assertEquals(7, result);
	}
  @Test
	public void Divison() {
		try {
			int result = calculator.divison(10, 2);

			assertEquals(5, result);
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}
  
  	@Ignore
	@Test
	public void Substraction() {
		int result = 10 - 3;

		assertTrue(result == 7);
	}
  @AfterTest
  public void afterTest() {
	  System.out.println("This is exceuted after each Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
  }

  @AfterSuite
  public void afterSuite() {
  }

}
