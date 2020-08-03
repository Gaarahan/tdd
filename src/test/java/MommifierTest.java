import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MommifierTest {
  private static Mommifier mommifier;

  @BeforeAll
  public static void init () {
    mommifier = new Mommifier();
  }

  @Test
  void should_do_nothing_when_vowels_less_than_30_percent () {
    String res = mommifier.resolve("youngggg");
    String expect = "youngggg";
    assertEquals(expect, res);
  }

  @Test
  void should_insert_mommy_when_vowels_more_than_30_percent_and_only_appear_continually () {
    String res = mommifier.resolve("youienieg");
    String expect = "yomommyumommyimommyenimommyeg";
    assertEquals(expect, res);
  }

  @Test
  void should_insert_mommy_when_vowels_more_than_30_percent_but_not_only_appear_continually () {
    String res = mommifier.resolve("youieniegxxxixx");
    String expect = "yomommyumommyimommyenimommyegxxxixx";
    assertEquals(expect, res);
  }
}
