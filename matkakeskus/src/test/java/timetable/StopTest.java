package timetable;

import static org.junit.Assert.*;

import org.junit.Test;

public class StopTest {

	@Test
	public void testLuokkamuuttujat() {
		// Luodaan pysäkki ilman koordinaatteja
		Stop stop = new Stop("Tori1", "Puijonkatu", "12", "70100");
		assertEquals("Tori1, Puijonkatu 12", stop.getName() + ", " + stop.getStreetName() + " " + stop.getStreetNumber());
		assertEquals(0.0, stop.getLatitude(),0.1);
		assertEquals(0.0, stop.getLongitude(),0.1);
	}

	@Test
	public void testLuokkamuuttujat2() {
		// Luodaan pysäkki kaikilla parametreilla 
		Stop stop2 = new Stop("Tori2", "Tulliportinkatu", "30", "70100", 62.893205, 27.678167);
		assertEquals("Tori2, Tulliportinkatu 30", stop2.getName() + ", " + stop2.getStreetName() + " " + stop2.getStreetNumber());
		assertEquals(62.893205, stop2.getLatitude(), 0.00001);
		assertEquals(27.678167, stop2.getLongitude(), 0.00001);
	}

}
