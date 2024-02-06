package p040o;

/* renamed from: o.qT$MediaBrowserCompat$CustomActionResultReceiver */
public final class qT$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Integer> {
    final /* synthetic */ C5174qT IconCompatParcelizer;
    String MediaBrowserCompat$CustomActionResultReceiver;

    public qT$MediaBrowserCompat$CustomActionResultReceiver(C5174qT qTVar, String str) {
        this.IconCompatParcelizer = qTVar;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void onComplete() {
        C5174qT.write(this.IconCompatParcelizer);
        C5174qT.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer);
    }

    public final void onError(Throwable th) {
        boolean z = true;
        if ((this.IconCompatParcelizer.RatingCompat != null) && !this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver(th)) {
            C5174qT.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
            C5174qT.read(this.IconCompatParcelizer);
            C5174qT qTVar = this.IconCompatParcelizer;
            getRedCircle getredcircle = new getRedCircle(this, th);
            if (qTVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getredcircle.IconCompatParcelizer(qTVar.RatingCompat);
            }
        }
    }

    public final /* synthetic */ void onNext(Object obj) {
        boolean z = true;
        if (this.IconCompatParcelizer.RatingCompat != null) {
            C5174qT qTVar = this.IconCompatParcelizer;
            getGreenCircle getgreencircle = new getGreenCircle(this);
            if (qTVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getgreencircle.IconCompatParcelizer(qTVar.RatingCompat);
            }
        }
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.setPadding();
    }
}
