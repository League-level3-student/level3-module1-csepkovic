package _03_IntroToStacks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class _03_TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS A MATCHING CLOSING BRACKET
	Stack<Character> brackets = new Stack<Character>();
	private boolean doBracketsMatch(String b) {
		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) == '{') {
				brackets.add('{');
			} else if (b.charAt(i) == '}') {
				brackets.pop();
			}
		}
		if (brackets.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

}