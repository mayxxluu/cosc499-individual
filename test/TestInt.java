package test;

import static org.junit.Assert.*;
import org.junit.Test;
import main.SortInt;

public class TestInt {
	@Test
	public void test_int1() {
		assertEquals("[2, 2, 3, 5, 6, 7, 9]", SortInt.sort_int("2756239"));
	}
	
	@Test
	public void test_int2() {
		assertEquals("[3, 3, 4, 5, 7, 8, 9]", SortInt.sort_int("5837439"));
	}
}