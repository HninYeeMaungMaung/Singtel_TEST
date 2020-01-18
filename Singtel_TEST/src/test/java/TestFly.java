import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import com.main.fly.Butterfly;

public class TestFly {
	// D.1.a
	@Test
	public void testButterFly() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Butterfly butterfly = new Butterfly("adult");
		butterfly.fly();
		assertEquals("I am flying", outContent.toString());
	}

	// D.1.b
	@Test(expected = UnsupportedOperationException.class)
	public void testButterFlySing() {
		Butterfly butterfly = new Butterfly();
		butterfly.sing();
	}


	// D.2.a
	@Test(expected = UnsupportedOperationException.class)
	public void testCaterpillarFly() {
		Butterfly caterpillar = new Butterfly("immature");
		caterpillar.fly();
	}

	// D.2.b
	@Test
	public void testCaterpillarWalk() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Butterfly caterpillar = new Butterfly();
		caterpillar.walk();
		assertEquals("I am walking", outContent.toString());
	}
}
