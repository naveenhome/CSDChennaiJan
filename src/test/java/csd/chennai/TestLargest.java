package csd.chennai;

import junit.framework.TestCase;

public class TestLargest extends TestCase{
	
	public void testCase1() throws Exception
	{
		int arr[]= {5,8,9,4,3};
		Largest obj = new Largest();
		assertEquals(9, obj.find(arr));
	}
	public void testCase2() throws Exception
	{
		int arr[]= {5,8,6,4,3};
		Largest obj = new Largest();
		assertEquals(8, obj.find(arr));
	}

	public void testCase3()throws Exception
	{
		try
		{
		int arr[]= {};
		Largest obj = new Largest();
		int result =obj.find(arr);
		fail();
		}catch(Exception ex)
		{
			assertEquals("Empty",ex.getMessage());
		}
		
	}
}
