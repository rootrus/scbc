package p040o;

import p040o.access$2300;

/* renamed from: o.SettingsJsonParser$MediaBrowserCompat$ItemReceiver */
public final class SettingsJsonParser$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
    private /* synthetic */ SettingsJsonParser read;

    SettingsJsonParser$MediaBrowserCompat$ItemReceiver(SettingsJsonParser settingsJsonParser) {
        this.read = settingsJsonParser;
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }

    public final /* synthetic */ void onNext(Object obj) {
        SettingsJsonParser.IconCompatParcelizer(this.read);
    }
}
