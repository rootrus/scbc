package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setUserEmailAddress$MediaBrowserCompat$MediaItem */
public final class setUserEmailAddress$MediaBrowserCompat$MediaItem<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
    private /* synthetic */ boolean write;

    public setUserEmailAddress$MediaBrowserCompat$MediaItem(boolean z) {
        this.write = z;
    }

    public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((IParameters) obj).IconCompatParcelizer(this.write);
    }
}
