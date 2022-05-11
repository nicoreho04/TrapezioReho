import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RehoNicoloTest_A {

	@Test
	void test() {
		RehoNicoloClass c = new RehoNicoloClass();
		int n = 5;
		int risAtteso = 15;
		int risOttenuto = c.RehoMet(n);
		assertEquals(risAtteso,risOttenuto);
	}
	@Test
	void test1() {
		RehoNicoloClass c = new RehoNicoloClass();
		int n = 6;
		int risAtteso = 21;
		int risOttenuto = c.RehoMet(n);
		assertEquals(risAtteso,risOttenuto);
	}
	@Test
	void test2() {
		RehoNicoloClass c = new RehoNicoloClass();
		int n = 7;
		int risAtteso = 28;
		int risOttenuto = c.RehoMet(n);
		assertEquals(risAtteso,risOttenuto);
	}
}
