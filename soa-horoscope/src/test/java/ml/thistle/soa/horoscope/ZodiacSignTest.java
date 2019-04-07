package ml.thistle.soa.horoscope;

import org.junit.Test;

import java.time.LocalDate;
import java.time.MonthDay;
import java.util.ArrayList;
import java.util.List;

import static java.time.Month.*;
import static java.time.MonthDay.of;
import static org.junit.Assert.assertEquals;

public class ZodiacSignTest {

    private static List<LocalDate> range(MonthDay fromInclusive, MonthDay toInclusive) {
        int year = 2016;
        List<LocalDate> dates = new ArrayList<>();
        LocalDate currentDate = fromInclusive.atYear(year);
        LocalDate lastDate = toInclusive.atYear(year).plusDays(1);
        while (!currentDate.equals(lastDate)) {
            dates.add(currentDate);
            currentDate = currentDate.plusDays(1);
        }
        return dates;
    }

    @Test
    public void testJanuary() {
        int firstDayOfNewSign = 20;
        int lastDayOfMonth = 31;
        range(of(JANUARY, 1), of(JANUARY, firstDayOfNewSign - 1)).stream()
                .map(ZodiacSign::getByBirthday)
                .forEach(sign -> assertEquals(ZodiacSign.CAPRICORN, sign));
        range(of(JANUARY, firstDayOfNewSign), of(JANUARY, lastDayOfMonth)).stream()
                .map(ZodiacSign::getByBirthday)
                .forEach(sign -> assertEquals(ZodiacSign.AQUARIUS, sign));
    }

    @Test
    public void testFebruary() {
        int firstDayOfNewSign = 19;
        int lastDayOfMonth = 29;
        range(of(FEBRUARY, 1), of(FEBRUARY, firstDayOfNewSign - 1)).stream()
                .map(ZodiacSign::getByBirthday)
                .forEach(sign -> assertEquals(ZodiacSign.AQUARIUS, sign));
        range(of(FEBRUARY, 19), of(FEBRUARY, lastDayOfMonth)).stream()
                .map(ZodiacSign::getByBirthday)
                .forEach(sign -> assertEquals(ZodiacSign.PISCES, sign));
    }

    @Test
    public void testMarch() {
        int firstDayOfNewSign = 21;
        int lastDayOfMonth = 31;
        range(of(MARCH, 1), of(MARCH, firstDayOfNewSign - 1)).stream()
                .map(ZodiacSign::getByBirthday)
                .forEach(sign -> assertEquals(ZodiacSign.PISCES, sign));
        range(of(MARCH, firstDayOfNewSign), of(MARCH, lastDayOfMonth)).stream()
                .map(ZodiacSign::getByBirthday)
                .forEach(sign -> assertEquals(ZodiacSign.ARIES, sign));
    }

    @Test
    public void testApril() {
        int firstDayOfNewSign = 20;
        int lastDayOfMonth = 30;
        range(of(APRIL, 1), of(APRIL, firstDayOfNewSign - 1)).stream()
                .map(ZodiacSign::getByBirthday)
                .forEach(sign -> assertEquals(ZodiacSign.ARIES, sign));
        range(of(APRIL, firstDayOfNewSign), of(APRIL, lastDayOfMonth)).stream()
                .map(ZodiacSign::getByBirthday)
                .forEach(sign -> assertEquals(ZodiacSign.TAURUS, sign));
    }

    @Test
    public void testMay() {
        int firstDayOfNewSign = 21;
        int lastDayOfMonth = 31;
        range(of(MAY, 1), of(MAY, firstDayOfNewSign - 1)).stream()
                .map(ZodiacSign::getByBirthday)
                .forEach(sign -> assertEquals(ZodiacSign.TAURUS, sign));
        range(of(MAY, firstDayOfNewSign), of(MAY, lastDayOfMonth)).stream()
                .map(ZodiacSign::getByBirthday)
                .forEach(sign -> assertEquals(ZodiacSign.GEMINI, sign));
    }

    @Test
    public void testJune() {
        int firstDayOfNewSign = 21;
        int lastDayOfMonth = 30;
        range(of(JUNE, 1), of(JUNE, firstDayOfNewSign - 1)).stream()
                .map(ZodiacSign::getByBirthday)
                .forEach(sign -> assertEquals(ZodiacSign.GEMINI, sign));
        range(of(JUNE, firstDayOfNewSign), of(JUNE, lastDayOfMonth)).stream()
                .map(ZodiacSign::getByBirthday)
                .forEach(sign -> assertEquals(ZodiacSign.CANCER, sign));
    }

    @Test
    public void testJuly() {
        int firstDayOfNewSign = 23;
        int lastDayOfMonth = 31;
        range(of(JULY, 1), of(JULY, firstDayOfNewSign - 1)).stream()
                .map(ZodiacSign::getByBirthday)
                .forEach(sign -> assertEquals(ZodiacSign.CANCER, sign));
        range(of(JULY, firstDayOfNewSign), of(JULY, lastDayOfMonth)).stream()
                .map(ZodiacSign::getByBirthday)
                .forEach(sign -> assertEquals(ZodiacSign.LEO, sign));
    }

    @Test
    public void testAugust() {
        int firstDayOfNewSign = 23;
        int lastDayOfMonth = 31;
        range(of(AUGUST, 1), of(AUGUST, firstDayOfNewSign - 1)).stream()
                .map(ZodiacSign::getByBirthday)
                .forEach(sign -> assertEquals(ZodiacSign.LEO, sign));
        range(of(AUGUST, firstDayOfNewSign), of(AUGUST, lastDayOfMonth)).stream()
                .map(ZodiacSign::getByBirthday)
                .forEach(sign -> assertEquals(ZodiacSign.VIRGO, sign));
    }

    @Test
    public void testSeptember() {
        int firstDayOfNewSign = 23;
        int lastDayOfMonth = 30;
        range(of(SEPTEMBER, 1), of(SEPTEMBER, firstDayOfNewSign - 1)).stream()
                .map(ZodiacSign::getByBirthday)
                .forEach(sign -> assertEquals(ZodiacSign.VIRGO, sign));
        range(of(SEPTEMBER, firstDayOfNewSign), of(SEPTEMBER, lastDayOfMonth)).stream()
                .map(ZodiacSign::getByBirthday)
                .forEach(sign -> assertEquals(ZodiacSign.LIBRA, sign));
    }

    @Test
    public void testOctober() {
        int firstDayOfNewSign = 23;
        int lastDayOfMonth = 31;
        range(of(OCTOBER, 1), of(OCTOBER, firstDayOfNewSign - 1)).stream()
                .map(ZodiacSign::getByBirthday)
                .forEach(sign -> assertEquals(ZodiacSign.LIBRA, sign));
        range(of(OCTOBER, firstDayOfNewSign), of(OCTOBER, lastDayOfMonth)).stream()
                .map(ZodiacSign::getByBirthday)
                .forEach(sign -> assertEquals(ZodiacSign.SCORPIO, sign));
    }

    @Test
    public void testNovember() {
        int firstDayOfNewSign = 22;
        int lastDayOfMonth = 30;
        range(of(NOVEMBER, 1), of(NOVEMBER, firstDayOfNewSign - 1)).stream()
                .map(ZodiacSign::getByBirthday)
                .forEach(sign -> assertEquals(ZodiacSign.SCORPIO, sign));
        range(of(NOVEMBER, firstDayOfNewSign), of(NOVEMBER, lastDayOfMonth)).stream()
                .map(ZodiacSign::getByBirthday)
                .forEach(sign -> assertEquals(ZodiacSign.SAGITTARIUS, sign));
    }

    @Test
    public void testDecember() {
        int firstDayOfNewSign = 22;
        int lastDayOfMonth = 31;
        range(of(DECEMBER, 1), of(DECEMBER, firstDayOfNewSign - 1)).stream()
                .map(ZodiacSign::getByBirthday)
                .forEach(sign -> assertEquals(ZodiacSign.SAGITTARIUS, sign));
        range(of(DECEMBER, firstDayOfNewSign), of(DECEMBER, lastDayOfMonth)).stream()
                .map(ZodiacSign::getByBirthday)
                .forEach(sign -> assertEquals(ZodiacSign.CAPRICORN, sign));
    }
}
