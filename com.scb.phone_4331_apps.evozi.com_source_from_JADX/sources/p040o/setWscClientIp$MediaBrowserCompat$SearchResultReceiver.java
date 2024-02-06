package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setWscClientIp$MediaBrowserCompat$SearchResultReceiver */
public final class setWscClientIp$MediaBrowserCompat$SearchResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<getIPassportDetector> {
    private /* synthetic */ String read;
    private /* synthetic */ String write;

    public setWscClientIp$MediaBrowserCompat$SearchResultReceiver(String str, String str2) {
        this.read = str;
        this.write = str2;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((getIPassportDetector) obj).write(this.read, this.write);
    }
}
