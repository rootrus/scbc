package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.nativeCropImage */
public final /* synthetic */ class nativeCropImage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ nativeGetShadowContours MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String write;

    public /* synthetic */ nativeCropImage(nativeGetShadowContours nativegetshadowcontours, String str) {
        this.MediaBrowserCompat$ItemReceiver = nativegetshadowcontours;
        this.write = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeGetShadowContours nativegetshadowcontours = this.MediaBrowserCompat$ItemReceiver;
        ((getAdditionalRightScanLinesWidth) obj).read(nativegetshadowcontours.write.mo26549c_(this.write));
    }
}
