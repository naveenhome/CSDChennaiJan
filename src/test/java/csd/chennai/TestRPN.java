package csd.chennai;

import junit.framework.TestCase;

public class TestRPN extends TestCase{
	
	public void testCase1()
	{
		RPNOperation obj = new RPNOperation();
		assertEquals(5, obj.calculate("2,3,+"));
	}
	public void testCase2()
	{
		RPNOperation obj = new RPNOperation();
		assertEquals(15, obj.calculate("12,3,+"));
	}
	public void testCase3()
	{
		RPNOperation obj = new RPNOperation();
		assertEquals(17, obj.calculate("12,3,+,2,+"));
	}

}
