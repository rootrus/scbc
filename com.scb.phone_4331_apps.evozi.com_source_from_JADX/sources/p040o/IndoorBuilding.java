package p040o;

import p040o.AbstractMultimap;

/* renamed from: o.IndoorBuilding */
public abstract class IndoorBuilding {
    private CloseAccountReviewActivity MediaBrowserCompat$CustomActionResultReceiver;
    private DebitCardResetOtpActivity MediaBrowserCompat$ItemReceiver;
    public HmlBusinessOwnerGenericDeepLinkActivity MediaBrowserCompat$MediaItem = new HmlBusinessOwnerGenericDeepLinkActivity();
    public CloseAccountReviewActivity MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: o.IndoorBuilding$zza */
    public final class zza extends IndoorBuilding {
        public AbstractMultimap.EntryIterator MediaBrowserCompat$ItemReceiver;
        public getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver read;

        @HmlPinActivity
        public zza(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, AbstractMultimap.EntryIterator entryIterator) {
            super(closeAccountReviewActivity, closeAccountReviewActivity2);
            this.read = getsubelementoffsetbytes_mediabrowsercompat_itemreceiver;
            this.MediaBrowserCompat$ItemReceiver = entryIterator;
        }
    }

    public IndoorBuilding(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2) {
        this.MediaBrowserCompat$SearchResultReceiver = closeAccountReviewActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = closeAccountReviewActivity2;
    }

    /* access modifiers changed from: protected */
    public final DebitCardResetOtpActivity write(DebitCardResetOtpActivity debitCardResetOtpActivity) {
        this.MediaBrowserCompat$ItemReceiver = debitCardResetOtpActivity;
        return debitCardResetOtpActivity;
    }

    public final void IconCompatParcelizer(IndoorBuilding$MediaBrowserCompat$ItemReceiver indoorBuilding$MediaBrowserCompat$ItemReceiver) {
        MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver, indoorBuilding$MediaBrowserCompat$ItemReceiver);
    }

    public final <T> void write(DebitCardResetOtpActivity<T> debitCardResetOtpActivity, IndoorBuilding$MediaBrowserCompat$ItemReceiver<T> indoorBuilding$MediaBrowserCompat$ItemReceiver) {
        MediaBrowserCompat$CustomActionResultReceiver(debitCardResetOtpActivity, indoorBuilding$MediaBrowserCompat$ItemReceiver);
    }

    private <T> void MediaBrowserCompat$CustomActionResultReceiver(DebitCardResetOtpActivity<T> debitCardResetOtpActivity, IndoorBuilding$MediaBrowserCompat$ItemReceiver<T> indoorBuilding$MediaBrowserCompat$ItemReceiver) {
        debitCardResetOtpActivity.subscribeOn(this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver).observeOn(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver).doOnSubscribe(new useViewLifecycleWhenInFragment(this)).safeSubscribe(indoorBuilding$MediaBrowserCompat$ItemReceiver);
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (this.MediaBrowserCompat$MediaItem.isDisposed()) {
            this.MediaBrowserCompat$MediaItem = new HmlBusinessOwnerGenericDeepLinkActivity();
        }
        if (bulkTransferDeepLinkActivity != null) {
            this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver(bulkTransferDeepLinkActivity);
        }
    }

    public final <T> void MediaBrowserCompat$ItemReceiver(DebitCardResetOtpActivity<T> debitCardResetOtpActivity, DebitCardMarketConductDeepLinkActivity<T> debitCardMarketConductDeepLinkActivity) {
        MediaBrowserCompat$CustomActionResultReceiver(debitCardResetOtpActivity.subscribeOn(this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver).observeOn(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver).subscribe(debitCardMarketConductDeepLinkActivity));
    }

    public final <T> void read(DebitCardResetOtpActivity<T> debitCardResetOtpActivity, DebitCardMarketConductDeepLinkActivity<T> debitCardMarketConductDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<Throwable> debitCardMarketConductDeepLinkActivity2) {
        MediaBrowserCompat$CustomActionResultReceiver(debitCardResetOtpActivity.subscribeOn(this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver).observeOn(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver).subscribe(debitCardMarketConductDeepLinkActivity, debitCardMarketConductDeepLinkActivity2));
    }
}
