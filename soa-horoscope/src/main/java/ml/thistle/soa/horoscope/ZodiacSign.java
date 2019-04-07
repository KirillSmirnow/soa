package ml.thistle.soa.horoscope;

import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

import static java.time.MonthDay.of;

@RequiredArgsConstructor
public enum ZodiacSign {
    AQUARIUS(of(Month.JANUARY, 20)),
    PISCES(of(Month.FEBRUARY, 19)),
    ARIES(of(Month.MARCH, 21)),
    TAURUS(of(Month.APRIL, 20)),
    GEMINI(of(Month.MAY, 21)),
    CANCER(of(Month.JUNE, 21)),
    LEO(of(Month.JULY, 23)),
    VIRGO(of(Month.AUGUST, 23)),
    LIBRA(of(Month.SEPTEMBER, 23)),
    SCORPIO(of(Month.OCTOBER, 23)),
    SAGITTARIUS(of(Month.NOVEMBER, 22)),
    CAPRICORN(of(Month.DECEMBER, 22));

    private final MonthDay from;

    public static ZodiacSign getByBirthday(LocalDate birthdayDate) {
        MonthDay birthday = of(birthdayDate.getMonth(), birthdayDate.getDayOfMonth());
        for (int signNumber = 0; signNumber < values().length; signNumber++) {
            ZodiacSign current = values()[signNumber];
            ZodiacSign previous = signNumber > 0 ? values()[signNumber - 1] : CAPRICORN;
            if (birthday.isBefore(current.from)) {
                return previous;
            }
        }
        return CAPRICORN;
    }
}
