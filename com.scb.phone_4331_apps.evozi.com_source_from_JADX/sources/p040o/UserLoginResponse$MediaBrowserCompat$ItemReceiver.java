package p040o;

import p040o.access$2300;

/* renamed from: o.UserLoginResponse$MediaBrowserCompat$ItemReceiver */
public final class UserLoginResponse$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Void> {
    private /* synthetic */ UserLoginResponse read;

    public UserLoginResponse$MediaBrowserCompat$ItemReceiver(UserLoginResponse userLoginResponse) {
        this.read = userLoginResponse;
    }

    public final void onComplete() {
        super.onComplete();
        UserLoginResponse.write(this.read);
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        super.onError(th);
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }
}
