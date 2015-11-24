package aufgabe8_testen;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.Assert;

public class JUnitBerechnen {
	private static Berechnen berechnen;
	private double laenge;
	private double breite;
	private double hoehe;
	private double result;
	
	public void Berechnen(double laenge, double breite, double hoehe) {
		this.laenge = laenge;
		this.breite = breite;
		this.hoehe = hoehe;
	}

	@BeforeClass
	  public static void setUpBeforeClass() throws Exception {
	    JUnitBerechnen.berechnen = new Berechnen();
	  }
	
	@AfterClass
	  public static void tearDownAfterClass() throws Exception {
		JUnitBerechnen.berechnen = null;
	  }


	@Parameters
	  public static Collection<Object[]> values() {
	    return Arrays.asList(new Object[][] {
	     {5.5, 5.5, 5.5, 166.375}, 
	     {5.5, 5.5, 5.5, 160},
	     {5.5, 5.5, 5.5, 165} 
	     });
	  }

	@Test
	public void test() {
		Assert.assertEquals(berechnen.berechnen(laenge, breite, hoehe), result);
	}

}
