package p040o;

import p040o.access$2300;

/* renamed from: o.isRegistered$MediaBrowserCompat$ItemReceiver */
public final class isRegistered$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
    private /* synthetic */ isRegistered read;

    private isRegistered$MediaBrowserCompat$ItemReceiver(isRegistered isregistered) {
        this.read = isregistered;
    }

    public /* synthetic */ isRegistered$MediaBrowserCompat$ItemReceiver(isRegistered isregistered, byte b) {
        this(isregistered);
    }

    public final void onError(Throwable th) {
        isRegistered isregistered = this.read;
        isregistered.MediaBrowserCompat$ItemReceiver(isregistered.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(th, access$2300.write.JUST_DISMISS));
    }

    public final /* synthetic */ void onNext(Object obj) {
        isRegistered.write(this.read);
        isRegistered isregistered = this.read;
        InstanceIdResult instanceIdResult = InstanceIdResult.MediaBrowserCompat$ItemReceiver;
        if (isregistered.RatingCompat != null) {
            instanceIdResult.IconCompatParcelizer(isregistered.RatingCompat);
        }
    }
}
