package com.google.zxing;

public final class FormatException extends ReaderException {
    private static final FormatException MediaBrowserCompat$CustomActionResultReceiver;

    static {
        FormatException formatException = new FormatException();
        MediaBrowserCompat$CustomActionResultReceiver = formatException;
        formatException.setStackTrace(write);
    }

    private FormatException() {
    }

    private FormatException(Throwable th) {
        super(th);
    }

    public static FormatException read() {
        return IconCompatParcelizer ? new FormatException() : MediaBrowserCompat$CustomActionResultReceiver;
    }

    public static FormatException MediaBrowserCompat$CustomActionResultReceiver(Throwable th) {
        return IconCompatParcelizer ? new FormatException(th) : MediaBrowserCompat$CustomActionResultReceiver;
    }
}
