package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.SessionProtobufHelper$MediaBrowserCompat$ItemReceiver */
public final class SessionProtobufHelper$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<getCheckIQAData> {
    private /* synthetic */ String MediaBrowserCompat$ItemReceiver;

    public SessionProtobufHelper$MediaBrowserCompat$ItemReceiver(String str) {
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((getCheckIQAData) obj).read(this.MediaBrowserCompat$ItemReceiver);
    }
}
