package p040o;

/* renamed from: o.KotlinDetector$MediaBrowserCompat$ItemReceiver */
class KotlinDetector$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<constrainedSet> {
    final /* synthetic */ KotlinDetector MediaBrowserCompat$CustomActionResultReceiver;

    private KotlinDetector$MediaBrowserCompat$ItemReceiver(KotlinDetector kotlinDetector) {
        this.MediaBrowserCompat$CustomActionResultReceiver = kotlinDetector;
    }

    /* synthetic */ KotlinDetector$MediaBrowserCompat$ItemReceiver(KotlinDetector kotlinDetector, byte b) {
        this(kotlinDetector);
    }

    public final /* synthetic */ void onNext(Object obj) {
        KotlinDetector kotlinDetector = this.MediaBrowserCompat$CustomActionResultReceiver;
        setContourMode setcontourmode = new setContourMode(this, (constrainedSet) obj);
        if (kotlinDetector.RatingCompat != null) {
            setcontourmode.IconCompatParcelizer(kotlinDetector.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(th, constrainedMultiset.DEEJUNG);
    }

    public final void onComplete() {
        KotlinDetector.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        super.onComplete();
    }
}
