package lebui.training.helloee.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringServiceTest {

    private StringService stringService;

    @Before
    public void before() {
        stringService = new StringService();
    }

    @Test
    public void toUpper_lowerString_returnUpperString() {
        String actual = stringService.toUpper("abc");
        assertEquals("ABC", actual);
    }

    @Test
    public void toUpper_upperString_noChange() {
        String actual = stringService.toUpper("ABC");
        assertEquals("ABC", actual);
    }

    @Test
    public void toUpper_nonCharacterString_noChange() {
        String actual = stringService.toUpper("12@#");
        assertEquals("12@#", actual);
    }
    
    @Test
    public void toUpper_mixedCases() {
        String actual = stringService.toUpper("Abc1#^");
        assertEquals("ABC1#^", actual);
    }
}
