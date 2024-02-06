package p040o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p040o.BankingAgentDeepLinkActivity;

/* renamed from: o.onReturnButtonClicked */
public final class onReturnButtonClicked<T> extends NtbUserInfoActivity<T, T> {
    private TimeUnit MediaBrowserCompat$CustomActionResultReceiver;
    private BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver;
    private long read;
    private boolean write;

    public onReturnButtonClicked(DebitCardResetOtpActivity<T> debitCardResetOtpActivity, long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, boolean z) {
        super(debitCardResetOtpActivity);
        this.read = j;
        this.MediaBrowserCompat$CustomActionResultReceiver = timeUnit;
        this.MediaBrowserCompat$ItemReceiver = bankingAgentDeepLinkActivity;
        this.write = z;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new IconCompatParcelizer(bankingAgentTransactionsDeepLinkActivity, this.read, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver.write(), this.write));
    }

    /* renamed from: o.onReturnButtonClicked$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> extends AtomicInteger implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity, Runnable {
        private volatile boolean IconCompatParcelizer;
        private BankingAgentTransactionsDeepLinkActivity<? super T> MediaBrowserCompat$CustomActionResultReceiver;
        private Throwable MediaBrowserCompat$ItemReceiver;
        private long MediaBrowserCompat$MediaItem;
        private TimeUnit MediaBrowserCompat$SearchResultReceiver;
        private AtomicReference<T> MediaDescriptionCompat = new AtomicReference<>();
        private boolean MediaMetadataCompat;
        private BulkTransferDeepLinkActivity MediaSessionCompat$QueueItem;
        private BankingAgentDeepLinkActivity.read MediaSessionCompat$ResultReceiverWrapper;
        private volatile boolean RatingCompat;
        private volatile boolean read;
        private boolean write;

        IconCompatParcelizer(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity.read read2, boolean z) {
            this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentTransactionsDeepLinkActivity;
            this.MediaBrowserCompat$MediaItem = j;
            this.MediaBrowserCompat$SearchResultReceiver = timeUnit;
            this.MediaSessionCompat$ResultReceiverWrapper = read2;
            this.write = z;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaSessionCompat$QueueItem, bulkTransferDeepLinkActivity)) {
                this.MediaSessionCompat$QueueItem = bulkTransferDeepLinkActivity;
                this.MediaBrowserCompat$CustomActionResultReceiver.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            this.MediaDescriptionCompat.set(t);
            read();
        }

        public final void onError(Throwable th) {
            this.MediaBrowserCompat$ItemReceiver = th;
            this.IconCompatParcelizer = true;
            read();
        }

        public final void onComplete() {
            this.IconCompatParcelizer = true;
            read();
        }

        public final void dispose() {
            this.read = true;
            this.MediaSessionCompat$QueueItem.dispose();
            this.MediaSessionCompat$ResultReceiverWrapper.dispose();
            if (getAndIncrement() == 0) {
                this.MediaDescriptionCompat.lazySet((Object) null);
            }
        }

        public final boolean isDisposed() {
            return this.read;
        }

        public final void run() {
            this.RatingCompat = true;
            read();
        }

        private void read() {
            if (getAndIncrement() == 0) {
                AtomicReference<T> atomicReference = this.MediaDescriptionCompat;
                BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
                int i = 1;
                while (!this.read) {
                    boolean z = this.IconCompatParcelizer;
                    if (!z || this.MediaBrowserCompat$ItemReceiver == null) {
                        boolean z2 = atomicReference.get() == null;
                        if (z) {
                            T andSet = atomicReference.getAndSet((Object) null);
                            if (!z2 && this.write) {
                                bankingAgentTransactionsDeepLinkActivity.onNext(andSet);
                            }
                            bankingAgentTransactionsDeepLinkActivity.onComplete();
                            this.MediaSessionCompat$ResultReceiverWrapper.dispose();
                            return;
                        }
                        if (z2) {
                            if (this.RatingCompat) {
                                this.MediaMetadataCompat = false;
                                this.RatingCompat = false;
                            }
                        } else if (!this.MediaMetadataCompat || this.RatingCompat) {
                            bankingAgentTransactionsDeepLinkActivity.onNext(atomicReference.getAndSet((Object) null));
                            this.RatingCompat = false;
                            this.MediaMetadataCompat = true;
                            this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver(this, this.MediaBrowserCompat$MediaItem, this.MediaBrowserCompat$SearchResultReceiver);
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        atomicReference.lazySet((Object) null);
                        bankingAgentTransactionsDeepLinkActivity.onError(this.MediaBrowserCompat$ItemReceiver);
                        this.MediaSessionCompat$ResultReceiverWrapper.dispose();
                        return;
                    }
                }
                atomicReference.lazySet((Object) null);
            }
        }
    }
}
