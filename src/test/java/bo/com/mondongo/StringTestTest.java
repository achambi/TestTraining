package bo.com.mondongo;

import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class StringTestTest {

    @Test
    public void splitString_case1() throws IOException {
        List<String> results = StringTest.splitString("abcdefghijklmnopqrstuvwxy", 5);
        Assert.assertEquals(5, results.size());
        Assert.assertEquals("[abcde, fghij, klmno, pqrst, uvwxy]", results.toString());
    }

    @Test
    public void splitString_case2() {
        Exception exception = assertThrows(IOException.class, () -> StringTest.splitString("abcfdefghijkl", 3));
        assertEquals("It's not possible split the string, left:l", exception.getMessage());
    }

    @Test
    public void splitString_case3() throws IOException {
        List<String> results = StringTest.splitString("abcfdefghi", 2);
        Assert.assertEquals(2, results.size());
        Assert.assertEquals("[abcfd, efghi]", results.toString());
    }

    @Test
    public void lengthOfLongestSubStrings() {
        int result = StringTest.lengthOfLongestSubStrings("aabczaqww");
        Assert.assertEquals(4, result);
    }

    @Test
    public void lengthOfLongestSubStringsCase2() {
        int result = StringTest.lengthOfLongestSubStrings("abcdefabc");
        Assert.assertEquals(6, result);
    }

    @Test
    public void lengthOfLongestSubStringsCase3() {
        int result = StringTest.lengthOfLongestSubStrings("agusa");
        Assert.assertEquals(4, result);
    }

    @Test
    public void lengthOfLongestSubStringsCase4() {
        int result = StringTest.lengthOfLongestSubStrings("abcdefgAbc");
        Assert.assertEquals(7, result);
    }
}