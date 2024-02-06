package p040o;

import p040o.onBackImageProcessed;
import p040o.writeUInt64NoTag;

/* renamed from: o.getTaskID$MediaBrowserCompat$ItemReceiver */
public final class getTaskID$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<onBackImageProcessed.read> {
    private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;

    public getTaskID$MediaBrowserCompat$ItemReceiver(String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((onBackImageProcessed.read) obj).read(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
