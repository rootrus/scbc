package p040o;

import java.util.concurrent.atomic.AtomicReference;
import p039io.reactivex.exceptions.CompositeException;
import p040o.AlertController$RecycleListView;

/* renamed from: o.MutualFundsDiscoverDeepLinkActivity */
public final class MutualFundsDiscoverDeepLinkActivity<T> extends AtomicReference<BulkTransferDeepLinkActivity> implements ActivateChequeDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private DebitCardMarketConductDeepLinkActivity<? super Throwable> IconCompatParcelizer;
    private DebitCardMarketConductDeepLinkActivity<? super T> read;

    public MutualFundsDiscoverDeepLinkActivity(DebitCardMarketConductDeepLinkActivity<? super T> debitCardMarketConductDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super Throwable> debitCardMarketConductDeepLinkActivity2) {
        this.read = debitCardMarketConductDeepLinkActivity;
        this.IconCompatParcelizer = debitCardMarketConductDeepLinkActivity2;
    }

    public final void onError(Throwable th) {
        lazySet(HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED);
        try {
            this.IconCompatParcelizer.IconCompatParcelizer(th);
        } catch (Throwable th2) {
            AlertController$RecycleListView.read.write(th2);
            AlertController$RecycleListView.read.read((Throwable) new CompositeException(th, th2));
        }
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(T t) {
        lazySet(HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED);
        try {
            this.read.IconCompatParcelizer(t);
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            AlertController$RecycleListView.read.read(th);
        }
    }

    public final void dispose() {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
    }

    public final boolean isDisposed() {
        return get() == HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
    }
}
