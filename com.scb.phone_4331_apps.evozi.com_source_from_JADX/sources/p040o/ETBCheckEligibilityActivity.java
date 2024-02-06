package p040o;

import java.util.NoSuchElementException;
import p040o.AlertController$RecycleListView;

/* renamed from: o.ETBCheckEligibilityActivity */
public final class ETBCheckEligibilityActivity<T> extends BScanCNotificationDeepLinkActivity<T> {
    private DebitCardResetPinSuccessActivity_ViewBinding<? extends T> read;
    private T write;

    public ETBCheckEligibilityActivity(DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding, T t) {
        this.read = debitCardResetPinSuccessActivity_ViewBinding;
        this.write = t;
    }

    public final void read(ActivateChequeDeepLinkActivity<? super T> activateChequeDeepLinkActivity) {
        this.read.subscribe(new IconCompatParcelizer(activateChequeDeepLinkActivity, this.write));
    }

    /* renamed from: o.ETBCheckEligibilityActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private BulkTransferDeepLinkActivity IconCompatParcelizer;
        private T MediaBrowserCompat$CustomActionResultReceiver;
        private boolean MediaBrowserCompat$ItemReceiver;
        private ActivateChequeDeepLinkActivity<? super T> read;
        private T write;

        IconCompatParcelizer(ActivateChequeDeepLinkActivity<? super T> activateChequeDeepLinkActivity, T t) {
            this.read = activateChequeDeepLinkActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver = t;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.IconCompatParcelizer, bulkTransferDeepLinkActivity)) {
                this.IconCompatParcelizer = bulkTransferDeepLinkActivity;
                this.read.onSubscribe(this);
            }
        }

        public final void dispose() {
            this.IconCompatParcelizer.dispose();
        }

        public final boolean isDisposed() {
            return this.IconCompatParcelizer.isDisposed();
        }

        public final void onNext(T t) {
            if (!this.MediaBrowserCompat$ItemReceiver) {
                if (this.write != null) {
                    this.MediaBrowserCompat$ItemReceiver = true;
                    this.IconCompatParcelizer.dispose();
                    this.read.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.write = t;
            }
        }

        public final void onError(Throwable th) {
            if (this.MediaBrowserCompat$ItemReceiver) {
                AlertController$RecycleListView.read.read(th);
                return;
            }
            this.MediaBrowserCompat$ItemReceiver = true;
            this.read.onError(th);
        }

        public final void onComplete() {
            if (!this.MediaBrowserCompat$ItemReceiver) {
                this.MediaBrowserCompat$ItemReceiver = true;
                T t = this.write;
                this.write = null;
                if (t == null) {
                    t = this.MediaBrowserCompat$CustomActionResultReceiver;
                }
                if (t != null) {
                    this.read.MediaBrowserCompat$CustomActionResultReceiver(t);
                } else {
                    this.read.onError(new NoSuchElementException());
                }
            }
        }
    }
}
