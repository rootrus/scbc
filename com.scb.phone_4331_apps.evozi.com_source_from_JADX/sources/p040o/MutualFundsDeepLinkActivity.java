package p040o;

import java.util.concurrent.atomic.AtomicReference;
import p039io.reactivex.exceptions.OnErrorNotImplementedException;
import p040o.AlertController$RecycleListView;

/* renamed from: o.MutualFundsDeepLinkActivity */
public final class MutualFundsDeepLinkActivity extends AtomicReference<BulkTransferDeepLinkActivity> implements DebitCardRequestInputActivity, BulkTransferDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<Throwable> {
    private DataPrivacyManagementDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;
    private DebitCardMarketConductDeepLinkActivity<? super Throwable> MediaBrowserCompat$ItemReceiver;

    public final /* synthetic */ void IconCompatParcelizer(Object obj) throws Exception {
        AlertController$RecycleListView.read.read((Throwable) new OnErrorNotImplementedException((Throwable) obj));
    }

    public MutualFundsDeepLinkActivity(DebitCardMarketConductDeepLinkActivity<? super Throwable> debitCardMarketConductDeepLinkActivity, DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity) {
        this.MediaBrowserCompat$ItemReceiver = debitCardMarketConductDeepLinkActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = dataPrivacyManagementDeepLinkActivity;
    }

    public final void onComplete() {
        try {
            this.MediaBrowserCompat$CustomActionResultReceiver.read();
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            AlertController$RecycleListView.read.read(th);
        }
        lazySet(HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED);
    }

    public final void onError(Throwable th) {
        try {
            this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(th);
        } catch (Throwable th2) {
            AlertController$RecycleListView.read.write(th2);
            AlertController$RecycleListView.read.read(th2);
        }
        lazySet(HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED);
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity);
    }

    public final void dispose() {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
    }

    public final boolean isDisposed() {
        return get() == HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
    }
}
