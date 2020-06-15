import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void testReturnNexDay1() {
        NextDayCalculator nextDayCalculator=new NextDayCalculator("01/01/2018");
        String nextDate = nextDayCalculator.returnNexDay();
        String result ="01/02/2018";
        assertEquals(result,nextDate);
    }
    @Test
    void testReturnNexDay2() {
        NextDayCalculator nextDayCalculator=new NextDayCalculator("02/29/2020");
        String nextDate = nextDayCalculator.returnNexDay();
        String result ="03/01/2020";
        assertEquals(result,nextDate);
    }
}