package ml.thistle.soa.shared.horoscope;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@FeignClient("horoscope")
public interface HoroscopeController {

    @GetMapping("/horoscope")
    UserHoroscope getHoroscope(@RequestParam LocalDate birthday);
}
