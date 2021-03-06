
package dj.string;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;


public class StringUtilityTest
{

  @Test
  public void testContainsUniqueCharacter ()
  {
    StringUtility utility = new StringUtility ();
    assertTrue (utility.containsUniqueCharacter ("raju"));
    assertFalse (utility.containsUniqueCharacter ("debmalya"));
    assertFalse (utility.containsUniqueCharacter ("  "));
    assertTrue (utility.containsUniqueCharacter ("abcdefghijklmnopqrstuvwxyz"));
    assertFalse (utility.containsUniqueCharacter ("aA"));
    assertFalse (utility.containsUniqueCharacter ("abcdefghijklmnopqrstuvwxyzA"));
    try
    {
      utility.containsUniqueCharacter (null);
      assertFalse ("Must throw exception", true);
    }
    catch (IllegalArgumentException iae)
    {
      assertTrue ("Must throw exception", true);
    }
  }

  
  @Test
  public void testReverse() {
    StringUtility utility = new StringUtility ();
    String reversed = utility.reverse ("Debmalya");
    assertTrue("aylambeD".equals (reversed));
    reversed = utility.reverse ("Debmalya\n");
    assertTrue("aylambeD".equals (reversed));
    reversed = utility.reverse ("Raju");
    assertTrue("ujaR".equals (reversed));
  }
  
  @Test
  public void testLowercase() {
    StringUtility utility = new StringUtility ();
    String lowered = utility.toLowerCase ("Debmalya");
    assertTrue("debmalya".equals (lowered));
    lowered = utility.toLowerCase ("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    assertTrue("abcdefghijklmnopqrstuvwxyz".equals (lowered));
    lowered = utility.toLowerCase ("A");
    assertTrue("a".equals (lowered));
  }
  
  @Test
  public void testWithoutDuplicate() {
    StringUtility utility = new StringUtility ();
    
    String modified = utility.removeDuplicate ("raju");
    assertTrue("raju".equals (modified));
    modified = utility.removeDuplicate ("Raju");
    assertTrue("Raju".equals (modified));
    modified = utility.removeDuplicate ("Debmalya");
    assertTrue("Debmaly".equals (modified));
  }
  
  @Test
  public void testIsAnagram() {
    StringUtility utility = new StringUtility ();
    assertTrue(utility.isAnagram ("listen", "silent"));
    assertFalse(utility.isAnagram ("listen", "silent1"));
    assertFalse(utility.isAnagram ("listen", "silena"));
  }
  
  @Test
  public void testPalindromic() {
    StringUtility utility = new StringUtility ();
    assertTrue(utility.isPalindrom ("madam"));
    assertTrue(utility.isPalindrom ("900009"));
    assertFalse(utility.isPalindrom ("910009"));
   
  }
  
  @Test
  public void isPalindrome(){
	  StringUtility utility = new StringUtility ();
	  Assert.assertTrue(utility.isPalindrome("abb"));
	  Assert.assertFalse(utility.isPalindrome("abc"));
  }
  
  @Test
  public void testGetFirstDuplicateCharacter() {
    StringUtility utility = new StringUtility ();
    char actual = utility.getFristDuplicateCharacter ("Banana");
    Assert.assertEquals ('a', actual);
    
    actual = utility.getFristDuplicateCharacter ("Raju");
    Assert.assertEquals (' ', actual);
  }
  
  
  @Test
  public void testGetFirstUniqueCharacter() {
    StringUtility utility = new StringUtility ();
    Character actual = utility.getFristUniqueCharacter ("Banana");
    Assert.assertEquals ('B', actual.charValue());
    
    actual = utility.getFristUniqueCharacter ("RRaajju");
    Assert.assertEquals ('u', actual.charValue());
    
    actual = utility.getFristUniqueCharacter (" ");
    Assert.assertEquals (' ', actual.charValue());
    
    actual = utility.getFristUniqueCharacter ("  ");
    Assert.assertNull (actual);
    
    actual = utility.getFristUniqueCharacter ("Aharsi");
    Assert.assertEquals ('A', actual.charValue());
  }
  
  @Test
  public void testMissingChar() {
	  StringUtility utility = new StringUtility ();
	  String r = utility.missingAlphabet("abcdefghijklmnopqrstuvwxy");
	  assertTrue("Expected z but found " + r,r.equals("z"));
	  
	  r = utility.missingAlphabet("aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy");
	  assertTrue("Expected zz but found " + r,r.equals("zz"));
	  
	  r = utility.missingAlphabet("abbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxy");
	  assertTrue("Expected ayzz but found " + r,r.equals("ayzz"));
	  
  }
  
  @Test
  public void testIsInt() {
	  StringUtility utility = new StringUtility ();
	  Assert.assertTrue(utility.isInt("DEB:123456:123"));
	  Assert.assertFalse(utility.isInt("DEB:A0000001:123"));
	  
  }
  
  @Test
  public void testTree() {
	  String[] expecteds = new String[]{"    *    ","   ***   ","  *****  "," ******* ","*********"};
	  String[] actuals = StringUtility.theTree(5);
	  Assert.assertArrayEquals(expecteds, actuals);
  }
}

