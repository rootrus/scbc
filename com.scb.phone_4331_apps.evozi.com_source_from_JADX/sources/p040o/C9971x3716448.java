package p040o;

import p040o.access$2300;

/* renamed from: o.getIExtractionServerKta$MediaBrowserCompat$CustomActionResultReceiver */
public final class C9971x3716448 extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setTiltGesturesEnabled> {
    private /* synthetic */ getIExtractionServerKta MediaBrowserCompat$ItemReceiver;

    public final void onComplete() {
    }

    private C9971x3716448(getIExtractionServerKta getiextractionserverkta) {
        this.MediaBrowserCompat$ItemReceiver = getiextractionserverkta;
    }

    public /* synthetic */ C9971x3716448(getIExtractionServerKta getiextractionserverkta, byte b) {
        this(getiextractionserverkta);
    }

    public final /* synthetic */ void onNext(Object obj) {
        boolean z = false;
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = false;
        getIExtractionServerKta getiextractionserverkta = this.MediaBrowserCompat$ItemReceiver;
        SignedBytes unused = getiextractionserverkta.ParcelableVolumeInfo;
        notifyFailed unused2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem;
        setUuidFromUtf8Bytes unused3 = getiextractionserverkta.IconCompatParcelizer = SignedBytes.MediaBrowserCompat$CustomActionResultReceiver(notifyFailed.read((setTiltGesturesEnabled) obj), this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver, this.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat.IconCompatParcelizer());
        getIExtractionServerKta getiextractionserverkta2 = this.MediaBrowserCompat$ItemReceiver;
        getResultKey getresultkey = new getResultKey(getiextractionserverkta2);
        if (getiextractionserverkta2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            getresultkey.IconCompatParcelizer(getiextractionserverkta2.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
