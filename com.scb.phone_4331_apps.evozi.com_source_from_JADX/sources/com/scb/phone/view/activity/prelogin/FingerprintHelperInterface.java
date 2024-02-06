package com.scb.phone.view.activity.prelogin;

public interface FingerprintHelperInterface {

    public interface IconCompatParcelizer {
        void IconCompatParcelizer();

        void IconCompatParcelizer(Throwable th);

        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$CustomActionResultReceiver(String str);
    }

    public static class FingerprintException extends RuntimeException {
        public FingerprintException(String str) {
            super(str);
        }

        public FingerprintException(String str, Throwable th) {
            super(str, th);
        }
    }
}
