package _03_IntroToStacks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class _03_TestMatchingBrackets {
	Stack<Integer> bm = new Stack<Integer>();

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS
	// A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		bm.clear();
		for (int uyir = 0; uyir < b.length(); uyir++) {

			if (b.charAt(uyir) == '{') {
				bm.push(uyir);
			} else if (b.charAt(uyir) == '}') {
				if (bm.size() == 0) {
					return false;
				}
				bm.pop();
			}

		}
		if (bm.size() == 0) {
			return true;
		}
		return false;
	}

}