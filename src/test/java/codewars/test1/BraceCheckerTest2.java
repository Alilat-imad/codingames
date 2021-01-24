package codewars.test1;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

class BraceCheckerTest2 {

  private BraceChecker checker = new BraceChecker();
  private String input = "()[]";

  @Test
  void testInputIsNotNull() {
    assertNotNull(input);
  }

  @Test
  void testInputIsNotEmpty() {
    assertTrue(!input.isEmpty());
  }


  @Test
  void testInptutIsNotImpair() {
    assertTrue(input.length() % 2 == 0);
  }

  @Test
  void testInputIsOnlyBraces() {
    assertTrue(StringUtils.containsOnly(input, "[](){}"));
  }



}
