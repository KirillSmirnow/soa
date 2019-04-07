package ml.thistle.soa.horoscope;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ml.thistle.soa.shared.horoscope.HoroscopeController;
import ml.thistle.soa.shared.horoscope.UserHoroscope;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.Map;

@Slf4j
@RestController
public class HoroscopeService implements HoroscopeController {

    private static final String URL = "http://ignio.com/r/export/utf/xml/daily/com.xml";
    private static final RestTemplate REST_TEMPLATE = new RestTemplate();

    @Override
    public UserHoroscope getHoroscope(LocalDate birthday) {
        try {
            ZodiacSign zodiacSign = ZodiacSign.getByBirthday(birthday);
            Horoscopes allHoroscopes = getAllHoroscopes();
            Horoscope userHoroscope = allHoroscopes.getByBirthdayDate(birthday);
            return new UserHoroscope(zodiacSign.name(), userHoroscope.getToday());
        } catch (Exception e) {
            e.printStackTrace();
            return new UserHoroscope("Unknown", "Unable to get horoscope");
        }
    }

    private Horoscopes getAllHoroscopes() {
        ParameterizedTypeReference<Map<String, Horoscope>> type = new ParameterizedTypeReference<Map<String, Horoscope>>() {
        };
        Map<String, Horoscope> horoscopes = REST_TEMPLATE.exchange(URL, HttpMethod.GET, null, type).getBody();
        return new Horoscopes(horoscopes);
    }

    @RequiredArgsConstructor
    private static class Horoscopes {

        private final Map<String, Horoscope> values;

        private Horoscope getByBirthdayDate(LocalDate birthdayDate) {
            ZodiacSign zodiacSign = ZodiacSign.getByBirthday(birthdayDate);
            return values.get(zodiacSign.name().toLowerCase());
        }
    }
}
