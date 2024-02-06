package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getSettings$MediaSessionCompat$ResultReceiverWrapper */
public final class getSettings$MediaSessionCompat$ResultReceiverWrapper<V> implements writeUInt64NoTag.IconCompatParcelizer<gePayeeName> {
    private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;

    public getSettings$MediaSessionCompat$ResultReceiverWrapper(String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((gePayeeName) obj).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, zzwd.GALLERY);
    }
}
