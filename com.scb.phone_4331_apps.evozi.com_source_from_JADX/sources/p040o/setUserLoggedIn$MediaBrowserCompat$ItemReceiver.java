package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setUserLoggedIn$MediaBrowserCompat$ItemReceiver */
final class setUserLoggedIn$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
    private /* synthetic */ String write;

    setUserLoggedIn$MediaBrowserCompat$ItemReceiver(String str) {
        this.write = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((ExtractionCredentials) obj).write(this.write);
    }
}
