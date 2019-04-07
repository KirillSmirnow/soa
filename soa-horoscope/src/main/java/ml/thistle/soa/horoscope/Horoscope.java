package ml.thistle.soa.horoscope;

import lombok.Getter;

import java.beans.ConstructorProperties;

@Getter
public class Horoscope {

    private final String today;

    @ConstructorProperties("today")
    public Horoscope(String today) {
        this.today = today;
    }
}
