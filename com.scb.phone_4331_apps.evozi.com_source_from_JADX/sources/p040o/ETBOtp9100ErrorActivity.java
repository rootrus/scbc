package p040o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.ETBOtp9100ErrorActivity */
public final class ETBOtp9100ErrorActivity<T> extends NtbUserInfoActivity<T, T> {
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    private long MediaBrowserCompat$ItemReceiver;
    private TimeUnit MediaDescriptionCompat;
    private int read;
    private BankingAgentDeepLinkActivity write;

    public ETBOtp9100ErrorActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, int i, boolean z) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaBrowserCompat$ItemReceiver = j;
        this.MediaDescriptionCompat = timeUnit;
        this.write = bankingAgentDeepLinkActivity;
        this.read = i;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new write(bankingAgentTransactionsDeepLinkActivity, this.MediaBrowserCompat$ItemReceiver, this.MediaDescriptionCompat, this.write, this.read, this.MediaBrowserCompat$CustomActionResultReceiver));
    }

    /* renamed from: o.ETBOtp9100ErrorActivity$write */
    static final class write<T> extends AtomicInteger implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private BankingAgentTransactionsDeepLinkActivity<? super T> IconCompatParcelizer;
        private volatile boolean MediaBrowserCompat$CustomActionResultReceiver;
        private volatile boolean MediaBrowserCompat$ItemReceiver;
        private BulkTransferDeepLinkActivity MediaBrowserCompat$MediaItem;
        private long MediaBrowserCompat$SearchResultReceiver;
        private HmlBaseEmailAboutActivity<Object> MediaDescriptionCompat;
        private TimeUnit RatingCompat;
        private boolean read;
        private Throwable write;

        write(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, int i, boolean z) {
            this.IconCompatParcelizer = bankingAgentTransactionsDeepLinkActivity;
            this.MediaBrowserCompat$SearchResultReceiver = j;
            this.RatingCompat = timeUnit;
            this.MediaDescriptionCompat = new HmlBaseEmailAboutActivity<>(i);
            this.read = z;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaBrowserCompat$MediaItem, bulkTransferDeepLinkActivity)) {
                this.MediaBrowserCompat$MediaItem = bulkTransferDeepLinkActivity;
                this.IconCompatParcelizer.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            this.MediaDescriptionCompat.read(Long.valueOf(BankingAgentDeepLinkActivity.IconCompatParcelizer(this.RatingCompat)), t);
            MediaBrowserCompat$CustomActionResultReceiver();
        }

        public final void onError(Throwable th) {
            this.write = th;
            this.MediaBrowserCompat$ItemReceiver = true;
            MediaBrowserCompat$CustomActionResultReceiver();
        }

        public final void onComplete() {
            this.MediaBrowserCompat$ItemReceiver = true;
            MediaBrowserCompat$CustomActionResultReceiver();
        }

        public final void dispose() {
            if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
                this.MediaBrowserCompat$CustomActionResultReceiver = true;
                this.MediaBrowserCompat$MediaItem.dispose();
                if (getAndIncrement() == 0) {
                    this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver();
                }
            }
        }

        public final boolean isDisposed() {
            return this.MediaBrowserCompat$CustomActionResultReceiver;
        }

        private void MediaBrowserCompat$CustomActionResultReceiver() {
            if (getAndIncrement() == 0) {
                BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity = this.IconCompatParcelizer;
                HmlBaseEmailAboutActivity<Object> hmlBaseEmailAboutActivity = this.MediaDescriptionCompat;
                boolean z = this.read;
                TimeUnit timeUnit = this.RatingCompat;
                long j = this.MediaBrowserCompat$SearchResultReceiver;
                int i = 1;
                while (!this.MediaBrowserCompat$CustomActionResultReceiver) {
                    boolean z2 = this.MediaBrowserCompat$ItemReceiver;
                    Long l = (Long) hmlBaseEmailAboutActivity.IconCompatParcelizer();
                    boolean z3 = l == null;
                    long IconCompatParcelizer2 = BankingAgentDeepLinkActivity.IconCompatParcelizer(timeUnit);
                    if (!z3 && l.longValue() > IconCompatParcelizer2 - j) {
                        z3 = true;
                    }
                    if (z2) {
                        if (!z) {
                            Throwable th = this.write;
                            if (th != null) {
                                this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver();
                                bankingAgentTransactionsDeepLinkActivity.onError(th);
                                return;
                            } else if (z3) {
                                bankingAgentTransactionsDeepLinkActivity.onComplete();
                                return;
                            }
                        } else if (z3) {
                            Throwable th2 = this.write;
                            if (th2 != null) {
                                bankingAgentTransactionsDeepLinkActivity.onError(th2);
                                return;
                            } else {
                                bankingAgentTransactionsDeepLinkActivity.onComplete();
                                return;
                            }
                        }
                    }
                    if (z3) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        hmlBaseEmailAboutActivity.read();
                        bankingAgentTransactionsDeepLinkActivity.onNext(hmlBaseEmailAboutActivity.read());
                    }
                }
                this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver();
            }
        }
    }
}
