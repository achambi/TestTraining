package bo.com.mondongo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StringTest {
    private StringTest() {
    }

    public static List<String> splitString(String inputString, int n) throws IOException {
        List<String> strings = new ArrayList<>();
        int charByPart = inputString.length()/n;
        char[] chars = inputString.toCharArray();
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (char aChar : chars) {
            count++;
            sb.append(aChar);

            if (count == charByPart) {
                strings.add(sb.toString());
                sb.setLength(0);
                count = 0;
            }
        }

        if (sb.length() > 0) {
            throw new IOException("It's not possible split the string, left:" + (sb.toString()));
        }
        return strings;
    }

    public static int lengthOfLongestSubStrings(String inputString) {
        StringBuilder stringBuilder = new StringBuilder();
        int length = 0;
        char[] characters = inputString.toCharArray();
        for (char character : characters) {
            String subString = stringBuilder.toString();
            if (subString.contains(String.valueOf(character))) {
                if (subString.length() > length) {
                    length = subString.length();
                }
                stringBuilder.setLength(0);
            }
            stringBuilder.append(character);
        }
        if (length == 0) {
            length = stringBuilder.toString().length();
        }
        return length;
    }
}
