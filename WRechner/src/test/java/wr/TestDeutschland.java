package wr;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestDeutschland 
{
	Land land;
	@Before
	public void davor()
	{
		land = new Deutschland();
	}
	
	@Test
	public void test()
	{
		assertEquals("Deutschland2", land.getName());
	}
}
