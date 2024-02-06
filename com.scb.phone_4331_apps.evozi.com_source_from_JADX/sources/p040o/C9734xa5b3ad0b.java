package p040o;

import p040o.FastPayTransferReviewActivity;

/* renamed from: o.FastPayTransferReviewActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C9734xa5b3ad0b<T, B> extends HmlETBBusinessInformationActivity<B> {
    private FastPayTransferReviewActivity$MediaBrowserCompat$ItemReceiver<T, B, ?> read;

    C9734xa5b3ad0b(FastPayTransferReviewActivity$MediaBrowserCompat$ItemReceiver<T, B, ?> fastPayTransferReviewActivity$MediaBrowserCompat$ItemReceiver) {
        this.read = fastPayTransferReviewActivity$MediaBrowserCompat$ItemReceiver;
    }

    public final void onNext(B b) {
        FastPayTransferReviewActivity$MediaBrowserCompat$ItemReceiver<T, B, ?> fastPayTransferReviewActivity$MediaBrowserCompat$ItemReceiver = this.read;
        fastPayTransferReviewActivity$MediaBrowserCompat$ItemReceiver.write.IconCompatParcelizer(new FastPayTransferReviewActivity.IconCompatParcelizer((HmlETBLoanSetupActivity) null, b));
        if (fastPayTransferReviewActivity$MediaBrowserCompat$ItemReceiver.MediaMetadataCompat.getAndIncrement() == 0) {
            fastPayTransferReviewActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
        }
    }

    public final void onError(Throwable th) {
        FastPayTransferReviewActivity$MediaBrowserCompat$ItemReceiver<T, B, ?> fastPayTransferReviewActivity$MediaBrowserCompat$ItemReceiver = this.read;
        fastPayTransferReviewActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem.dispose();
        fastPayTransferReviewActivity$MediaBrowserCompat$ItemReceiver.RatingCompat.dispose();
        fastPayTransferReviewActivity$MediaBrowserCompat$ItemReceiver.onError(th);
    }

    public final void onComplete() {
        this.read.onComplete();
    }
}
