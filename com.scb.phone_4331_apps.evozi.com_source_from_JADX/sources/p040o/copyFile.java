package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.copyFile */
public final /* synthetic */ class copyFile implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getPageID MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ getPageID$MediaBrowserCompat$ItemReceiver read;

    public /* synthetic */ copyFile(getPageID getpageid, getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver) {
        this.MediaBrowserCompat$ItemReceiver = getpageid;
        this.read = getpageid_mediabrowsercompat_itemreceiver;
    }

    public final void IconCompatParcelizer(Object obj) {
        getPageID getpageid = this.MediaBrowserCompat$ItemReceiver;
        getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver = this.read;
        ((getExtractionType) obj).write(getpageid_mediabrowsercompat_itemreceiver, getpageid.MediaSessionCompat$ResultReceiverWrapper.contains(getpageid_mediabrowsercompat_itemreceiver));
    }
}
