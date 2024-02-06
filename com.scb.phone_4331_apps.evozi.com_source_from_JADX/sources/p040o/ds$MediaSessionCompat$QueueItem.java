package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.ds$MediaSessionCompat$QueueItem */
final class ds$MediaSessionCompat$QueueItem<V> implements writeUInt64NoTag.IconCompatParcelizer<getInnerThrowables> {
    private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;

    ds$MediaSessionCompat$QueueItem(String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.IconCompatParcelizer((Object) str, "json");
        ((getInnerThrowables) obj).MediaBrowserCompat$SearchResultReceiver(str);
    }
}
