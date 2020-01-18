import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import com.main.bird.Bird;
import com.main.bird.Chicken;
import com.main.bird.Duck;

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

	// QA.2
	@Test
	public void testDuckSing() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Duck duck = new Duck();
		duck.sing();
		assertEquals("Quack, quack", outContent.toString());
	}

	// QA.2
	@Test
	public void testDuckSwim() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Duck duck = new Duck();
		duck.swim();
		assertEquals("I am swiming", outContent.toString());
	}

	// QA.2
	@Test
	public void testChickenSing() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Chicken chicken = new Chicken();
		chicken.sing();
		assertEquals("Cluck, cluck", outContent.toString());
	}

	// QA.2
	@Test(expected = UnsupportedOperationException.class)
	public void testChickenFly() {
		Chicken chicken = new Chicken();
		chicken.fly();
	}
}
