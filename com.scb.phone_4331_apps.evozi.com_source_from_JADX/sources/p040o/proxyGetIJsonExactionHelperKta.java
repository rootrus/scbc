package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.proxyGetIJsonExactionHelperKta */
public final /* synthetic */ class proxyGetIJsonExactionHelperKta implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean IconCompatParcelizer;
    private final /* synthetic */ getZip MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ parseSession MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ proxyGetIJsonExactionHelperKta(boolean z, getZip getzip, parseSession parsesession) {
        this.IconCompatParcelizer = z;
        this.MediaBrowserCompat$CustomActionResultReceiver = getzip;
        this.MediaBrowserCompat$ItemReceiver = parsesession;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.ListMenuItemView) obj).read(this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver);
    }
}
