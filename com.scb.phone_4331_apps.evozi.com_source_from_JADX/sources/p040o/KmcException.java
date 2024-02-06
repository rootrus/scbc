package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.KmcException */
public final /* synthetic */ class KmcException implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ KmcException(int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getExtractSignatureImage) obj).write(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
