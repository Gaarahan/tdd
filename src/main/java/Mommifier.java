import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author gaarahan
 */
public class Mommifier {
  private final static String SINGLE_VOWEL_REGEX = "[!aeiou]";
  private final static String CONTINUALLY_VOWEL_REGEXP = "[aeiou](?=[aeiou])";
  private final static Double VOWEL_THRESHOLD = 0.3;

  public String resolve(String str) {
    if(this.hasMoreThanThirtyPercentVowels(str)) {
      return str;
    }

    Pattern pattern = Pattern.compile(CONTINUALLY_VOWEL_REGEXP);
    Matcher matches = pattern.matcher(str);

    StringBuffer strBuf = new StringBuffer();
    while (matches.find()) {
      matches.appendReplacement(strBuf, "$0mommy");
    }

    matches.appendTail(strBuf);

    return strBuf.toString();
  }

  private boolean hasMoreThanThirtyPercentVowels(String str) {
    int vowelsCount = str.length() - str.replaceAll(SINGLE_VOWEL_REGEX, "").length();
    return (vowelsCount * 1.0) / str.length() < VOWEL_THRESHOLD;
  }
}
