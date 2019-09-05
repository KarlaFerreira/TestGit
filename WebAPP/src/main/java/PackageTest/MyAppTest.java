package PackageTest;

import static org.junit.Assert.*;

import org.junit.Test;



public class MyAppTest  {

	
	

	
	@Test
	public void testElevadoo() {
		assertEquals(0.81,classes.MyApp.elevado(9.0,8.0),0.01);
	}

}
