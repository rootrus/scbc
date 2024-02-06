package p040o;

import p040o.access$2300;

/* renamed from: o.clearGlobalBitmap$MediaBrowserCompat$ItemReceiver */
final class clearGlobalBitmap$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getLatLng> {
    final /* synthetic */ clearGlobalBitmap MediaBrowserCompat$ItemReceiver;

    private clearGlobalBitmap$MediaBrowserCompat$ItemReceiver(clearGlobalBitmap clearglobalbitmap) {
        this.MediaBrowserCompat$ItemReceiver = clearglobalbitmap;
    }

    /* synthetic */ clearGlobalBitmap$MediaBrowserCompat$ItemReceiver(clearGlobalBitmap clearglobalbitmap, byte b) {
        this(clearglobalbitmap);
    }

    public final /* synthetic */ void onNext(Object obj) {
        getLatLng getlatlng = (getLatLng) obj;
        boolean z = true;
        if (this.MediaBrowserCompat$ItemReceiver.RatingCompat != null) {
            clearGlobalBitmap clearglobalbitmap = this.MediaBrowserCompat$ItemReceiver;
            ImageCaptureView_MembersInjector imageCaptureView_MembersInjector = new ImageCaptureView_MembersInjector(this, getlatlng);
            if (clearglobalbitmap.RatingCompat == null) {
                z = false;
            }
            if (z) {
                imageCaptureView_MembersInjector.IconCompatParcelizer(clearglobalbitmap.RatingCompat);
            }
            clearGlobalBitmap.ParcelableVolumeInfo(this.MediaBrowserCompat$ItemReceiver);
        }
    }

    public final void onComplete() {
        clearGlobalBitmap.MediaSessionCompat$Token(this.MediaBrowserCompat$ItemReceiver);
    }

    public final void onError(Throwable th) {
        if ((this.MediaBrowserCompat$ItemReceiver.RatingCompat != null) && !this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver(th)) {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }
}
