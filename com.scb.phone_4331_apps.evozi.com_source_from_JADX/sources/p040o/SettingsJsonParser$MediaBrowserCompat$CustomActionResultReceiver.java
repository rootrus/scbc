package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.SettingsJsonParser$MediaBrowserCompat$CustomActionResultReceiver */
public final class SettingsJsonParser$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<getLAR> {
    private /* synthetic */ SettingsJsonParser MediaBrowserCompat$CustomActionResultReceiver;

    public SettingsJsonParser$MediaBrowserCompat$CustomActionResultReceiver(SettingsJsonParser settingsJsonParser) {
        this.MediaBrowserCompat$CustomActionResultReceiver = settingsJsonParser;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        String MediaBrowserCompat$CustomActionResultReceiver2 = SettingsJsonParser.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        int unused = this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$QueueItem;
        ((getLAR) obj).read(MediaBrowserCompat$CustomActionResultReceiver2);
    }
}
