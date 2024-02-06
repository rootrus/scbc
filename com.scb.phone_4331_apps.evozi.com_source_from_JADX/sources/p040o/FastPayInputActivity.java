package p040o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;
import p040o.BankingAgentDeepLinkActivity;

/* renamed from: o.FastPayInputActivity */
public final class FastPayInputActivity<T> extends NtbUserInfoActivity<T, T> {
    private TimeUnit MediaBrowserCompat$CustomActionResultReceiver;
    private BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver;
    private DebitCardResetPinSuccessActivity_ViewBinding<? extends T> read;
    private long write;

    /* renamed from: o.FastPayInputActivity$read */
    interface read {
        void MediaBrowserCompat$ItemReceiver(long j);
    }

    public FastPayInputActivity(DebitCardResetOtpActivity<T> debitCardResetOtpActivity, long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding) {
        super(debitCardResetOtpActivity);
        this.write = j;
        this.MediaBrowserCompat$CustomActionResultReceiver = timeUnit;
        this.MediaBrowserCompat$ItemReceiver = bankingAgentDeepLinkActivity;
        this.read = debitCardResetPinSuccessActivity_ViewBinding;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        if (this.read == null) {
            C9732x2f84bf9a fastPayInputActivity$MediaBrowserCompat$CustomActionResultReceiver = new C9732x2f84bf9a(bankingAgentTransactionsDeepLinkActivity, this.write, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver.write());
            bankingAgentTransactionsDeepLinkActivity.onSubscribe(fastPayInputActivity$MediaBrowserCompat$CustomActionResultReceiver);
            fastPayInputActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(0);
            this.IconCompatParcelizer.subscribe(fastPayInputActivity$MediaBrowserCompat$CustomActionResultReceiver);
            return;
        }
        write write2 = new write(bankingAgentTransactionsDeepLinkActivity, this.write, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver.write(), this.read);
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(write2);
        write2.write(0);
        this.IconCompatParcelizer.subscribe(write2);
    }

    /* renamed from: o.FastPayInputActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer implements Runnable {
        private long MediaBrowserCompat$CustomActionResultReceiver;
        private read read;

        IconCompatParcelizer(long j, read read2) {
            this.MediaBrowserCompat$CustomActionResultReceiver = j;
            this.read = read2;
        }

        public final void run() {
            this.read.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    /* renamed from: o.FastPayInputActivity$write */
    static final class write<T> extends AtomicReference<BulkTransferDeepLinkActivity> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity, read {
        private HmlBusinessOwnerSuccessfulDeepLinkActivity IconCompatParcelizer = new HmlBusinessOwnerSuccessfulDeepLinkActivity();
        private long MediaBrowserCompat$CustomActionResultReceiver;
        private AtomicLong MediaBrowserCompat$ItemReceiver = new AtomicLong();
        private BankingAgentDeepLinkActivity.read MediaBrowserCompat$MediaItem;
        private TimeUnit MediaBrowserCompat$SearchResultReceiver;
        private AtomicReference<BulkTransferDeepLinkActivity> RatingCompat = new AtomicReference<>();
        private DebitCardResetPinSuccessActivity_ViewBinding<? extends T> read;
        private BankingAgentTransactionsDeepLinkActivity<? super T> write;

        write(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity.read read2, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding) {
            this.write = bankingAgentTransactionsDeepLinkActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver = j;
            this.MediaBrowserCompat$SearchResultReceiver = timeUnit;
            this.MediaBrowserCompat$MediaItem = read2;
            this.read = debitCardResetPinSuccessActivity_ViewBinding;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this.RatingCompat, bulkTransferDeepLinkActivity);
        }

        public final void onNext(T t) {
            long j = this.MediaBrowserCompat$ItemReceiver.get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.MediaBrowserCompat$ItemReceiver.compareAndSet(j, j2)) {
                    ((BulkTransferDeepLinkActivity) this.IconCompatParcelizer.get()).dispose();
                    this.write.onNext(t);
                    write(j2);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void write(long j) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(new IconCompatParcelizer(j, this), this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$SearchResultReceiver));
        }

        public final void onError(Throwable th) {
            if (this.MediaBrowserCompat$ItemReceiver.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.IconCompatParcelizer.dispose();
                this.write.onError(th);
                this.MediaBrowserCompat$MediaItem.dispose();
                return;
            }
            AlertController$RecycleListView.read.read(th);
        }

        public final void onComplete() {
            if (this.MediaBrowserCompat$ItemReceiver.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.IconCompatParcelizer.dispose();
                this.write.onComplete();
                this.MediaBrowserCompat$MediaItem.dispose();
            }
        }

        public final void MediaBrowserCompat$ItemReceiver(long j) {
            if (this.MediaBrowserCompat$ItemReceiver.compareAndSet(j, Long.MAX_VALUE)) {
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.RatingCompat);
                DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding = this.read;
                this.read = null;
                debitCardResetPinSuccessActivity_ViewBinding.subscribe(new FastPayInputActivity$MediaBrowserCompat$ItemReceiver(this.write, this));
                this.MediaBrowserCompat$MediaItem.dispose();
            }
        }

        public final void dispose() {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.RatingCompat);
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
            this.MediaBrowserCompat$MediaItem.dispose();
        }

        public final boolean isDisposed() {
            return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver((BulkTransferDeepLinkActivity) get());
        }
    }
}
