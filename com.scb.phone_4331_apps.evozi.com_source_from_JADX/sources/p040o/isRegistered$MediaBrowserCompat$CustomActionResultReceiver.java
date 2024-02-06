package p040o;

import java.util.List;
import p040o.PersistedInstallation;
import p040o.zzdy;

/* renamed from: o.isRegistered$MediaBrowserCompat$CustomActionResultReceiver */
public final class isRegistered$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<zzdy.zze>> {
    final /* synthetic */ isRegistered MediaBrowserCompat$CustomActionResultReceiver;

    private isRegistered$MediaBrowserCompat$CustomActionResultReceiver(isRegistered isregistered) {
        this.MediaBrowserCompat$CustomActionResultReceiver = isregistered;
    }

    public /* synthetic */ isRegistered$MediaBrowserCompat$CustomActionResultReceiver(isRegistered isregistered, byte b) {
        this(isregistered);
    }

    public final /* synthetic */ void onNext(Object obj) {
        List list = (List) obj;
        isRegistered isregistered = this.MediaBrowserCompat$CustomActionResultReceiver;
        PersistedInstallation.RegistrationStatus registrationStatus = PersistedInstallation.RegistrationStatus.MediaBrowserCompat$ItemReceiver;
        boolean z = true;
        if (isregistered.RatingCompat != null) {
            registrationStatus.IconCompatParcelizer(isregistered.RatingCompat);
        }
        isRegistered isregistered2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        getTokenCreationTimestamp gettokencreationtimestamp = new getTokenCreationTimestamp(this, list);
        if (isregistered2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            gettokencreationtimestamp.IconCompatParcelizer(isregistered2.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        isRegistered isregistered = this.MediaBrowserCompat$CustomActionResultReceiver;
        PersistedInstallation.RegistrationStatus registrationStatus = PersistedInstallation.RegistrationStatus.MediaBrowserCompat$ItemReceiver;
        boolean z = true;
        if (isregistered.RatingCompat != null) {
            registrationStatus.IconCompatParcelizer(isregistered.RatingCompat);
        }
        isRegistered isregistered2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        createRandomFid createrandomfid = createRandomFid.read;
        if (isregistered2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            createrandomfid.IconCompatParcelizer(isregistered2.RatingCompat);
        }
    }
}
