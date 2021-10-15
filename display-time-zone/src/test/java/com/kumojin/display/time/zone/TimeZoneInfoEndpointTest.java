package com.kumojin.display.time.zone;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

class TimeZoneInfoEndpointTest {

    private static final String ASIA_TOKYO = "Asia/Tokyo";
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private TimeZoneInfoEndpoint endpoint = new TimeZoneInfoEndpoint();

    @Test
    void display() {
        // Given
        ZonedDateTime japanLocalDateTime = ZonedDateTime.now().plusHours(13L);

        // When
        DateTimeInfo dateTimeInfo = endpoint.getDateTimeInfo();

        // Assert
        Assert.assertEquals(ASIA_TOKYO, dateTimeInfo.getZoneId());
        Assert.assertEquals(DATE_TIME_FORMATTER.format(japanLocalDateTime.toLocalDateTime()),
                DATE_TIME_FORMATTER.format(dateTimeInfo.getZonedDateTime().toLocalDateTime()));
    }
}