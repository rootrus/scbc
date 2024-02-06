package com.google.zxing;

public final class NotFoundException extends ReaderException {
    private static final NotFoundException MediaBrowserCompat$CustomActionResultReceiver;

    static {
        NotFoundException notFoundException = new NotFoundException();
        MediaBrowserCompat$CustomActionResultReceiver = notFoundException;
        notFoundException.setStackTrace(write);
    }

    private NotFoundException() {
    }

    public static NotFoundException MediaBrowserCompat$CustomActionResultReceiver() {
        return MediaBrowserCompat$CustomActionResultReceiver;
    }
}
