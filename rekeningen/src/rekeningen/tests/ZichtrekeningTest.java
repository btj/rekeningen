package rekeningen.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import rekeningen.Zichtrekening;

class ZichtrekeningTest {

	@Test
	void test() {
		Zichtrekening mijnZichtrekening = new Zichtrekening(1000);
		assertEquals(1000, mijnZichtrekening.getKredietlimiet());
		mijnZichtrekening.stort(500);
		assertEquals(500, mijnZichtrekening.getBalans());
		assertEquals(1000, mijnZichtrekening.neemAf(1000));
		assertEquals(-500, mijnZichtrekening.getBalans());
		assertEquals(500, mijnZichtrekening.neemAf(1000));
		assertEquals(-1000, mijnZichtrekening.getBalans());
	}

}
