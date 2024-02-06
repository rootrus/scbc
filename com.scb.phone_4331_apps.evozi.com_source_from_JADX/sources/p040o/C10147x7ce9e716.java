package p040o;

/* renamed from: o.setImageOutListener$MediaBrowserCompat$CustomActionResultReceiver */
final class C10147x7ce9e716 extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Integer> {
    final /* synthetic */ setImageOutListener MediaBrowserCompat$ItemReceiver;
    String write;

    C10147x7ce9e716(setImageOutListener setimageoutlistener, String str) {
        this.MediaBrowserCompat$ItemReceiver = setimageoutlistener;
        this.write = str;
    }

    public final void onComplete() {
        setImageOutListener.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
        setImageOutListener.write(this.MediaBrowserCompat$ItemReceiver);
    }

    public final void onError(Throwable th) {
        boolean z = true;
        if ((this.MediaBrowserCompat$ItemReceiver.RatingCompat != null) && !this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver(th)) {
            setImageOutListener.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
            setImageOutListener.read(this.MediaBrowserCompat$ItemReceiver);
            setImageOutListener setimageoutlistener = this.MediaBrowserCompat$ItemReceiver;
            onExitButtonClick onexitbuttonclick = new onExitButtonClick(this, th);
            if (setimageoutlistener.RatingCompat == null) {
                z = false;
            }
            if (z) {
                onexitbuttonclick.IconCompatParcelizer(setimageoutlistener.RatingCompat);
            }
        }
    }

    public final /* synthetic */ void onNext(Object obj) {
        boolean z = true;
        if (this.MediaBrowserCompat$ItemReceiver.RatingCompat != null) {
            setImageOutListener setimageoutlistener = this.MediaBrowserCompat$ItemReceiver;
            IReviewImageMenuListener iReviewImageMenuListener = new IReviewImageMenuListener(this);
            if (setimageoutlistener.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iReviewImageMenuListener.IconCompatParcelizer(setimageoutlistener.RatingCompat);
            }
        }
        this.MediaBrowserCompat$ItemReceiver.write.MediaBrowserCompat$CustomActionResultReceiver.setPadding();
    }
}
