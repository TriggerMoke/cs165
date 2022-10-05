import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TestCases {

	//Switch which line is commented out in order to test the correct vs broken code
	TestingFunctions functions = new BlackBoxCorrect();
	//TestingFunctions functions = new BlackBoxIncorrect();
	
	/**
	 * This is a simple validity check for the method greatestCommonDivisor. Checks that the method
	 * returns the correct result for a known GCD problem gcd(2,4) = 2
	 */
	@Test
	public void testGCD() {
		assertEquals("Error: should return 2", 2, functions.greatestCommonDivisor(2, 4));
	}
	@Test
	public void testGCDZero(){
		assertEquals("Error: should return 7", 7, functions.greatestCommonDivisor(0, 7));
	}
	@Test
	public void testGCDNegativeA(){
		assertEquals("Error: shoud return -1", -1, functions.greatestCommonDivisor(-1, 6));
	}
	@Test
	public void testGCDNegativeB(){
		assertEquals("Error: shoud return -1", -1, functions.greatestCommonDivisor(-1, 6));
	}
	
	/**
	 * This is a simple check of the reverseWindow method. Checks if the method will reverse the entire contents
	 * of the passed array correctly.
	 */
	/**
	 * This method reverses the subsection of the passed array defined by index1 
	 * and index2. index2 is non-inclusive and will not be swapped with index1. If
	 * index1 > index2 then the two indexes will be swapped before they are checked
	 * for validity.
	 * @param arr - the array to reverse
	 * @param index1 - the first index of the subsection
	 * @param index2 - the non-inclusive upper bound of the subsection, 
	 * last element swapped will be at the index (index2 - 1)
	 * @throws IndexOutOfBoundsException if index1 or (index2-1) are not valid indexes of arr
	 */
	@Test
	public void testReverseWindow() {
		int[] arr = {0,1,2,3,4};
		int[] expected = {4,3,2,1,0};
		functions.reverseWindow(arr, 0, 5);
		assertArrayEquals("Error", expected, arr);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void IndexOutOfBounds() {
		int[] arr = {0,1,2,3,4};
		int[] expected = {4,3,2,1,0};
		functions.reverseWindow(arr, -3, 5);
		assertArrayEquals("Error", expected, arr);
	}

	

	//For completion, write additonal tests as described in the lab documentation.
}
