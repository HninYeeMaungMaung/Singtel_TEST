import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import com.main.fish.Fish;

public class TestFish {
	// QB.1
	@Test
	public void testFishSwim() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Fish fish = new Fish();
		fish.swim();
		assertEquals("I am swiming", outContent.toString());
	}

	// QB.1
	@Test(expected = UnsupportedOperationException.class)
	public void testFishSing() {
		Fish fish = new Fish();
		fish.sing();
	}

	// QB.1
	@Test(expected = UnsupportedOperationException.class)
	public void testFishWalk() {
		Fish fish = new Fish();
		fish.walk();
	}
}
