package codewars.test1;

import org.apache.commons.lang3.StringUtils;

public class BraceChecker {

  public boolean isValid(String input) {
    if (input == null || input.isEmpty() || input.length() % 2 == 0
        || !StringUtils.containsOnly(input, "[](){}"))
      return false;

    
    return true;
  }

}
