package aufgabe8_testen;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitBerechnen {
	private static Berechnen berechnen;

	@BeforeClass
	  public static void setUpBeforeClass() throws Exception {
	    System.out.println("**Start**");
		berechnen = new Berechnen();
	  }
	
	@AfterClass
	  public static void tearDownAfterClass() throws Exception {
		System.out.println("**End**");
		JUnitBerechnen.berechnen = null;
	  }
	
	@Test
	public void berechnen(){
		berechnen.berechnen(10, 20, 30);
		assertEquals(berechnen.getResultat(), 6000);
	}
}
