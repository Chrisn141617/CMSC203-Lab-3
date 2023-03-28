import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author chris
 *
 */
class GradeBookTest {
	
	private GradeBook Gb1;
	private GradeBook Gb2;
/**
 * 
 * @throws Exception
 */
	@BeforeEach
	void setUp() throws Exception {
		Gb1 = new GradeBook(5);
		Gb2 = new GradeBook(5);
		
		Gb1.addScore(60);
		Gb1.addScore(100);
		Gb1.addScore(34);
		Gb1.addScore(96);
		Gb1.addScore(67);
		
		Gb2.addScore(75);
		Gb2.addScore(99);
		Gb2.addScore(70);
		Gb2.addScore(26);
		Gb2.addScore(23);
		
		
	}

	@AfterEach
	void tearDown() throws Exception {
		Gb1 = null;
		Gb2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(Gb1.toString().equals("60.0 100.0 34.0 96.0 67.0 "));
		assertTrue(Gb2.toString().equals("75.0 99.0 70.0 26.0 23.0 "));
	}

	@Test
	void testSum() {
		assertEquals(357, Gb1.sum(), .0001);
		assertEquals(293, Gb2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(34, Gb1.minimum(), .001);
		assertEquals(23, Gb2.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(323, Gb1.finalScore(), 0.01);
		assertEquals(270, Gb2.finalScore(), 0.01);
	}

}
