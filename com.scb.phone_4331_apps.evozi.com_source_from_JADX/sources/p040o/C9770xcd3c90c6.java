package p040o;

import p040o.access$2300;

/* renamed from: o.IsgMrzDocumentDetector$MediaBrowserCompat$CustomActionResultReceiver */
class C9770xcd3c90c6 extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<isDataCollectionEnabled> {
    final /* synthetic */ IsgMrzDocumentDetector IconCompatParcelizer;

    private C9770xcd3c90c6(IsgMrzDocumentDetector isgMrzDocumentDetector) {
        this.IconCompatParcelizer = isgMrzDocumentDetector;
    }

    /* synthetic */ C9770xcd3c90c6(IsgMrzDocumentDetector isgMrzDocumentDetector, byte b) {
        this(isgMrzDocumentDetector);
    }

    public final /* synthetic */ void onNext(Object obj) {
        IsgMrzDocumentDetector.write(this.IconCompatParcelizer);
        IsgMrzDocumentDetector isgMrzDocumentDetector = this.IconCompatParcelizer;
        C10110q qVar = new C10110q(this, (isDataCollectionEnabled) obj);
        if (isgMrzDocumentDetector.RatingCompat != null) {
            qVar.IconCompatParcelizer(isgMrzDocumentDetector.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
