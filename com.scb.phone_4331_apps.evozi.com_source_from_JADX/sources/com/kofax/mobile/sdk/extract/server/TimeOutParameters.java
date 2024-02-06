package com.kofax.mobile.sdk.extract.server;

import java.util.concurrent.TimeUnit;

public class TimeOutParameters {
    private long aga;
    private TimeUnit agb;

    public TimeOutParameters(long j, TimeUnit timeUnit) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("timeout < 0");
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException("Timeout too large.");
            } else if (millis != 0 || i <= 0) {
                this.aga = j;
                this.agb = timeUnit;
            } else {
                throw new IllegalArgumentException("Timeout too small.");
            }
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    public long getTimeOut() {
        return this.aga;
    }

    public TimeUnit getUnit() {
        return this.agb;
    }
}
