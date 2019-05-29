import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class ArraysAndStringsTest {
	
	private ArraysAndStrings object;

	@Before
	public void beforeMethod(){
		object = new ArraysAndStrings();
	}
	
	@Test
	public void testIsUnique() {
		Boolean result;
		result = object.isUnique("aba");
		
		Assert.assertEquals(result, false);
		result = object.isUnique("Aba");
		Assert.assertEquals(result, true);
	}
	
	@Test
	public void testIsPermutation() {
		Boolean result;
		result = object.isPermutation("aba", "baa");
		Assert.assertEquals(result, true);
		
		result = object.isPermutation("aabb", "aab");
		Assert.assertEquals(result, false);
	}
	
	

}
