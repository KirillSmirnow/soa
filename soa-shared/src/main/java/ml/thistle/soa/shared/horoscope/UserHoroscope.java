package ml.thistle.soa.shared.horoscope;

import lombok.Getter;

import java.beans.ConstructorProperties;

@Getter
public class UserHoroscope {

    private final String zodiacSign;
    private final String forecast;

    @ConstructorProperties({"zodiacSign", "forecast"})
    public UserHoroscope(String zodiacSign, String forecast) {
        this.zodiacSign = zodiacSign;
        this.forecast = forecast;
    }
}
