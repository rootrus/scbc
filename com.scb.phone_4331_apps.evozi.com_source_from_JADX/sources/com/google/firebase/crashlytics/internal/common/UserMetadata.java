package com.google.firebase.crashlytics.internal.common;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserMetadata {
    private final ConcurrentHashMap<String, String> attributes = new ConcurrentHashMap<>();
    private String userId = null;

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String str) {
        this.userId = sanitizeAttribute(str);
    }

    public Map<String, String> getCustomKeys() {
        return Collections.unmodifiableMap(this.attributes);
    }

    private static String sanitizeAttribute(String str) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > 1024 ? trim.substring(0, 1024) : trim;
    }
}
