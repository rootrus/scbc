package org.spongycastle.util.encoders;

public class EncoderException extends IllegalStateException {
    private Throwable MediaBrowserCompat$CustomActionResultReceiver;

    public EncoderException(String str, Throwable th) {
        super(str);
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }

    public Throwable getCause() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }
}
