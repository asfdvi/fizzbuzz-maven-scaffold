import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FizzBuzzTest {

    private int num;
    private String expected;

    public FizzBuzzTest(int num, String expected) {
        this.num = num;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {3, "Fizz"},
                {5, "Buzz"},
                {15, "FizzBuzz"}
        });
    }

    @Test
    public void fizzBuzzTest() {
        assertEquals(expected,FizzBuzz.getFizzBuzz(num));
    }

}
