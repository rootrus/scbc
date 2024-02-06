package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.tk */
public final /* synthetic */ class C7523tk implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ int IconCompatParcelizer;
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ byte[] MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C7523tk(int i, int i2, byte[] bArr) {
        this.IconCompatParcelizer = i;
        this.MediaBrowserCompat$CustomActionResultReceiver = i2;
        this.MediaBrowserCompat$ItemReceiver = bArr;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.ActionMenuItemView) obj).write(this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver);
    }
}
