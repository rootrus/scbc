package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.SettingsJsonParser$MediaBrowserCompat$SearchResultReceiver */
public final class SettingsJsonParser$MediaBrowserCompat$SearchResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<getLAR> {
    private /* synthetic */ String read;

    public SettingsJsonParser$MediaBrowserCompat$SearchResultReceiver(String str) {
        this.read = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((getLAR) obj).write(this.read);
    }
}
