package p040o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.EasycashOccupationSearchActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C9721x88504ac4 extends AtomicReference<BulkTransferDeepLinkActivity> implements BankingAgentTransactionsDeepLinkActivity<Object>, BulkTransferDeepLinkActivity {
    private EasycashOccupationSearchActivity$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;
    private boolean read;

    C9721x88504ac4(EasycashOccupationSearchActivity$MediaBrowserCompat$ItemReceiver easycashOccupationSearchActivity$MediaBrowserCompat$ItemReceiver, boolean z) {
        this.IconCompatParcelizer = easycashOccupationSearchActivity$MediaBrowserCompat$ItemReceiver;
        this.read = z;
    }

    public final void dispose() {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
    }

    public final boolean isDisposed() {
        return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver((BulkTransferDeepLinkActivity) get());
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity);
    }

    public final void onNext(Object obj) {
        this.IconCompatParcelizer.IconCompatParcelizer(this.read, obj);
    }

    public final void onError(Throwable th) {
        this.IconCompatParcelizer.write(th);
    }

    public final void onComplete() {
        this.IconCompatParcelizer.IconCompatParcelizer(this);
    }
}
