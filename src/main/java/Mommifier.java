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

    Pattern pattern = Pattern.compile("[aeiou](?=[aeiou])");
    Matcher matches = pattern.matcher(str);

    StringBuffer sbuf = new StringBuffer();
    while (matches.find()) {
      matches.appendReplacement(sbuf, "$0mommy");
    }

    matches.appendTail(sbuf);

    return sbuf.toString();
  }
}
