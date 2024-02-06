package p040o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o.EtbActivity_ViewBinding */
public final class EtbActivity_ViewBinding<T> extends NtbUserInfoActivity<T, T> {
    private int MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver;
    private TimeUnit MediaBrowserCompat$SearchResultReceiver;
    private long RatingCompat;
    private BankingAgentDeepLinkActivity read;
    private long write;

    public EtbActivity_ViewBinding(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, long j, long j2, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, int i, boolean z) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.write = j;
        this.RatingCompat = j2;
        this.MediaBrowserCompat$SearchResultReceiver = timeUnit;
        this.read = bankingAgentDeepLinkActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new read(bankingAgentTransactionsDeepLinkActivity, this.write, this.RatingCompat, this.MediaBrowserCompat$SearchResultReceiver, this.read, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver));
    }

    /* renamed from: o.EtbActivity_ViewBinding$read */
    static final class read<T> extends AtomicBoolean implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private volatile boolean IconCompatParcelizer;
        private BankingAgentTransactionsDeepLinkActivity<? super T> MediaBrowserCompat$CustomActionResultReceiver;
        private long MediaBrowserCompat$ItemReceiver;
        private HmlBaseEmailAboutActivity<Object> MediaBrowserCompat$MediaItem;
        private TimeUnit MediaDescriptionCompat;
        private long MediaMetadataCompat;
        private BulkTransferDeepLinkActivity RatingCompat;
        private Throwable read;
        private boolean write;

        read(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, long j, long j2, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, int i, boolean z) {
            this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentTransactionsDeepLinkActivity;
            this.MediaBrowserCompat$ItemReceiver = j;
            this.MediaMetadataCompat = j2;
            this.MediaDescriptionCompat = timeUnit;
            this.MediaBrowserCompat$MediaItem = new HmlBaseEmailAboutActivity<>(i);
            this.write = z;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.RatingCompat, bulkTransferDeepLinkActivity)) {
                this.RatingCompat = bulkTransferDeepLinkActivity;
                this.MediaBrowserCompat$CustomActionResultReceiver.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            long j;
            long j2;
            HmlBaseEmailAboutActivity<Object> hmlBaseEmailAboutActivity = this.MediaBrowserCompat$MediaItem;
            long IconCompatParcelizer2 = BankingAgentDeepLinkActivity.IconCompatParcelizer(this.MediaDescriptionCompat);
            long j3 = this.MediaMetadataCompat;
            long j4 = this.MediaBrowserCompat$ItemReceiver;
            boolean z = j4 == Long.MAX_VALUE;
            hmlBaseEmailAboutActivity.read(Long.valueOf(IconCompatParcelizer2), t);
            while (!hmlBaseEmailAboutActivity.write()) {
                if (((Long) hmlBaseEmailAboutActivity.IconCompatParcelizer()).longValue() > IconCompatParcelizer2 - j3) {
                    if (!z) {
                        long j5 = hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver.get();
                        while (true) {
                            j = hmlBaseEmailAboutActivity.MediaBrowserCompat$CustomActionResultReceiver.get();
                            j2 = hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver.get();
                            if (j5 == j2) {
                                break;
                            }
                            j5 = j2;
                        }
                        if (((long) (((int) (j - j2)) >> 1)) <= j4) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                hmlBaseEmailAboutActivity.read();
                hmlBaseEmailAboutActivity.read();
            }
        }

        public final void onError(Throwable th) {
            this.read = th;
            MediaBrowserCompat$CustomActionResultReceiver();
        }

        public final void onComplete() {
            MediaBrowserCompat$CustomActionResultReceiver();
        }

        public final void dispose() {
            if (!this.IconCompatParcelizer) {
                this.IconCompatParcelizer = true;
                this.RatingCompat.dispose();
                if (compareAndSet(false, true)) {
                    this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver();
                }
            }
        }

        public final boolean isDisposed() {
            return this.IconCompatParcelizer;
        }

        private void MediaBrowserCompat$CustomActionResultReceiver() {
            Throwable th;
            if (compareAndSet(false, true)) {
                BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
                HmlBaseEmailAboutActivity<Object> hmlBaseEmailAboutActivity = this.MediaBrowserCompat$MediaItem;
                boolean z = this.write;
                long IconCompatParcelizer2 = BankingAgentDeepLinkActivity.IconCompatParcelizer(this.MediaDescriptionCompat);
                long j = this.MediaMetadataCompat;
                while (!this.IconCompatParcelizer) {
                    if (z || (th = this.read) == null) {
                        Object read2 = hmlBaseEmailAboutActivity.read();
                        if (read2 == null) {
                            Throwable th2 = this.read;
                            if (th2 != null) {
                                bankingAgentTransactionsDeepLinkActivity.onError(th2);
                                return;
                            } else {
                                bankingAgentTransactionsDeepLinkActivity.onComplete();
                                return;
                            }
                        } else {
                            Object read3 = hmlBaseEmailAboutActivity.read();
                            if (((Long) read2).longValue() >= IconCompatParcelizer2 - j) {
                                bankingAgentTransactionsDeepLinkActivity.onNext(read3);
                            }
                        }
                    } else {
                        hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
                        bankingAgentTransactionsDeepLinkActivity.onError(th);
                        return;
                    }
                }
                hmlBaseEmailAboutActivity.MediaBrowserCompat$ItemReceiver();
            }
        }
    }
}
