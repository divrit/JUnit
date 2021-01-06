import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class SortArrayTest {

	SortArray sa=new SortArray();
	private int[] excepted;
	private int[] actual;
	
	

	public SortArrayTest(int[] excepted, int[] actual) {
		
		this.excepted = excepted;
		this.actual = actual;
	}
	
	@Parameters
	public static Collection testConditions() {
		
//		int a[][]= {{3, 3, 4, 5, 12},{3, 3, 4, 5, 12}};
//		int a[][]= {
//				{2,2,2}, {2,2,2}
//				
//		};
		
		
//		Integer[][] a={
//	            {{1,1}, {2,2}}
//
//		
//	};
//		return Arrays.asList(a);
		return Arrays.asList(new int[][][] {
            {{1,1,1}, {1,1,1}},
            {{1,1,1}, {1,1,1}}
        });
	
	}

//		@Test(expected = NullPointerException.class)
	@Test
	public void test() {
	  
		assertArrayEquals(excepted,actual );
	}
	
//	@Test(timeout=10)
//	public void test2() {
//		
//		sa.test2();
//		
//		
//	}

}
