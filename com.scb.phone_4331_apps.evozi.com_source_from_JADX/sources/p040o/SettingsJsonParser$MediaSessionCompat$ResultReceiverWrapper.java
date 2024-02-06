package p040o;

/* renamed from: o.SettingsJsonParser$MediaSessionCompat$ResultReceiverWrapper */
public final class SettingsJsonParser$MediaSessionCompat$ResultReceiverWrapper implements Runnable {
    private /* synthetic */ SettingsJsonParser MediaBrowserCompat$CustomActionResultReceiver;

    public SettingsJsonParser$MediaSessionCompat$ResultReceiverWrapper(SettingsJsonParser settingsJsonParser) {
        this.MediaBrowserCompat$CustomActionResultReceiver = settingsJsonParser;
    }

    public final void run() {
        this.MediaBrowserCompat$CustomActionResultReceiver.read();
    }
}
