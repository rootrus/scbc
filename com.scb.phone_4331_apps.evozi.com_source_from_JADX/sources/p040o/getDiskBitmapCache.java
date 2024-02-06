package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getDiskBitmapCache */
public final /* synthetic */ class getDiskBitmapCache implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean read;

    public /* synthetic */ getDiskBitmapCache(boolean z) {
        this.read = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((KtaJsonCheck$MediaBrowserCompat$CustomActionResultReceiver) obj).read(this.read);
    }
}
