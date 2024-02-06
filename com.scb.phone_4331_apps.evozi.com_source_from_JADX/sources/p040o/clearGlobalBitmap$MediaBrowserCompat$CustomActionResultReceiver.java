package p040o;

import p040o.access$2300;

/* renamed from: o.clearGlobalBitmap$MediaBrowserCompat$CustomActionResultReceiver */
final class clearGlobalBitmap$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<AddPlaceRequest> {
    final /* synthetic */ clearGlobalBitmap MediaBrowserCompat$ItemReceiver;
    private LocationAvailability read;

    public final /* synthetic */ void onNext(Object obj) {
        String str;
        AddPlaceRequest addPlaceRequest = (AddPlaceRequest) obj;
        boolean z = true;
        if (this.MediaBrowserCompat$ItemReceiver.RatingCompat != null) {
            clearGlobalBitmap.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
            createColumnKeyIterator MediaBrowserCompat$SearchResultReceiver = this.MediaBrowserCompat$ItemReceiver.AlertController$RecycleListView;
            LocationAvailability locationAvailability = this.read;
            EmptyImmutableList IconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver.Keep;
            InstallIdProvider MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem;
            if (this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token.MediaMetadataCompat != null) {
                str = this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token.MediaMetadataCompat.IconCompatParcelizer;
            } else {
                str = "";
            }
            getOsBuildVersionString IconCompatParcelizer2 = MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(locationAvailability, addPlaceRequest, IconCompatParcelizer, MediaBrowserCompat$CustomActionResultReceiver, str, this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver, this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer.setItemInvoker());
            if (IconCompatParcelizer2.MediaSessionCompat$ResultReceiverWrapper() && IconCompatParcelizer2.PlaybackStateCompat$CustomAction != null && IconCompatParcelizer2.AlertController$RecycleListView != null) {
                clearGlobalBitmap clearglobalbitmap = this.MediaBrowserCompat$ItemReceiver;
                C9859au auVar = new C9859au(this, IconCompatParcelizer2, addPlaceRequest);
                if (clearglobalbitmap.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    auVar.IconCompatParcelizer(clearglobalbitmap.RatingCompat);
                }
            } else if (IconCompatParcelizer2.MediaMetadataCompat() == null || IconCompatParcelizer2.MediaMetadataCompat().isEmpty()) {
                this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2);
            } else {
                this.MediaBrowserCompat$ItemReceiver.write(IconCompatParcelizer2);
            }
        }
    }

    clearGlobalBitmap$MediaBrowserCompat$CustomActionResultReceiver(clearGlobalBitmap clearglobalbitmap, LocationAvailability locationAvailability) {
        this.MediaBrowserCompat$ItemReceiver = clearglobalbitmap;
        this.read = locationAvailability;
    }

    public final void onComplete() {
        clearGlobalBitmap.AlertController$RecycleListView(this.MediaBrowserCompat$ItemReceiver);
    }

    public final void onError(Throwable th) {
        if ((this.MediaBrowserCompat$ItemReceiver.RatingCompat != null) && !this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver(th)) {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }
}
