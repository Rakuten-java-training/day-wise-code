import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestArrayList {
	@Test
	public void testAdd() {
		List<String> list = new ArrayList<>();
		boolean result = list.add("Ram");
		assertTrue(result);
		assertEquals(1, list.size());
	}
	
	public void testRemove() {
		List<String> list = new ArrayList<>();
		list.add("Ram");
		String result = list.remove(0);
		assertEquals("Ram", result);
		assertEquals(0, list.size());
	}
	@Test(expected = IndexOutOfBoundsException.class)
	public void testRemoveFromBlank() {
		List<String> list = new ArrayList<>();
		String result = list.remove(0);
		assertEquals("Ram", result);
		assertEquals(0, list.size());
	}
}
