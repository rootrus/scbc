package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.SettingsJsonParser$MediaBrowserCompat$MediaItem */
public final class SettingsJsonParser$MediaBrowserCompat$MediaItem<V> implements writeUInt64NoTag.IconCompatParcelizer<getLAR> {
    private /* synthetic */ SettingsJsonParser read;

    public SettingsJsonParser$MediaBrowserCompat$MediaItem(SettingsJsonParser settingsJsonParser) {
        this.read = settingsJsonParser;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((getLAR) obj).MediaBrowserCompat$CustomActionResultReceiver(SettingsJsonParser.MediaBrowserCompat$CustomActionResultReceiver(this.read), this.read.MediaSessionCompat$QueueItem);
    }
}
