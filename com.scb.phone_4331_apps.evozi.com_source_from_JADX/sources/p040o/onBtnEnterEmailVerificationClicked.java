package p040o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.onBtnEnterEmailVerificationClicked */
public final class onBtnEnterEmailVerificationClicked<T> extends NtbUserInfoActivity<T, T> {
    private long MediaBrowserCompat$CustomActionResultReceiver;
    private TimeUnit MediaBrowserCompat$ItemReceiver;
    private BankingAgentDeepLinkActivity read;
    private boolean write;

    public onBtnEnterEmailVerificationClicked(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, boolean z) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaBrowserCompat$CustomActionResultReceiver = j;
        this.MediaBrowserCompat$ItemReceiver = timeUnit;
        this.read = bankingAgentDeepLinkActivity;
        this.write = z;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        HmlDocumentUploadGuidelineActivity hmlDocumentUploadGuidelineActivity = new HmlDocumentUploadGuidelineActivity(bankingAgentTransactionsDeepLinkActivity);
        if (this.write) {
            this.IconCompatParcelizer.subscribe(new write(hmlDocumentUploadGuidelineActivity, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver, this.read));
        } else {
            this.IconCompatParcelizer.subscribe(new C10091x408cb267(hmlDocumentUploadGuidelineActivity, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver, this.read));
        }
    }

    /* renamed from: o.onBtnEnterEmailVerificationClicked$read */
    static abstract class read<T> extends AtomicReference<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity, Runnable {
        final BankingAgentTransactionsDeepLinkActivity<? super T> IconCompatParcelizer;
        private AtomicReference<BulkTransferDeepLinkActivity> MediaBrowserCompat$CustomActionResultReceiver = new AtomicReference<>();
        private long MediaBrowserCompat$ItemReceiver;
        private BulkTransferDeepLinkActivity MediaBrowserCompat$MediaItem;
        private TimeUnit read;
        private BankingAgentDeepLinkActivity write;

        /* access modifiers changed from: package-private */
        public abstract void write();

        read(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
            this.IconCompatParcelizer = bankingAgentTransactionsDeepLinkActivity;
            this.MediaBrowserCompat$ItemReceiver = j;
            this.read = timeUnit;
            this.write = bankingAgentDeepLinkActivity;
        }

        public void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaBrowserCompat$MediaItem, bulkTransferDeepLinkActivity)) {
                this.MediaBrowserCompat$MediaItem = bulkTransferDeepLinkActivity;
                this.IconCompatParcelizer.onSubscribe(this);
                BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity = this.write;
                long j = this.MediaBrowserCompat$ItemReceiver;
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, bankingAgentDeepLinkActivity.write(this, j, j, this.read));
            }
        }

        public void onNext(T t) {
            lazySet(t);
        }

        public boolean isDisposed() {
            return this.MediaBrowserCompat$MediaItem.isDisposed();
        }

        public void dispose() {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaBrowserCompat$CustomActionResultReceiver);
            this.MediaBrowserCompat$MediaItem.dispose();
        }

        public void onComplete() {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaBrowserCompat$CustomActionResultReceiver);
            write();
        }

        public void onError(Throwable th) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaBrowserCompat$CustomActionResultReceiver);
            this.IconCompatParcelizer.onError(th);
        }
    }

    /* renamed from: o.onBtnEnterEmailVerificationClicked$write */
    static final class write<T> extends read<T> {
        private AtomicInteger write = new AtomicInteger(1);

        write(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
            super(bankingAgentTransactionsDeepLinkActivity, j, timeUnit, bankingAgentDeepLinkActivity);
        }

        public final void run() {
            if (this.write.incrementAndGet() == 2) {
                Object andSet = getAndSet((Object) null);
                if (andSet != null) {
                    this.IconCompatParcelizer.onNext(andSet);
                }
                if (this.write.decrementAndGet() == 0) {
                    this.IconCompatParcelizer.onComplete();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void write() {
            Object andSet = getAndSet((Object) null);
            if (andSet != null) {
                this.IconCompatParcelizer.onNext(andSet);
            }
            if (this.write.decrementAndGet() == 0) {
                this.IconCompatParcelizer.onComplete();
            }
        }
    }
}
