import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class RehoNicoloTest_B {
	RehoNicoloClass c;
	@Before
	void before() {
		 c = new RehoNicoloClass();
	}

	@Test
	void test() {
		int n = 5;
		int risAtteso = 15;
		int risOttenuto = c.RehoMet(n);
		assertEquals(risAtteso,risOttenuto);
	}
	@Test
	void test1() {
		int n = 6;
		int risAtteso = 21;
		int risOttenuto = c.RehoMet(n);
		assertEquals(risAtteso,risOttenuto);
	}
	@Test
	void test2() {
		int n = 7;
		int risAtteso = 28;
		int risOttenuto = c.RehoMet(n);
		assertEquals(risAtteso,risOttenuto);
	}
}