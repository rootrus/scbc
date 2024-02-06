package p040o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;
import p040o.BankingAgentDeepLinkActivity;

/* renamed from: o.EtbSuccessActivity */
public final class EtbSuccessActivity<T> extends NtbUserInfoActivity<T, T> {
    private int read;

    /* renamed from: o.EtbSuccessActivity$EtbScreenshot */
    public final class EtbScreenshot<T> extends NtbUserInfoActivity<T, T> {
        private HmlBaseDeepLinkActivity<? super T> MediaBrowserCompat$CustomActionResultReceiver;

        public EtbScreenshot(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, HmlBaseDeepLinkActivity<? super T> hmlBaseDeepLinkActivity) {
            super(debitCardResetPinSuccessActivity_ViewBinding);
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlBaseDeepLinkActivity;
        }

        public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
            this.IconCompatParcelizer.subscribe(new read(bankingAgentTransactionsDeepLinkActivity, this.MediaBrowserCompat$CustomActionResultReceiver));
        }

        /* renamed from: o.EtbSuccessActivity$EtbScreenshot$read */
        static final class read<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
            private HmlBaseDeepLinkActivity<? super T> IconCompatParcelizer;
            private BulkTransferDeepLinkActivity MediaBrowserCompat$ItemReceiver;
            private boolean read;
            private BankingAgentTransactionsDeepLinkActivity<? super T> write;

            read(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, HmlBaseDeepLinkActivity<? super T> hmlBaseDeepLinkActivity) {
                this.write = bankingAgentTransactionsDeepLinkActivity;
                this.IconCompatParcelizer = hmlBaseDeepLinkActivity;
            }

            public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
                if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, bulkTransferDeepLinkActivity)) {
                    this.MediaBrowserCompat$ItemReceiver = bulkTransferDeepLinkActivity;
                    this.write.onSubscribe(this);
                }
            }

            public final void dispose() {
                this.MediaBrowserCompat$ItemReceiver.dispose();
            }

            public final boolean isDisposed() {
                return this.MediaBrowserCompat$ItemReceiver.isDisposed();
            }

            public final void onNext(T t) {
                if (!this.read) {
                    this.write.onNext(t);
                    try {
                        if (this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(t)) {
                            this.read = true;
                            this.MediaBrowserCompat$ItemReceiver.dispose();
                            this.write.onComplete();
                        }
                    } catch (Throwable th) {
                        AlertController$RecycleListView.read.write(th);
                        this.MediaBrowserCompat$ItemReceiver.dispose();
                        onError(th);
                    }
                }
            }

            public final void onError(Throwable th) {
                if (!this.read) {
                    this.read = true;
                    this.write.onError(th);
                    return;
                }
                AlertController$RecycleListView.read.read(th);
            }

            public final void onComplete() {
                if (!this.read) {
                    this.read = true;
                    this.write.onComplete();
                }
            }
        }
    }

    public EtbSuccessActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, int i) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.read = i;
    }

    /* renamed from: o.EtbSuccessActivity$EtbScreenshot_ViewBinding */
    public final class EtbScreenshot_ViewBinding<T> extends NtbUserInfoActivity<T, T> {
        private TimeUnit MediaBrowserCompat$CustomActionResultReceiver;
        private BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver;
        private long read;

        public EtbScreenshot_ViewBinding(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
            super(debitCardResetPinSuccessActivity_ViewBinding);
            this.read = j;
            this.MediaBrowserCompat$CustomActionResultReceiver = timeUnit;
            this.MediaBrowserCompat$ItemReceiver = bankingAgentDeepLinkActivity;
        }

        public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
            this.IconCompatParcelizer.subscribe(new IconCompatParcelizer(new HmlDocumentUploadGuidelineActivity(bankingAgentTransactionsDeepLinkActivity), this.read, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver.write()));
        }

        /* renamed from: o.EtbSuccessActivity$EtbScreenshot_ViewBinding$IconCompatParcelizer */
        static final class IconCompatParcelizer<T> extends AtomicReference<BulkTransferDeepLinkActivity> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity, Runnable {
            private long IconCompatParcelizer;
            private volatile boolean MediaBrowserCompat$CustomActionResultReceiver;
            private boolean MediaBrowserCompat$ItemReceiver;
            private BulkTransferDeepLinkActivity MediaDescriptionCompat;
            private BankingAgentDeepLinkActivity.read RatingCompat;
            private BankingAgentTransactionsDeepLinkActivity<? super T> read;
            private TimeUnit write;

            IconCompatParcelizer(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity.read read2) {
                this.read = bankingAgentTransactionsDeepLinkActivity;
                this.IconCompatParcelizer = j;
                this.write = timeUnit;
                this.RatingCompat = read2;
            }

            public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
                if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaDescriptionCompat, bulkTransferDeepLinkActivity)) {
                    this.MediaDescriptionCompat = bulkTransferDeepLinkActivity;
                    this.read.onSubscribe(this);
                }
            }

            public final void onNext(T t) {
                if (!this.MediaBrowserCompat$CustomActionResultReceiver && !this.MediaBrowserCompat$ItemReceiver) {
                    this.MediaBrowserCompat$CustomActionResultReceiver = true;
                    this.read.onNext(t);
                    BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = (BulkTransferDeepLinkActivity) get();
                    if (bulkTransferDeepLinkActivity != null) {
                        bulkTransferDeepLinkActivity.dispose();
                    }
                    HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this, this.RatingCompat.MediaBrowserCompat$ItemReceiver(this, this.IconCompatParcelizer, this.write));
                }
            }

            public final void run() {
                this.MediaBrowserCompat$CustomActionResultReceiver = false;
            }

            public final void onError(Throwable th) {
                if (this.MediaBrowserCompat$ItemReceiver) {
                    AlertController$RecycleListView.read.read(th);
                    return;
                }
                this.MediaBrowserCompat$ItemReceiver = true;
                this.read.onError(th);
                this.RatingCompat.dispose();
            }

            public final void onComplete() {
                if (!this.MediaBrowserCompat$ItemReceiver) {
                    this.MediaBrowserCompat$ItemReceiver = true;
                    this.read.onComplete();
                    this.RatingCompat.dispose();
                }
            }

            public final void dispose() {
                this.MediaDescriptionCompat.dispose();
                this.RatingCompat.dispose();
            }

            public final boolean isDisposed() {
                return this.RatingCompat.isDisposed();
            }
        }
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new EtbSuccessActivity$MediaBrowserCompat$ItemReceiver(bankingAgentTransactionsDeepLinkActivity, this.read));
    }
}
