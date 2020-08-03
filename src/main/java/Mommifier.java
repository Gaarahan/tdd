import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author gaarahan
 */
public class Mommifier {
  public String resolve(String str) {
    int vowelsCount = str.replaceAll("[!aeiou]", "").length();
    if ((vowelsCount*1.0) / str.length() < 0.3) {
      return str;
    }
    // TODO resolve more than 30%
    return str;
  }
}
