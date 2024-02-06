package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getAnnotations */
public final /* synthetic */ class getAnnotations implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Boolean MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ boolean read;

    public /* synthetic */ getAnnotations(boolean z, Boolean bool) {
        this.read = z;
        this.MediaBrowserCompat$CustomActionResultReceiver = bool;
    }

    public final void IconCompatParcelizer(Object obj) {
        getDeclaredClass.IconCompatParcelizer(this.read, this.MediaBrowserCompat$CustomActionResultReceiver, (getDocumentVerificationConfidenceRating) obj);
    }
}
