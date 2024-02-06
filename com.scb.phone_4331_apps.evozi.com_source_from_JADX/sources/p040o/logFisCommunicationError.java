package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.logFisCommunicationError */
public final /* synthetic */ class logFisCommunicationError implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setUncaughtExceptionHandler MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ logFisCommunicationError(setUncaughtExceptionHandler setuncaughtexceptionhandler) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setuncaughtexceptionhandler;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CreditCardCaptureModule_GetLookAndFeelParametersFactory) obj).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
