package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.EasycashNCBConsentActivity$MediaBrowserCompat$ItemReceiver */
final class EasycashNCBConsentActivity$MediaBrowserCompat$ItemReceiver<T, S> implements DebitCardLandingActivity<T>, BulkTransferDeepLinkActivity {
    final ChequeManagementDeepLinkActivity<S, ? super DebitCardLandingActivity<T>, S> IconCompatParcelizer;
    S MediaBrowserCompat$CustomActionResultReceiver;
    boolean MediaBrowserCompat$ItemReceiver;
    boolean MediaBrowserCompat$SearchResultReceiver;
    private BankingAgentTransactionsDeepLinkActivity<? super T> MediaDescriptionCompat;
    volatile boolean read;
    final DebitCardMarketConductDeepLinkActivity<? super S> write;

    EasycashNCBConsentActivity$MediaBrowserCompat$ItemReceiver(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, ChequeManagementDeepLinkActivity<S, ? super DebitCardLandingActivity<T>, S> chequeManagementDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super S> debitCardMarketConductDeepLinkActivity, S s) {
        this.MediaDescriptionCompat = bankingAgentTransactionsDeepLinkActivity;
        this.IconCompatParcelizer = chequeManagementDeepLinkActivity;
        this.write = debitCardMarketConductDeepLinkActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = s;
    }

    public final void dispose() {
        this.read = true;
    }

    public final boolean isDisposed() {
        return this.read;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(T t) {
        if (this.MediaBrowserCompat$SearchResultReceiver) {
            return;
        }
        if (this.MediaBrowserCompat$ItemReceiver) {
            MediaBrowserCompat$CustomActionResultReceiver((Throwable) new IllegalStateException("onNext already called in this generate turn"));
        } else if (t == null) {
            MediaBrowserCompat$CustomActionResultReceiver((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else {
            this.MediaBrowserCompat$ItemReceiver = true;
            this.MediaDescriptionCompat.onNext(t);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Throwable th) {
        if (this.MediaBrowserCompat$SearchResultReceiver) {
            AlertController$RecycleListView.read.read(th);
            return;
        }
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        this.MediaBrowserCompat$SearchResultReceiver = true;
        this.MediaDescriptionCompat.onError(th);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (!this.MediaBrowserCompat$SearchResultReceiver) {
            this.MediaBrowserCompat$SearchResultReceiver = true;
            this.MediaDescriptionCompat.onComplete();
        }
    }
}
