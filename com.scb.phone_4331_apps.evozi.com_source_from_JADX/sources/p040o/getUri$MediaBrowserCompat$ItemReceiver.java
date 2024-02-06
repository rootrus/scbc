package p040o;

import java.util.List;
import p040o.access$2300;

/* renamed from: o.getUri$MediaBrowserCompat$ItemReceiver */
public final class getUri$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<onInfoWindowLongClick>> {
    final /* synthetic */ getUri MediaBrowserCompat$CustomActionResultReceiver;

    private getUri$MediaBrowserCompat$ItemReceiver(getUri geturi) {
        this.MediaBrowserCompat$CustomActionResultReceiver = geturi;
    }

    public /* synthetic */ getUri$MediaBrowserCompat$ItemReceiver(getUri geturi, byte b) {
        this(geturi);
    }

    public final /* synthetic */ void onNext(Object obj) {
        List list = (List) obj;
        getUri.write(this.MediaBrowserCompat$CustomActionResultReceiver);
        boolean z = true;
        if (!(this.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat != null)) {
            return;
        }
        if (list == null || list.isEmpty()) {
            getUri geturi = this.MediaBrowserCompat$CustomActionResultReceiver;
            createTokenKey createtokenkey = createTokenKey.IconCompatParcelizer;
            if (geturi.RatingCompat == null) {
                z = false;
            }
            if (z) {
                createtokenkey.IconCompatParcelizer(geturi.RatingCompat);
                return;
            }
            return;
        }
        getUri geturi2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        setFirebaseInstallationId setfirebaseinstallationid = new setFirebaseInstallationId(this, list);
        if (geturi2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            setfirebaseinstallationid.IconCompatParcelizer(geturi2.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
