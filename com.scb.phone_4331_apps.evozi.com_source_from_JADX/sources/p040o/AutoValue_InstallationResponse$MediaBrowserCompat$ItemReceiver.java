package p040o;

import p040o.access$2300;

/* renamed from: o.AutoValue_InstallationResponse$MediaBrowserCompat$ItemReceiver */
public final class AutoValue_InstallationResponse$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
    final /* synthetic */ AutoValue_InstallationResponse MediaBrowserCompat$CustomActionResultReceiver;
    private String MediaBrowserCompat$ItemReceiver;

    public AutoValue_InstallationResponse$MediaBrowserCompat$ItemReceiver(AutoValue_InstallationResponse autoValue_InstallationResponse, String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = autoValue_InstallationResponse;
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final void onError(Throwable th) {
        AutoValue_InstallationResponse autoValue_InstallationResponse = this.MediaBrowserCompat$CustomActionResultReceiver;
        isUnregistered isunregistered = isUnregistered.MediaBrowserCompat$CustomActionResultReceiver;
        if (autoValue_InstallationResponse.RatingCompat != null) {
            isunregistered.IconCompatParcelizer(autoValue_InstallationResponse.RatingCompat);
        }
        AutoValue_InstallationResponse autoValue_InstallationResponse2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        autoValue_InstallationResponse2.MediaBrowserCompat$ItemReceiver(autoValue_InstallationResponse2.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(th, access$2300.write.JUST_DISMISS));
    }

    public final /* synthetic */ void onNext(Object obj) {
        AutoValue_InstallationResponse autoValue_InstallationResponse = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str = this.MediaBrowserCompat$ItemReceiver;
        if (str == null) {
            str = "";
        }
        autoValue_InstallationResponse.IconCompatParcelizer = str;
        boolean z = false;
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = false;
        AutoValue_InstallationResponse.read(this.MediaBrowserCompat$CustomActionResultReceiver);
        AutoValue_InstallationResponse autoValue_InstallationResponse2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        getTokenCreationEpochInSecs gettokencreationepochinsecs = new getTokenCreationEpochInSecs(this);
        if (autoValue_InstallationResponse2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            gettokencreationepochinsecs.IconCompatParcelizer(autoValue_InstallationResponse2.RatingCompat);
        }
    }
}
