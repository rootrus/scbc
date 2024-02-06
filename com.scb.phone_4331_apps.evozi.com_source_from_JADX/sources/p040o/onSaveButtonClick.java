package p040o;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.onSaveButtonClick */
public final class onSaveButtonClick<T> extends NtbUserInfoActivity<T, DebitCardResetOtpActivity<T>> {
    private long MediaBrowserCompat$CustomActionResultReceiver;
    private int read;
    private long write;

    public onSaveButtonClick(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, long j, long j2, int i) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.write = j;
        this.MediaBrowserCompat$CustomActionResultReceiver = j2;
        this.read = i;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super DebitCardResetOtpActivity<T>> bankingAgentTransactionsDeepLinkActivity) {
        if (this.write == this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.IconCompatParcelizer.subscribe(new IconCompatParcelizer(bankingAgentTransactionsDeepLinkActivity, this.write, this.read));
            return;
        }
        this.IconCompatParcelizer.subscribe(new read(bankingAgentTransactionsDeepLinkActivity, this.write, this.MediaBrowserCompat$CustomActionResultReceiver, this.read));
    }

    /* renamed from: o.onSaveButtonClick$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> extends AtomicInteger implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity, Runnable {
        private volatile boolean IconCompatParcelizer;
        private BankingAgentTransactionsDeepLinkActivity<? super DebitCardResetOtpActivity<T>> MediaBrowserCompat$CustomActionResultReceiver;
        private long MediaBrowserCompat$ItemReceiver;
        private HmlETBLoanSetupActivity<T> MediaBrowserCompat$MediaItem;
        private BulkTransferDeepLinkActivity MediaBrowserCompat$SearchResultReceiver;
        private long read;
        private int write;

        IconCompatParcelizer(BankingAgentTransactionsDeepLinkActivity<? super DebitCardResetOtpActivity<T>> bankingAgentTransactionsDeepLinkActivity, long j, int i) {
            this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentTransactionsDeepLinkActivity;
            this.MediaBrowserCompat$ItemReceiver = j;
            this.write = i;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaBrowserCompat$SearchResultReceiver, bulkTransferDeepLinkActivity)) {
                this.MediaBrowserCompat$SearchResultReceiver = bulkTransferDeepLinkActivity;
                this.MediaBrowserCompat$CustomActionResultReceiver.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            HmlETBLoanSetupActivity<T> hmlETBLoanSetupActivity = this.MediaBrowserCompat$MediaItem;
            if (hmlETBLoanSetupActivity == null && !this.IconCompatParcelizer) {
                hmlETBLoanSetupActivity = HmlETBLoanSetupActivity.IconCompatParcelizer(this.write, this);
                this.MediaBrowserCompat$MediaItem = hmlETBLoanSetupActivity;
                this.MediaBrowserCompat$CustomActionResultReceiver.onNext(hmlETBLoanSetupActivity);
            }
            if (hmlETBLoanSetupActivity != null) {
                hmlETBLoanSetupActivity.onNext(t);
                long j = this.read + 1;
                this.read = j;
                if (j >= this.MediaBrowserCompat$ItemReceiver) {
                    this.read = 0;
                    this.MediaBrowserCompat$MediaItem = null;
                    hmlETBLoanSetupActivity.onComplete();
                    if (this.IconCompatParcelizer) {
                        this.MediaBrowserCompat$SearchResultReceiver.dispose();
                    }
                }
            }
        }

        public final void onError(Throwable th) {
            HmlETBLoanSetupActivity<T> hmlETBLoanSetupActivity = this.MediaBrowserCompat$MediaItem;
            if (hmlETBLoanSetupActivity != null) {
                this.MediaBrowserCompat$MediaItem = null;
                hmlETBLoanSetupActivity.onError(th);
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
        }

        public final void onComplete() {
            HmlETBLoanSetupActivity<T> hmlETBLoanSetupActivity = this.MediaBrowserCompat$MediaItem;
            if (hmlETBLoanSetupActivity != null) {
                this.MediaBrowserCompat$MediaItem = null;
                hmlETBLoanSetupActivity.onComplete();
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.onComplete();
        }

        public final void dispose() {
            this.IconCompatParcelizer = true;
        }

        public final boolean isDisposed() {
            return this.IconCompatParcelizer;
        }

        public final void run() {
            if (this.IconCompatParcelizer) {
                this.MediaBrowserCompat$SearchResultReceiver.dispose();
            }
        }
    }

    /* renamed from: o.onSaveButtonClick$read */
    static final class read<T> extends AtomicBoolean implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity, Runnable {
        private BankingAgentTransactionsDeepLinkActivity<? super DebitCardResetOtpActivity<T>> IconCompatParcelizer;
        private long MediaBrowserCompat$CustomActionResultReceiver;
        private long MediaBrowserCompat$ItemReceiver;
        private long MediaBrowserCompat$MediaItem;
        private BulkTransferDeepLinkActivity MediaBrowserCompat$SearchResultReceiver;
        private AtomicInteger MediaDescriptionCompat = new AtomicInteger();
        private long MediaMetadataCompat;
        private ArrayDeque<HmlETBLoanSetupActivity<T>> RatingCompat;
        private volatile boolean read;
        private int write;

        read(BankingAgentTransactionsDeepLinkActivity<? super DebitCardResetOtpActivity<T>> bankingAgentTransactionsDeepLinkActivity, long j, long j2, int i) {
            this.IconCompatParcelizer = bankingAgentTransactionsDeepLinkActivity;
            this.MediaBrowserCompat$ItemReceiver = j;
            this.MediaBrowserCompat$MediaItem = j2;
            this.write = i;
            this.RatingCompat = new ArrayDeque<>();
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaBrowserCompat$SearchResultReceiver, bulkTransferDeepLinkActivity)) {
                this.MediaBrowserCompat$SearchResultReceiver = bulkTransferDeepLinkActivity;
                this.IconCompatParcelizer.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            ArrayDeque<HmlETBLoanSetupActivity<T>> arrayDeque = this.RatingCompat;
            long j = this.MediaMetadataCompat;
            long j2 = this.MediaBrowserCompat$MediaItem;
            if (j % j2 == 0 && !this.read) {
                this.MediaDescriptionCompat.getAndIncrement();
                HmlETBLoanSetupActivity IconCompatParcelizer2 = HmlETBLoanSetupActivity.IconCompatParcelizer(this.write, this);
                arrayDeque.offer(IconCompatParcelizer2);
                this.IconCompatParcelizer.onNext(IconCompatParcelizer2);
            }
            long j3 = this.MediaBrowserCompat$CustomActionResultReceiver + 1;
            Iterator<HmlETBLoanSetupActivity<T>> it = arrayDeque.iterator();
            while (it.hasNext()) {
                it.next().onNext(t);
            }
            if (j3 >= this.MediaBrowserCompat$ItemReceiver) {
                arrayDeque.poll().onComplete();
                if (!arrayDeque.isEmpty() || !this.read) {
                    this.MediaBrowserCompat$CustomActionResultReceiver = j3 - j2;
                } else {
                    this.MediaBrowserCompat$SearchResultReceiver.dispose();
                    return;
                }
            } else {
                this.MediaBrowserCompat$CustomActionResultReceiver = j3;
            }
            this.MediaMetadataCompat = j + 1;
        }

        public final void onError(Throwable th) {
            ArrayDeque<HmlETBLoanSetupActivity<T>> arrayDeque = this.RatingCompat;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onError(th);
            }
            this.IconCompatParcelizer.onError(th);
        }

        public final void onComplete() {
            ArrayDeque<HmlETBLoanSetupActivity<T>> arrayDeque = this.RatingCompat;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onComplete();
            }
            this.IconCompatParcelizer.onComplete();
        }

        public final void dispose() {
            this.read = true;
        }

        public final boolean isDisposed() {
            return this.read;
        }

        public final void run() {
            if (this.MediaDescriptionCompat.decrementAndGet() == 0 && this.read) {
                this.MediaBrowserCompat$SearchResultReceiver.dispose();
            }
        }
    }
}
