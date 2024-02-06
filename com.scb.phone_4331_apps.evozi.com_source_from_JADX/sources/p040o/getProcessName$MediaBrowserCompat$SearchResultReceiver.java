package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getProcessName$MediaBrowserCompat$SearchResultReceiver */
public final class getProcessName$MediaBrowserCompat$SearchResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<onFaceExtracted> {
    private /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;

    public getProcessName$MediaBrowserCompat$SearchResultReceiver(boolean z) {
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((onFaceExtracted) obj).read(this.MediaBrowserCompat$ItemReceiver);
    }
}
