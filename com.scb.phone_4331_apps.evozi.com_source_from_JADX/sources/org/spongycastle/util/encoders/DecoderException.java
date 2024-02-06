package org.spongycastle.util.encoders;

public class DecoderException extends IllegalStateException {
    private Throwable MediaBrowserCompat$ItemReceiver;

    public DecoderException(String str, Throwable th) {
        super(str);
        this.MediaBrowserCompat$ItemReceiver = th;
    }

    public Throwable getCause() {
        return this.MediaBrowserCompat$ItemReceiver;
    }
}
