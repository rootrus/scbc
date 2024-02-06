package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.readCreateResponse */
public final /* synthetic */ class readCreateResponse implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ TimeLimiter MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ readCreateResponse(TimeLimiter timeLimiter) {
        this.MediaBrowserCompat$CustomActionResultReceiver = timeLimiter;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CreditCardCaptureModule_GetLookAndFeelParametersFactory) obj).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
