package p040o;

import java.util.concurrent.atomic.AtomicReference;
import p039io.reactivex.exceptions.CompositeException;
import p040o.AlertController$RecycleListView;

/* renamed from: o.OpenAccountEtbNoActiveCasaDeepLinkActivity */
public final class OpenAccountEtbNoActiveCasaDeepLinkActivity<T> extends AtomicReference<BulkTransferDeepLinkActivity> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private DebitCardMarketConductDeepLinkActivity<? super T> MediaBrowserCompat$CustomActionResultReceiver;
    private DataPrivacyManagementDeepLinkActivity MediaBrowserCompat$ItemReceiver;
    private DebitCardMarketConductDeepLinkActivity<? super BulkTransferDeepLinkActivity> read;
    private DebitCardMarketConductDeepLinkActivity<? super Throwable> write;

    public OpenAccountEtbNoActiveCasaDeepLinkActivity(DebitCardMarketConductDeepLinkActivity<? super T> debitCardMarketConductDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super Throwable> debitCardMarketConductDeepLinkActivity2, DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super BulkTransferDeepLinkActivity> debitCardMarketConductDeepLinkActivity3) {
        this.MediaBrowserCompat$CustomActionResultReceiver = debitCardMarketConductDeepLinkActivity;
        this.write = debitCardMarketConductDeepLinkActivity2;
        this.MediaBrowserCompat$ItemReceiver = dataPrivacyManagementDeepLinkActivity;
        this.read = debitCardMarketConductDeepLinkActivity3;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity)) {
            try {
                this.read.IconCompatParcelizer(this);
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                bulkTransferDeepLinkActivity.dispose();
                onError(th);
            }
        }
    }

    public final void onNext(T t) {
        if (!isDisposed()) {
            try {
                this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(t);
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                ((BulkTransferDeepLinkActivity) get()).dispose();
                onError(th);
            }
        }
    }

    public final void onError(Throwable th) {
        if (!isDisposed()) {
            lazySet(HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED);
            try {
                this.write.IconCompatParcelizer(th);
            } catch (Throwable th2) {
                AlertController$RecycleListView.read.write(th2);
                AlertController$RecycleListView.read.read((Throwable) new CompositeException(th, th2));
            }
        } else {
            AlertController$RecycleListView.read.read(th);
        }
    }

    public final void onComplete() {
        if (!isDisposed()) {
            lazySet(HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED);
            try {
                this.MediaBrowserCompat$ItemReceiver.read();
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                AlertController$RecycleListView.read.read(th);
            }
        }
    }

    public final void dispose() {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
    }

    public final boolean isDisposed() {
        return get() == HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
    }
}
