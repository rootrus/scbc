package com.google.firebase.crashlytics.internal.common;

public class ResponseParser {
    public static int parse(int i) {
        if (i < 200 || i > 299) {
            return ((i < 300 || i > 399) && i >= 400 && i <= 499) ? 0 : 1;
        }
        return 0;
    }
}
