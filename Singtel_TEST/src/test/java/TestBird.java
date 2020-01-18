import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import com.main.bird.Bird;

public class TestBird {
	// QA.1
	@Test
	public void testBirdSing() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Bird bird = new Bird();
		bird.sing();
		assertEquals("I am singing", outContent.toString());
	}

	// QA.1
	@Test
	public void testBirdFly() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Bird bird = new Bird();
		bird.fly();
		assertEquals("I am flying", outContent.toString());
	}
}
