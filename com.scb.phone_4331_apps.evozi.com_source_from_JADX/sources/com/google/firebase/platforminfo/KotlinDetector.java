package com.google.firebase.platforminfo;

import p040o.HmlSimulatorTutorialActivity;

public final class KotlinDetector {
    public static String detectVersion() {
        try {
            return HmlSimulatorTutorialActivity.read.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
