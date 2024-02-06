package p040o;

import p040o.zzbt;

/* renamed from: o.IsgMrzDocumentDetector$MediaBrowserCompat$ItemReceiver */
public class IsgMrzDocumentDetector$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzbt.zzc> {
    final /* synthetic */ IsgMrzDocumentDetector write;

    public IsgMrzDocumentDetector$MediaBrowserCompat$ItemReceiver(IsgMrzDocumentDetector isgMrzDocumentDetector) {
        this.write = isgMrzDocumentDetector;
    }

    public final /* synthetic */ void onNext(Object obj) {
        zzbt.zzc zzc = (zzbt.zzc) obj;
        super.onNext(zzc);
        IsgMrzDocumentDetector isgMrzDocumentDetector = this.write;
        processProgress processprogress = new processProgress(this, zzc);
        if (isgMrzDocumentDetector.RatingCompat != null) {
            processprogress.IconCompatParcelizer(isgMrzDocumentDetector.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        super.onError(th);
        IsgMrzDocumentDetector isgMrzDocumentDetector = this.write;
        onTaskCompleted ontaskcompleted = new onTaskCompleted(this, th);
        if (isgMrzDocumentDetector.RatingCompat != null) {
            ontaskcompleted.IconCompatParcelizer(isgMrzDocumentDetector.RatingCompat);
        }
    }
}
