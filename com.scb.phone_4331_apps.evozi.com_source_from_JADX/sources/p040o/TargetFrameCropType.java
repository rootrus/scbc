package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.TargetFrameCropType */
public final /* synthetic */ class TargetFrameCropType implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getPageID$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ TargetFrameCropType(getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getpageid_mediabrowsercompat_itemreceiver;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getExtractionType) obj).read(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
