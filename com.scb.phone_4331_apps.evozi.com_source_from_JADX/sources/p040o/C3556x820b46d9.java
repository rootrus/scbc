package p040o;

import java.util.List;
import p040o.StreetViewPanorama;

/* renamed from: o.JsonReaderInternalAccess$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3556x820b46d9 extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<StreetViewPanorama.OnStreetViewPanoramaLongClickListener>> {
    private /* synthetic */ JsonReaderInternalAccess MediaBrowserCompat$ItemReceiver;

    private C3556x820b46d9(JsonReaderInternalAccess jsonReaderInternalAccess) {
        this.MediaBrowserCompat$ItemReceiver = jsonReaderInternalAccess;
    }

    public /* synthetic */ C3556x820b46d9(JsonReaderInternalAccess jsonReaderInternalAccess, byte b) {
        this(jsonReaderInternalAccess);
    }

    public final /* synthetic */ void onNext(Object obj) {
        JsonReaderInternalAccess jsonReaderInternalAccess = this.MediaBrowserCompat$ItemReceiver;
        getMajorJavaVersion getmajorjavaversion = new getMajorJavaVersion((List) obj);
        if (jsonReaderInternalAccess.RatingCompat != null) {
            getmajorjavaversion.IconCompatParcelizer(jsonReaderInternalAccess.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        super.MediaBrowserCompat$ItemReceiver();
        JsonReaderInternalAccess.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver);
    }

    public final void onComplete() {
        JsonReaderInternalAccess.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
    }

    public final void onError(Throwable th) {
        JsonReaderInternalAccess.write(this.MediaBrowserCompat$ItemReceiver);
        JsonReaderInternalAccess jsonReaderInternalAccess = this.MediaBrowserCompat$ItemReceiver;
        determineMajorJavaVersion determinemajorjavaversion = determineMajorJavaVersion.write;
        if (jsonReaderInternalAccess.RatingCompat != null) {
            determinemajorjavaversion.IconCompatParcelizer(jsonReaderInternalAccess.RatingCompat);
        }
    }
}
