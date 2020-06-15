import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void testCheckNumber9() {
        FizzBuzz fizzBuzz = new FizzBuzz(9);
        String result = fizzBuzz.checkNumber();
        String expected ="Fizz";
        assertEquals(expected,result);
    }
    @Test
    void testCheckNumber20() {
        FizzBuzz fizzBuzz = new FizzBuzz(20);
        String result = fizzBuzz.checkNumber();
        String expected ="Buzz";
        assertEquals(expected,result);
    }
    @Test
    void testCheckNumber15() {
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        String result = fizzBuzz.checkNumber();
        String expected ="FizzBuzz";
        assertEquals(expected,result);
    }
    @Test
    void testCheckNumber14() {
        FizzBuzz fizzBuzz = new FizzBuzz(14);
        String result = fizzBuzz.checkNumber();
        String expected ="14";
        assertEquals(expected,result);
    }
}