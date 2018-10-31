package uk.ac.uos.hwpoli;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TheclassTest {

	@Test
	void testTheclass() {
		fail("Not yet implemented");
	}

	@Test
	void testDescribe() {
		Theiterface o = new Theclass();
		assertEquals("\"hey I got something\"", o.describe());
	}

}
