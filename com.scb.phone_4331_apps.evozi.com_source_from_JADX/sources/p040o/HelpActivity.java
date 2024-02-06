package p040o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.HelpActivity */
public final class HelpActivity<T> extends BScanCNotificationDeepLinkActivity<T> {
    private BillerDeepLinkActivity<T> MediaBrowserCompat$ItemReceiver;
    private BankingAgentDeepLinkActivity read;

    public HelpActivity(BillerDeepLinkActivity<T> billerDeepLinkActivity, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        this.MediaBrowserCompat$ItemReceiver = billerDeepLinkActivity;
        this.read = bankingAgentDeepLinkActivity;
    }

    public final void read(ActivateChequeDeepLinkActivity<? super T> activateChequeDeepLinkActivity) {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new write(activateChequeDeepLinkActivity, this.read));
    }

    /* renamed from: o.HelpActivity$write */
    static final class write<T> extends AtomicReference<BulkTransferDeepLinkActivity> implements ActivateChequeDeepLinkActivity<T>, BulkTransferDeepLinkActivity, Runnable {
        private ActivateChequeDeepLinkActivity<? super T> IconCompatParcelizer;
        private T MediaBrowserCompat$CustomActionResultReceiver;
        private BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver;
        private Throwable write;

        write(ActivateChequeDeepLinkActivity<? super T> activateChequeDeepLinkActivity, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
            this.IconCompatParcelizer = activateChequeDeepLinkActivity;
            this.MediaBrowserCompat$ItemReceiver = bankingAgentDeepLinkActivity;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity)) {
                this.IconCompatParcelizer.onSubscribe(this);
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(T t) {
            this.MediaBrowserCompat$CustomActionResultReceiver = t;
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this, this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this));
        }

        public final void onError(Throwable th) {
            this.write = th;
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this, this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this));
        }

        public final void run() {
            Throwable th = this.write;
            if (th != null) {
                this.IconCompatParcelizer.onError(th);
            } else {
                this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
            }
        }

        public final void dispose() {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
        }

        public final boolean isDisposed() {
            return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver((BulkTransferDeepLinkActivity) get());
        }
    }
}
