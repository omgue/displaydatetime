package com.kumojin.display.time.zone;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:3000"})
public class TimeZoneInfoEndpoint {

    private static final String ASIA_TOKYO = "Asia/Tokyo";

    @GetMapping(value = "/date-time-info")
        public DateTimeInfo getDateTimeInfo() {
        DateTimeInfo zonedDateTime = computeTokyoDateTime();
        return zonedDateTime;
    }

    private DateTimeInfo computeTokyoDateTime() {
        ZoneId zoneId = ZoneId.of(ASIA_TOKYO);
        return new DateTimeInfo(zoneId.toString(), ZonedDateTime.now().withZoneSameInstant(zoneId));
    }
}
