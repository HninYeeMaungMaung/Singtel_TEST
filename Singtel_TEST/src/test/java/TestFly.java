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
		Butterfly butterfly = new Butterfly();
		butterfly.fly();
		assertEquals("I am flying", outContent.toString());
	}

	// D.1.b
	@Test(expected = UnsupportedOperationException.class)
	public void testButterFlySing() {
		Butterfly butterfly = new Butterfly();
		butterfly.sing();
	}
}
