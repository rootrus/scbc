package p040o;

import java.util.concurrent.atomic.AtomicReference;
import p039io.reactivex.exceptions.CompositeException;
import p040o.AlertController$RecycleListView;

/* renamed from: o.NsipPartnerPaymentDeepLinkActivity */
public final class NsipPartnerPaymentDeepLinkActivity<T> extends AtomicReference<BulkTransferDeepLinkActivity> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private boolean IconCompatParcelizer;
    private DebitCardMarketConductDeepLinkActivity<? super Throwable> MediaBrowserCompat$CustomActionResultReceiver;
    private DataPrivacyManagementDeepLinkActivity MediaBrowserCompat$ItemReceiver;
    private HmlBaseDeepLinkActivity<? super T> read;

    public NsipPartnerPaymentDeepLinkActivity(HmlBaseDeepLinkActivity<? super T> hmlBaseDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super Throwable> debitCardMarketConductDeepLinkActivity, DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity) {
        this.read = hmlBaseDeepLinkActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = debitCardMarketConductDeepLinkActivity;
        this.MediaBrowserCompat$ItemReceiver = dataPrivacyManagementDeepLinkActivity;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity);
    }

    public final void onNext(T t) {
        if (!this.IconCompatParcelizer) {
            try {
                if (!this.read.MediaBrowserCompat$CustomActionResultReceiver(t)) {
                    dispose();
                    onComplete();
                }
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                dispose();
                onError(th);
            }
        }
    }

    public final void onError(Throwable th) {
        if (this.IconCompatParcelizer) {
            AlertController$RecycleListView.read.read(th);
            return;
        }
        this.IconCompatParcelizer = true;
        try {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(th);
        } catch (Throwable th2) {
            AlertController$RecycleListView.read.write(th2);
            AlertController$RecycleListView.read.read((Throwable) new CompositeException(th, th2));
        }
    }

    public final void onComplete() {
        if (!this.IconCompatParcelizer) {
            this.IconCompatParcelizer = true;
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
        return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver((BulkTransferDeepLinkActivity) get());
    }
}
