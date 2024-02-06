package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.nativeFromBitmap */
public final /* synthetic */ class nativeFromBitmap implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ nativeFromBitmap(int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckCaptureModule_GetUriKtaFactory) obj).write(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
