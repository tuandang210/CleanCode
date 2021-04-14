import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    @DisplayName("1-1-2018")
    void showDay() {
        int day = 1;
        int month = 1;
        int year = 2018;

        String expected = "2-1-2018";
        String result = NextDayCalculator.showDay(day, month, year);
        assertEquals(expected, result);

    }

    @Test
    @DisplayName("31-1-2018")
    void showDay1() {
        int day = 31;
        int month = 1;
        int year = 2018;

        String expected = "1-2-2018";
        String result = NextDayCalculator.showDay(day, month, year);
        assertEquals(expected, result);

    }

    @Test
    @DisplayName("30-4-2018")
    void showDay2() {
        int day = 30;
        int month = 4;
        int year = 2018;

        String expected = "1-5-2018";
        String result = NextDayCalculator.showDay(day, month, year);
        assertEquals(expected, result);

    }

    @Test
    @DisplayName("28-2-2018")
    void showDay3() {
        int day = 28;
        int month = 2;
        int year = 2018;

        String expected = "1-3-2018";
        String result = NextDayCalculator.showDay(day, month, year);
        assertEquals(expected, result);
    }
}