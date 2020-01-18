import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import com.main.fish.Clownfish;
import com.main.fish.Fish;
import com.main.fish.Shark;

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

	// QB.2
	@Test
	public void testShark() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Shark shark = new Shark();
		shark.getHabit();
		assertEquals("I like to eat other fish", outContent.toString());

		outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		shark.getColor();
		assertEquals("My color is grey", outContent.toString());

		outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		shark.getSize();
		assertEquals("I am so big", outContent.toString());
	}

	// QB.2
	@Test
	public void testClownfish() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		Clownfish clownfish = new Clownfish();
		clownfish.getHabit();
		assertEquals("I like to make jokes", outContent.toString());

		outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		clownfish.getColor();
		assertEquals("My color is orange", outContent.toString());

		outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		clownfish.getSize();
		assertEquals("I am so small", outContent.toString());
	}
		
}
