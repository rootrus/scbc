package p040o;

import p040o.access$2300;

/* renamed from: o.AutoValue_InstallationResponse$MediaBrowserCompat$CustomActionResultReceiver */
public final class C9663x57af7285 extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
    private /* synthetic */ AutoValue_InstallationResponse write;

    private C9663x57af7285(AutoValue_InstallationResponse autoValue_InstallationResponse) {
        this.write = autoValue_InstallationResponse;
    }

    public /* synthetic */ C9663x57af7285(AutoValue_InstallationResponse autoValue_InstallationResponse, byte b) {
        this(autoValue_InstallationResponse);
    }

    public final void onError(Throwable th) {
        AutoValue_InstallationResponse autoValue_InstallationResponse = this.write;
        autoValue_InstallationResponse.MediaBrowserCompat$ItemReceiver(autoValue_InstallationResponse.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(th, access$2300.write.JUST_DISMISS));
    }

    public final /* synthetic */ void onNext(Object obj) {
        boolean z = false;
        this.write.MediaBrowserCompat$ItemReceiver = false;
        AutoValue_InstallationResponse.MediaBrowserCompat$ItemReceiver(this.write);
        AutoValue_InstallationResponse autoValue_InstallationResponse = this.write;
        Registrar registrar = Registrar.read;
        if (autoValue_InstallationResponse.RatingCompat != null) {
            z = true;
        }
        if (z) {
            registrar.IconCompatParcelizer(autoValue_InstallationResponse.RatingCompat);
        }
    }
}
