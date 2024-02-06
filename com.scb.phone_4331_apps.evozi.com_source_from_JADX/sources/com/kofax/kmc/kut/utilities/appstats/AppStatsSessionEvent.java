package com.kofax.kmc.kut.utilities.appstats;

public class AppStatsSessionEvent {
    private static final String TAG = AppStatsSessionEvent.class.getSimpleName();
    private String response = "";
    private String type = "";

    public AppStatsSessionEvent() {
    }

    public AppStatsSessionEvent(String str) {
        this.type = str;
    }

    public AppStatsSessionEvent(String str, String str2) {
        this.type = str;
        this.response = str2;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        if (str != null) {
            this.type = str;
            return;
        }
        throw new NullPointerException("setType: sessionType parameter cannot be null");
    }

    public String getResponse() {
        return this.response;
    }

    public void setResponse(String str) {
        if (str != null) {
            this.response = str;
            return;
        }
        throw new NullPointerException("setType: response parameter cannot be null");
    }
}
