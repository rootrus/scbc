package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.SettingsController$MediaSessionCompat$QueueItem */
public final class SettingsController$MediaSessionCompat$QueueItem<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopRightCornerHeight> {
    private /* synthetic */ SettingsController read;

    public SettingsController$MediaSessionCompat$QueueItem(SettingsController settingsController) {
        this.read = settingsController;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((getTopRightCornerHeight) obj).IconCompatParcelizer(SettingsController.MediaBrowserCompat$CustomActionResultReceiver(this.read), SettingsController.write(this.read));
    }
}
