package com.google.firebase.crashlytics.internal;

import java.io.File;

public final class MissingNativeComponent implements CrashlyticsNativeComponent {
    private static final NativeSessionFileProvider MISSING_NATIVE_SESSION_FILE_PROVIDER = new MissingNativeSessionFileProvider();

    public final boolean finalizeSession(String str) {
        return true;
    }

    public final boolean hasCrashDataForSession(String str) {
        return false;
    }

    public final boolean openSession(String str) {
        return true;
    }

    public final void writeBeginSession(String str, String str2, long j) {
    }

    public final void writeSessionApp(String str, String str2, String str3, String str4, String str5, int i, String str6) {
    }

    public final void writeSessionDevice(String str, int i, String str2, int i2, long j, long j2, boolean z, int i3, String str3, String str4) {
    }

    public final void writeSessionOs(String str, String str2, String str3, boolean z) {
    }

    public final NativeSessionFileProvider getSessionFileProvider(String str) {
        return MISSING_NATIVE_SESSION_FILE_PROVIDER;
    }

    static final class MissingNativeSessionFileProvider implements NativeSessionFileProvider {
        public final File getAppFile() {
            return null;
        }

        public final File getBinaryImagesFile() {
            return null;
        }

        public final File getDeviceFile() {
            return null;
        }

        public final File getMetadataFile() {
            return null;
        }

        public final File getMinidumpFile() {
            return null;
        }

        public final File getOsFile() {
            return null;
        }

        public final File getSessionFile() {
            return null;
        }

        private MissingNativeSessionFileProvider() {
        }
    }
}
