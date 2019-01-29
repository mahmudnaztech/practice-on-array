package mmfq.mmfq;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class maxMinFqTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		maxMinFq a=new maxMinFq();
		int array1[]= {5,6,2,1};
		int[] array=new int[4];
		array=a.mmfq();
		assertArrayEquals(array,array1 );
	}

}
