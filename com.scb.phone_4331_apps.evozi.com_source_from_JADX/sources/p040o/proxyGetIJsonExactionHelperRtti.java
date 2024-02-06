package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.proxyGetIJsonExactionHelperRtti */
public final /* synthetic */ class proxyGetIJsonExactionHelperRtti implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getZip MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ proxyGetIJsonExactionHelperRtti(getZip getzip, String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getzip;
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.ListMenuItemView) obj).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.write, this.MediaBrowserCompat$ItemReceiver);
    }
}
