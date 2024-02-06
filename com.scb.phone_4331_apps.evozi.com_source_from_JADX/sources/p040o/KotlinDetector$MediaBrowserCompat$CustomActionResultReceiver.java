package p040o;

import p040o.zzfy;

/* renamed from: o.KotlinDetector$MediaBrowserCompat$CustomActionResultReceiver */
public class KotlinDetector$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzfy.zzb> {
    final /* synthetic */ KotlinDetector IconCompatParcelizer;

    private KotlinDetector$MediaBrowserCompat$CustomActionResultReceiver(KotlinDetector kotlinDetector) {
        this.IconCompatParcelizer = kotlinDetector;
    }

    public /* synthetic */ KotlinDetector$MediaBrowserCompat$CustomActionResultReceiver(KotlinDetector kotlinDetector, byte b) {
        this(kotlinDetector);
    }

    public final /* synthetic */ void onNext(Object obj) {
        zzfy.zzb zzb = (zzfy.zzb) obj;
        KotlinDetector kotlinDetector = this.IconCompatParcelizer;
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar = GlobalLibraryVersionRegistrar.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = true;
        if (kotlinDetector.RatingCompat != null) {
            globalLibraryVersionRegistrar.IconCompatParcelizer(kotlinDetector.RatingCompat);
        }
        if (zzb.read != null && !zzb.read.isEmpty()) {
            KotlinDetector kotlinDetector2 = this.IconCompatParcelizer;
            setLandmarkMode setlandmarkmode = new setLandmarkMode(zzb);
            if (kotlinDetector2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setlandmarkmode.IconCompatParcelizer(kotlinDetector2.RatingCompat);
            }
        }
    }

    public final void onError(Throwable th) {
        KotlinDetector kotlinDetector = this.IconCompatParcelizer;
        FirebaseVisionFaceLandmark firebaseVisionFaceLandmark = FirebaseVisionFaceLandmark.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = true;
        if (kotlinDetector.RatingCompat != null) {
            firebaseVisionFaceLandmark.IconCompatParcelizer(kotlinDetector.RatingCompat);
        }
        if (!this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver(th)) {
            KotlinDetector kotlinDetector2 = this.IconCompatParcelizer;
            enableTracking enabletracking = new enableTracking(this, th);
            if (kotlinDetector2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                enabletracking.IconCompatParcelizer(kotlinDetector2.RatingCompat);
            }
        }
        boolean unused = this.IconCompatParcelizer.MediaMetadataCompat = false;
        String unused2 = this.IconCompatParcelizer.MediaDescriptionCompat = "";
    }

    static /* synthetic */ void read(getAddress5 getaddress5) {
        getaddress5.MediaSessionCompat$Token();
        getaddress5.IconCompatParcelizer();
        getaddress5.setPadding();
        getaddress5.setItemInvoker();
        getaddress5.MediaSessionCompat$ResultReceiverWrapper();
    }

    public final void onComplete() {
        KotlinDetector.MediaDescriptionCompat(this.IconCompatParcelizer);
    }
}
