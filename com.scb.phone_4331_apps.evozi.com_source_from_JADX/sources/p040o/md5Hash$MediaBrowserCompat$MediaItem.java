package p040o;

import p040o.access$2300;

/* renamed from: o.md5Hash$MediaBrowserCompat$MediaItem */
public final class md5Hash$MediaBrowserCompat$MediaItem extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
    private /* synthetic */ md5Hash write;

    public md5Hash$MediaBrowserCompat$MediaItem(md5Hash md5hash) {
        this.write = md5hash;
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }

    public final /* synthetic */ void onNext(Object obj) {
        this.write.MediaBrowserCompat$ItemReceiver();
    }
}
