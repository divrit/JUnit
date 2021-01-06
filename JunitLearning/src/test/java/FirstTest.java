import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FirstTest {
	First F=new First();

	@BeforeClass
	public static  void before()
	{
		System.out.println("main hun beforeClass ");
	}
	
	@AfterClass
	public static void after()	{
		System.out.println("main hun Afterclass ");
	}
	
	
	@Test
	public void test() {
//		fail("Not yet implemented");
		assertEquals("Divvaa",F.TruncateFirst2A("Divvaaa"));
	}

	@Test
	public void test2() {
		
		assertEquals("LOL", F.TruncateFirst2A("LOL"));
	}
	
	@Test
	public void test3() {
		
		assertTrue("test failed yaar",F.First2andLast2("ABABA"));
		
	}
}
