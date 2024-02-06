package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.ImageProcessorConfiguration */
public final /* synthetic */ class ImageProcessorConfiguration implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getPageID$MediaBrowserCompat$ItemReceiver write;

    public /* synthetic */ ImageProcessorConfiguration(getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver) {
        this.write = getpageid_mediabrowsercompat_itemreceiver;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getExtractionType) obj).MediaBrowserCompat$ItemReceiver(this.write);
    }
}
