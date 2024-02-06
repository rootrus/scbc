package com.google.zxing;

public final class ChecksumException extends ReaderException {
    private static final ChecksumException MediaBrowserCompat$ItemReceiver;

    static {
        ChecksumException checksumException = new ChecksumException();
        MediaBrowserCompat$ItemReceiver = checksumException;
        checksumException.setStackTrace(write);
    }

    private ChecksumException() {
    }

    public static ChecksumException write() {
        return IconCompatParcelizer ? new ChecksumException() : MediaBrowserCompat$ItemReceiver;
    }
}
