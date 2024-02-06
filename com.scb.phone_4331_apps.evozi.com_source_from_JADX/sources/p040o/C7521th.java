package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.th */
public final /* synthetic */ class C7521th implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ byte[] MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C7521th(byte[] bArr) {
        this.MediaBrowserCompat$ItemReceiver = bArr;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.ActionMenuItemView) obj).IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver);
    }
}
