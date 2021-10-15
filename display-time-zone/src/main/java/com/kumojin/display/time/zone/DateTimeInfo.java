package com.kumojin.display.time.zone;

import java.time.ZonedDateTime;

public class DateTimeInfo {
    private String zoneId;
    private ZonedDateTime zonedDateTime;

    public DateTimeInfo(String zoneId, ZonedDateTime zonedDateTime) {
        this.zoneId = zoneId;
        this.zonedDateTime = zonedDateTime;
    }

    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public ZonedDateTime getZonedDateTime() {
        return zonedDateTime;
    }

    public void setZonedDateTime(ZonedDateTime zonedDateTime) {
        this.zonedDateTime = zonedDateTime;
    }
}
