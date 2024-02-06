package p040o;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.DirectDebitTermsAndConditionsActivity$MediaBrowserCompat$ItemReceiver */
final class C9712x62f797b6<T, U> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private AtomicReference<BulkTransferDeepLinkActivity> IconCompatParcelizer = new AtomicReference<>();
    volatile long MediaBrowserCompat$CustomActionResultReceiver;
    final BankingAgentTransactionsDeepLinkActivity<? super T> MediaBrowserCompat$ItemReceiver;
    private BulkTransferDeepLinkActivity RatingCompat;
    private boolean read;
    private DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<U>> write;

    C9712x62f797b6(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<U>> directDebitDeepLinkActivity) {
        this.MediaBrowserCompat$ItemReceiver = bankingAgentTransactionsDeepLinkActivity;
        this.write = directDebitDeepLinkActivity;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.RatingCompat, bulkTransferDeepLinkActivity)) {
            this.RatingCompat = bulkTransferDeepLinkActivity;
            this.MediaBrowserCompat$ItemReceiver.onSubscribe(this);
        }
    }

    public final void onNext(T t) {
        if (!this.read) {
            long j = this.MediaBrowserCompat$CustomActionResultReceiver + 1;
            this.MediaBrowserCompat$CustomActionResultReceiver = j;
            BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.IconCompatParcelizer.get();
            if (bulkTransferDeepLinkActivity != null) {
                bulkTransferDeepLinkActivity.dispose();
            }
            try {
                DebitCardResetPinSuccessActivity_ViewBinding debitCardResetPinSuccessActivity_ViewBinding = (DebitCardResetPinSuccessActivity_ViewBinding) HmlLatestPersonalInformationDeepLinkActivity.write(this.write.write(t), "The ObservableSource supplied is null");
                IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this, j, t);
                if (this.IconCompatParcelizer.compareAndSet(bulkTransferDeepLinkActivity, iconCompatParcelizer)) {
                    debitCardResetPinSuccessActivity_ViewBinding.subscribe(iconCompatParcelizer);
                }
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                dispose();
                this.MediaBrowserCompat$ItemReceiver.onError(th);
            }
        }
    }

    public final void onError(Throwable th) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.IconCompatParcelizer);
        this.MediaBrowserCompat$ItemReceiver.onError(th);
    }

    public final void onComplete() {
        if (!this.read) {
            this.read = true;
            BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.IconCompatParcelizer.get();
            if (bulkTransferDeepLinkActivity != HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED) {
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) bulkTransferDeepLinkActivity;
                if (iconCompatParcelizer != null && iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.compareAndSet(false, true)) {
                    C9712x62f797b6<T, U> directDebitTermsAndConditionsActivity$MediaBrowserCompat$ItemReceiver = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
                    long j = iconCompatParcelizer.read;
                    T t = iconCompatParcelizer.IconCompatParcelizer;
                    if (j == directDebitTermsAndConditionsActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver) {
                        directDebitTermsAndConditionsActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.onNext(t);
                    }
                }
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.IconCompatParcelizer);
                this.MediaBrowserCompat$ItemReceiver.onComplete();
            }
        }
    }

    public final void dispose() {
        this.RatingCompat.dispose();
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.IconCompatParcelizer);
    }

    public final boolean isDisposed() {
        return this.RatingCompat.isDisposed();
    }

    /* renamed from: o.DirectDebitTermsAndConditionsActivity$MediaBrowserCompat$ItemReceiver$IconCompatParcelizer */
    static final class IconCompatParcelizer<T, U> extends HmlETBBusinessInformationActivity<U> {
        final T IconCompatParcelizer;
        final AtomicBoolean MediaBrowserCompat$CustomActionResultReceiver = new AtomicBoolean();
        final C9712x62f797b6<T, U> MediaBrowserCompat$ItemReceiver;
        final long read;
        private boolean write;

        IconCompatParcelizer(C9712x62f797b6<T, U> directDebitTermsAndConditionsActivity$MediaBrowserCompat$ItemReceiver, long j, T t) {
            this.MediaBrowserCompat$ItemReceiver = directDebitTermsAndConditionsActivity$MediaBrowserCompat$ItemReceiver;
            this.read = j;
            this.IconCompatParcelizer = t;
        }

        public final void onNext(U u) {
            if (!this.write) {
                this.write = true;
                dispose();
                MediaBrowserCompat$CustomActionResultReceiver();
            }
        }

        private void MediaBrowserCompat$CustomActionResultReceiver() {
            if (this.MediaBrowserCompat$CustomActionResultReceiver.compareAndSet(false, true)) {
                C9712x62f797b6<T, U> directDebitTermsAndConditionsActivity$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$ItemReceiver;
                long j = this.read;
                T t = this.IconCompatParcelizer;
                if (j == directDebitTermsAndConditionsActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver) {
                    directDebitTermsAndConditionsActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.onNext(t);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.write) {
                AlertController$RecycleListView.read.read(th);
                return;
            }
            this.write = true;
            this.MediaBrowserCompat$ItemReceiver.onError(th);
        }

        public final void onComplete() {
            if (!this.write) {
                this.write = true;
                MediaBrowserCompat$CustomActionResultReceiver();
            }
        }
    }
}
