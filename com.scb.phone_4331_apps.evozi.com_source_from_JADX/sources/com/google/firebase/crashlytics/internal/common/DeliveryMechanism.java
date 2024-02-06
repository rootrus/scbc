package com.google.firebase.crashlytics.internal.common;

public enum DeliveryMechanism {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: id */
    private final int f3271id;

    private DeliveryMechanism(int i) {
        this.f3271id = i;
    }

    public final int getId() {
        return this.f3271id;
    }

    public final String toString() {
        return Integer.toString(this.f3271id);
    }

    public static DeliveryMechanism determineFrom(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }
}
