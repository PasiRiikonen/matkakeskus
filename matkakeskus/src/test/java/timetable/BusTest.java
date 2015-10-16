package timetable;

import static org.junit.Assert.*;

import org.junit.Test;

public class BusTest {

	@Test
	public void testLuokkamuuttujat() {
		//fail("Not yet implemented");
		// Bus(String plateNumber, String brand, String model, int seatCount)
		Bus bus = new Bus("ABC-111", "Volvo","V35", 52);
		assertEquals("ABC-111", bus.getPlateNumber());
		assertEquals("Volvo", bus.getBrand());
		assertEquals("V35", bus.getModel());
		assertEquals(52, bus.getSeatCount());
	    //Tyhjä merkkijono rekisterinumerossa
		bus.setPlateNumber("");
	    assertEquals("", bus.getPlateNumber());
	}
	
	@Test
	public void testLuokkamuuttujatNull() {
		//fail("Not yet implemented");
		// Bus(String plateNumber, String brand, String model, int seatCount)
		Bus bus = new Bus();
		assertNull(bus.getBrand());
		assertNull(bus.getModel());
		assertNull(bus.getPlateNumber());
		assertEquals(0, bus.getSeatCount());
		
	}	

}
