import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MommifierTest {
  @Test
  void should_do_nothing_when_vowels_less_than_30_percent () {
    Mommifier mommifier = new Mommifier();
    String res = mommifier.resolve("youngggg");
    String expect = "youngggg";
    assertEquals(expect, res);
  }

  @Test
  void should_insert_mommy_when_vowels_more_than_30_percent_and_only_appear_continually () {
    Mommifier mommifier = new Mommifier();
    String res = mommifier.resolve("youienieg");
    String expect = "yomommyumommyimommyenimommyeg";
    assertEquals(expect, res);
  }
}
