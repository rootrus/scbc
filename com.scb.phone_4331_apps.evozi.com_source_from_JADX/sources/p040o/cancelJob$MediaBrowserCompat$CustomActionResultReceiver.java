package p040o;

import p040o.access$2300;

/* renamed from: o.cancelJob$MediaBrowserCompat$CustomActionResultReceiver */
public final class cancelJob$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getExpirationTime> {
    final /* synthetic */ cancelJob MediaBrowserCompat$CustomActionResultReceiver;

    private cancelJob$MediaBrowserCompat$CustomActionResultReceiver(cancelJob canceljob) {
        this.MediaBrowserCompat$CustomActionResultReceiver = canceljob;
    }

    public /* synthetic */ cancelJob$MediaBrowserCompat$CustomActionResultReceiver(cancelJob canceljob, byte b) {
        this(canceljob);
    }

    public final void onComplete() {
        cancelJob.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void onError(Throwable th) {
        cancelJob.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        if (!this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver(th)) {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    public final /* synthetic */ void onNext(Object obj) {
        cancelJob canceljob = this.MediaBrowserCompat$CustomActionResultReceiver;
        getCertificateValidatorListener getcertificatevalidatorlistener = new getCertificateValidatorListener(this);
        if (canceljob.RatingCompat != null) {
            getcertificatevalidatorlistener.IconCompatParcelizer(canceljob.RatingCompat);
        }
    }
}
