package test;
import static org.junit.Assert.*;
import org.junit.Test;
import main.SortStr;

public class TestStr {
	@Test
	public void test_str1() {
		assertEquals("[a, b, c, d, e, f]", SortStr.sort_str("fedcba"));
	}
	
	@Test
	public void test_str2() {
		assertEquals("[a, b, c, i, l, m, o, u]", SortStr.sort_str("columbia"));
	}
}
